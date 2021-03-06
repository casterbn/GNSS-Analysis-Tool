package com.abecerra.gnssanalysis.presentation.ui.statistics

import com.abecerra.gnssanalysis.app.base.BaseFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abecerra.gnssanalysis.R

abstract class BaseGraphFragment : BaseFragment() {

    abstract fun getGraphInformation(): String

    abstract fun setGraph(view: View)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_graph, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setGraph(view)
    }
}
