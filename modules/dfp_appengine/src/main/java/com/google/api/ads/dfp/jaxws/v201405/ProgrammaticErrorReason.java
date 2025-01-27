
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgrammaticError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgrammaticError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUDIENCE_EXTENSION_NOT_SUPPORTED"/>
 *     &lt;enumeration value="VIDEO_NOT_SUPPORTED"/>
 *     &lt;enumeration value="ROADBLOCKING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="SIZE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CANNOT_UPDATE_FIELD_FOR_APPROVED_LINE_ITEMS"/>
 *     &lt;enumeration value="CANNOT_CREATE_LINE_ITEM_FOR_APPROVED_ORDER"/>
 *     &lt;enumeration value="CANNOT_UPDATE_BACKFILL_WEB_PROPERTY_FOR_APPROVED_LINE_ITEMS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgrammaticError.Reason")
@XmlEnum
public enum ProgrammaticErrorReason {


    /**
     * 
     *                 Audience extension is not supported by programmatic line items
     *               
     * 
     */
    AUDIENCE_EXTENSION_NOT_SUPPORTED,

    /**
     * 
     *                 Video is currently not supported
     *               
     * 
     */
    VIDEO_NOT_SUPPORTED,

    /**
     * 
     *                 Roadblocking is not supported by programmatic line items
     *               
     * 
     */
    ROADBLOCKING_NOT_SUPPORTED,

    /**
     * 
     *                 Programmatic line items do not support {@link CreativeRotationType#SEQUENTIAL}.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION,

    /**
     * 
     *                 Programmatic line items only support {@link LineItemType#STANDARD}.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE,

    /**
     * 
     *                 Programmatic line items only support a creative size that is supported by AdX.
     *                 The list of supported sizes is maintained based on the list published in the help docs:
     *                 <a href="https://support.google.com/adxseller/answer/1100453">
     *                 https://support.google.com/adxseller/answer/1100453</a>
     *               
     * 
     */
    SIZE_NOT_SUPPORTED,

    /**
     * 
     *                 Some fields cannot be updated on approved line items.
     *               
     * 
     */
    CANNOT_UPDATE_FIELD_FOR_APPROVED_LINE_ITEMS,

    /**
     * 
     *                 Creating a new line item in an approved order is not allowed.
     *               
     * 
     */
    CANNOT_CREATE_LINE_ITEM_FOR_APPROVED_ORDER,

    /**
     * 
     *                 Cannot change backfill web property for a programmatic line item whose order has been
     *                 approved.
     *               
     * 
     */
    CANNOT_UPDATE_BACKFILL_WEB_PROPERTY_FOR_APPROVED_LINE_ITEMS,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ProgrammaticErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
