// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.abecerra.pvt_ephemeris_client.suplclient.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Boolean;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Integer;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Object;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Sequence;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Tag;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStream;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStreamReader;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class WLAN_MeasurementElement_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WLAN_MeasurementElement_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WLAN_MeasurementElement_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WLAN_MeasurementElement_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WLAN_MeasurementElement_r13 != null) {
      return ImmutableList.of(TAG_WLAN_MeasurementElement_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WLAN_MeasurementElement_r13 from encoded stream.
   */
  public static WLAN_MeasurementElement_r13 fromPerUnaligned(byte[] encodedBytes) {
    WLAN_MeasurementElement_r13 result = new WLAN_MeasurementElement_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WLAN_MeasurementElement_r13 from encoded stream.
   */
  public static WLAN_MeasurementElement_r13 fromPerAligned(byte[] encodedBytes) {
    WLAN_MeasurementElement_r13 result = new WLAN_MeasurementElement_r13();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private WLAN_AP_Identifier_r13 wlan_AP_Identifier_r13_;
  public WLAN_AP_Identifier_r13 getWlan_AP_Identifier_r13() {
    return wlan_AP_Identifier_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_AP_Identifier_r13
   */
  public void setWlan_AP_Identifier_r13(Asn1Object value) {
    this.wlan_AP_Identifier_r13_ = (WLAN_AP_Identifier_r13) value;
  }
  public WLAN_AP_Identifier_r13 setWlan_AP_Identifier_r13ToNewInstance() {
    wlan_AP_Identifier_r13_ = new WLAN_AP_Identifier_r13();
    return wlan_AP_Identifier_r13_;
  }
  
  private WLAN_MeasurementElement_r13.rssi_r13Type rssi_r13_;
  public WLAN_MeasurementElement_r13.rssi_r13Type getRssi_r13() {
    return rssi_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_MeasurementElement_r13.rssi_r13Type
   */
  public void setRssi_r13(Asn1Object value) {
    this.rssi_r13_ = (WLAN_MeasurementElement_r13.rssi_r13Type) value;
  }
  public WLAN_MeasurementElement_r13.rssi_r13Type setRssi_r13ToNewInstance() {
    rssi_r13_ = new WLAN_MeasurementElement_r13.rssi_r13Type();
    return rssi_r13_;
  }
  
  private WLAN_RTT_r13 rtt_r13_;
  public WLAN_RTT_r13 getRtt_r13() {
    return rtt_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_RTT_r13
   */
  public void setRtt_r13(Asn1Object value) {
    this.rtt_r13_ = (WLAN_RTT_r13) value;
  }
  public WLAN_RTT_r13 setRtt_r13ToNewInstance() {
    rtt_r13_ = new WLAN_RTT_r13();
    return rtt_r13_;
  }
  
  private WLAN_MeasurementElement_r13.apChannelFrequencyType apChannelFrequency_;
  public WLAN_MeasurementElement_r13.apChannelFrequencyType getApChannelFrequency() {
    return apChannelFrequency_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_MeasurementElement_r13.apChannelFrequencyType
   */
  public void setApChannelFrequency(Asn1Object value) {
    this.apChannelFrequency_ = (WLAN_MeasurementElement_r13.apChannelFrequencyType) value;
  }
  public WLAN_MeasurementElement_r13.apChannelFrequencyType setApChannelFrequencyToNewInstance() {
    apChannelFrequency_ = new WLAN_MeasurementElement_r13.apChannelFrequencyType();
    return apChannelFrequency_;
  }
  
  private WLAN_MeasurementElement_r13.servingFlagType servingFlag_;
  public WLAN_MeasurementElement_r13.servingFlagType getServingFlag() {
    return servingFlag_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_MeasurementElement_r13.servingFlagType
   */
  public void setServingFlag(Asn1Object value) {
    this.servingFlag_ = (WLAN_MeasurementElement_r13.servingFlagType) value;
  }
  public WLAN_MeasurementElement_r13.servingFlagType setServingFlagToNewInstance() {
    servingFlag_ = new WLAN_MeasurementElement_r13.servingFlagType();
    return servingFlag_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getWlan_AP_Identifier_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getWlan_AP_Identifier_r13();
          }

          @Override public void setToNewInstance() {
            setWlan_AP_Identifier_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_AP_Identifier_r13.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "wlan_AP_Identifier_r13 : "
                    + getWlan_AP_Identifier_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRssi_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRssi_r13();
          }

          @Override public void setToNewInstance() {
            setRssi_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_MeasurementElement_r13.rssi_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "rssi_r13 : "
                    + getRssi_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRtt_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRtt_r13();
          }

          @Override public void setToNewInstance() {
            setRtt_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_RTT_r13.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "rtt_r13 : "
                    + getRtt_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getApChannelFrequency() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getApChannelFrequency();
          }

          @Override public void setToNewInstance() {
            setApChannelFrequencyToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_MeasurementElement_r13.apChannelFrequencyType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "apChannelFrequency : "
                    + getApChannelFrequency().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getServingFlag() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getServingFlag();
          }

          @Override public void setToNewInstance() {
            setServingFlagToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_MeasurementElement_r13.servingFlagType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "servingFlag : "
                    + getServingFlag().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class rssi_r13Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_rssi_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public rssi_r13Type() {
    super();
    setValueRange(new java.math.BigInteger("-127"), new java.math.BigInteger("128"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_rssi_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_rssi_r13Type != null) {
      return ImmutableList.of(TAG_rssi_r13Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new rssi_r13Type from encoded stream.
   */
  public static rssi_r13Type fromPerUnaligned(byte[] encodedBytes) {
    rssi_r13Type result = new rssi_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new rssi_r13Type from encoded stream.
   */
  public static rssi_r13Type fromPerAligned(byte[] encodedBytes) {
    rssi_r13Type result = new rssi_r13Type();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "rssi_r13Type = " + getInteger() + ";\n";
  }
}

  
  
  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class apChannelFrequencyType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_apChannelFrequencyType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public apChannelFrequencyType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("256"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_apChannelFrequencyType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_apChannelFrequencyType != null) {
      return ImmutableList.of(TAG_apChannelFrequencyType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new apChannelFrequencyType from encoded stream.
   */
  public static apChannelFrequencyType fromPerUnaligned(byte[] encodedBytes) {
    apChannelFrequencyType result = new apChannelFrequencyType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new apChannelFrequencyType from encoded stream.
   */
  public static apChannelFrequencyType fromPerAligned(byte[] encodedBytes) {
    apChannelFrequencyType result = new apChannelFrequencyType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "apChannelFrequencyType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class servingFlagType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_servingFlagType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public servingFlagType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_servingFlagType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_servingFlagType != null) {
      return ImmutableList.of(TAG_servingFlagType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new servingFlagType from encoded stream.
   */
  public static servingFlagType fromPerUnaligned(byte[] encodedBytes) {
    servingFlagType result = new servingFlagType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new servingFlagType from encoded stream.
   */
  public static servingFlagType fromPerAligned(byte[] encodedBytes) {
    servingFlagType result = new servingFlagType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "servingFlagType = " + getValue() + ";\n";
  }
}

  

    

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("WLAN_MeasurementElement_r13 = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
