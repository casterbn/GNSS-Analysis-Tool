package com.abecerra.pvt_acquisition.domain.input

import android.location.GnssMeasurementsEvent
import android.location.GnssStatus
import com.abecerra.pvt_acquisition.app.extensions.subscribe
import com.abecerra.pvt_acquisition.data.GnssComputationData
import com.abecerra.pvt_acquisition.data.mapper.PvtInputDataMapper
import com.abecerra.pvt_acquisition.domain.acquisition.EpochAcquisitionDataBuilder.mapToEpoch
import com.abecerra.pvt_computation.data.LlaLocation
import com.abecerra.pvt_computation.data.Location
import com.abecerra.pvt_computation.data.input.ComputationSettings
import com.abecerra.pvt_computation.domain.computation.PvtComputationInteractor
import com.abecerra.pvt_computation.domain.computation.utils.CoordinatesConverter.lla2ecef
import com.abecerra.pvt_ephemeris_client.suplclient.EphemerisClient
import com.abecerra.pvt_ephemeris_client.suplclient.data.EphLocation
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import java.util.*

class GnssServiceInteractorImpl(
    private val ephemerisClient: EphemerisClient,
    private val pvtComputationInteractor: PvtComputationInteractor
) : GnssServiceContract.GnssServiceInteractor {

    private var mListener: GnssServiceContract.GnssInteractorOutput? = null

    private var gnssComputationData = GnssComputationData()

    override fun bindOutput(output: GnssServiceContract.GnssInteractorOutput) {
        this.mListener = output
    }

    override fun startComputing(
        computationSettings: List<ComputationSettings>, referenceLocation: LlaLocation
    ): Single<String> {

        gnssComputationData.refLocation = Location(referenceLocation, lla2ecef(referenceLocation))

        return Single.create { emitter ->
            ephemerisClient.getEphemerisData(
                EphLocation(referenceLocation.latitude, referenceLocation.longitude)
            ).subscribe({
            }, {
                gnssComputationData.ephemerisResponse = it
                gnssComputationData.startedComputingDate = Date()
                gnssComputationData.computationSettings = computationSettings

                emitter.onSuccess("")
            }, {
                emitter.onError(Throwable())
            }, CompositeDisposable())
        }
    }

    override fun stopComputing() {
        gnssComputationData = GnssComputationData()
    }

    override fun setStatus(gnssStatus: GnssStatus) {
        gnssComputationData.gnssStatus = gnssStatus
    }

    override fun setMeasurement(measurementsEvent: GnssMeasurementsEvent) {
        gnssComputationData.ephemerisResponse?.let { ephemeris ->
            gnssComputationData.gnssStatus?.let { status ->

                val epoch = mapToEpoch(measurementsEvent, status, ephemeris)
                gnssComputationData.epochs.add(epoch)

                computePvt()
            }
        }
    }

    private fun computePvt() {
        if (isMeanTimePassed()) {
            val pvtInputData = PvtInputDataMapper.mapToPvtInputData(gnssComputationData)

            val response = pvtComputationInteractor.computePosition(pvtInputData)
            mListener?.onPvtResponse(response)

            resetGnssComputationData()
        }
    }

    private fun resetGnssComputationData() {
        gnssComputationData.epochs.clear()
        gnssComputationData.startedComputingDate = Date()
    }

    private fun isMeanTimePassed() =
        Date().time - gnssComputationData.startedComputingDate.time > 0L
}
