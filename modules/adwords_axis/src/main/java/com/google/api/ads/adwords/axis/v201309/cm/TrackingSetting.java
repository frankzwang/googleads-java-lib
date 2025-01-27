/**
 * TrackingSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Campaign level settings for tracking information.
 */
public class TrackingSetting  extends com.google.api.ads.adwords.axis.v201309.cm.Setting  implements java.io.Serializable {
    /* The url used for dynamic tracking.  For more information, see
     * the
     *                     article <a href="https://support.google.com/adwords/answer/2549100?hl=en"/>
     * Specify "NONE" to clear existing url.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String trackingUrl;

    public TrackingSetting() {
    }

    public TrackingSetting(
           java.lang.String settingType,
           java.lang.String trackingUrl) {
        super(
            settingType);
        this.trackingUrl = trackingUrl;
    }


    /**
     * Gets the trackingUrl value for this TrackingSetting.
     * 
     * @return trackingUrl   * The url used for dynamic tracking.  For more information, see
     * the
     *                     article <a href="https://support.google.com/adwords/answer/2549100?hl=en"/>
     * Specify "NONE" to clear existing url.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getTrackingUrl() {
        return trackingUrl;
    }


    /**
     * Sets the trackingUrl value for this TrackingSetting.
     * 
     * @param trackingUrl   * The url used for dynamic tracking.  For more information, see
     * the
     *                     article <a href="https://support.google.com/adwords/answer/2549100?hl=en"/>
     * Specify "NONE" to clear existing url.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setTrackingUrl(java.lang.String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingSetting)) return false;
        TrackingSetting other = (TrackingSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.trackingUrl==null && other.getTrackingUrl()==null) || 
             (this.trackingUrl!=null &&
              this.trackingUrl.equals(other.getTrackingUrl())));
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
        if (getTrackingUrl() != null) {
            _hashCode += getTrackingUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackingSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "TrackingSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "trackingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
