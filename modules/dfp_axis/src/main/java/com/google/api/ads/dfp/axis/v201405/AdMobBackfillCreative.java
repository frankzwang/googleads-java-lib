/**
 * AdMobBackfillCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * An AdMob backfill creative.
 */
public class AdMobBackfillCreative  extends com.google.api.ads.dfp.axis.v201405.BaseDynamicAllocationCreative  implements java.io.Serializable {
    private java.lang.String additionalParameters;

    private java.lang.String publisherId;

    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.dfp.axis.v201405.LockedOrientation lockedOrientation;

    public AdMobBackfillCreative() {
    }

    public AdMobBackfillCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201405.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201405.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201405.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201405.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String additionalParameters,
           java.lang.String publisherId,
           com.google.api.ads.dfp.axis.v201405.LockedOrientation lockedOrientation) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType);
        this.additionalParameters = additionalParameters;
        this.publisherId = publisherId;
        this.lockedOrientation = lockedOrientation;
    }


    /**
     * Gets the additionalParameters value for this AdMobBackfillCreative.
     * 
     * @return additionalParameters
     */
    public java.lang.String getAdditionalParameters() {
        return additionalParameters;
    }


    /**
     * Sets the additionalParameters value for this AdMobBackfillCreative.
     * 
     * @param additionalParameters
     */
    public void setAdditionalParameters(java.lang.String additionalParameters) {
        this.additionalParameters = additionalParameters;
    }


    /**
     * Gets the publisherId value for this AdMobBackfillCreative.
     * 
     * @return publisherId
     */
    public java.lang.String getPublisherId() {
        return publisherId;
    }


    /**
     * Sets the publisherId value for this AdMobBackfillCreative.
     * 
     * @param publisherId
     */
    public void setPublisherId(java.lang.String publisherId) {
        this.publisherId = publisherId;
    }


    /**
     * Gets the lockedOrientation value for this AdMobBackfillCreative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.dfp.axis.v201405.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this AdMobBackfillCreative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.dfp.axis.v201405.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdMobBackfillCreative)) return false;
        AdMobBackfillCreative other = (AdMobBackfillCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additionalParameters==null && other.getAdditionalParameters()==null) || 
             (this.additionalParameters!=null &&
              this.additionalParameters.equals(other.getAdditionalParameters()))) &&
            ((this.publisherId==null && other.getPublisherId()==null) || 
             (this.publisherId!=null &&
              this.publisherId.equals(other.getPublisherId()))) &&
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdditionalParameters() != null) {
            _hashCode += getAdditionalParameters().hashCode();
        }
        if (getPublisherId() != null) {
            _hashCode += getPublisherId().hashCode();
        }
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdMobBackfillCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "AdMobBackfillCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "additionalParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "publisherId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "lockedOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "LockedOrientation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
