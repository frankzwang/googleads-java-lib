
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTRIBUTE_NAMES_NOT_UNIQUE"/>
 *     &lt;enumeration value="ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES"/>
 *     &lt;enumeration value="CANNOT_CHANGE_FEED_NAME"/>
 *     &lt;enumeration value="CANNOT_CHANGE_ORIGIN"/>
 *     &lt;enumeration value="FEED_DELETED"/>
 *     &lt;enumeration value="FEED_ORIGIN_IS_NOT_USER"/>
 *     &lt;enumeration value="NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY"/>
 *     &lt;enumeration value="TOO_MANY_FEED_ATTRIBUTES_FOR_FEED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedError.Reason")
@XmlEnum
public enum FeedErrorReason {


    /**
     * 
     *                 The names of the FeedAttributes must be unique.
     *               
     * 
     */
    ATTRIBUTE_NAMES_NOT_UNIQUE,

    /**
     * 
     *                 The attribute list must be an exact copy of the existing list if the attribute id's are
     *                 present.
     *               
     * 
     */
    ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES,

    /**
     * 
     *                 A Feed's name can only be set during Feed creation.
     *               
     * 
     */
    CANNOT_CHANGE_FEED_NAME,

    /**
     * 
     *                 Origin can only be set during Feed creation.
     *               
     * 
     */
    CANNOT_CHANGE_ORIGIN,

    /**
     * 
     *                 The given id refers to a removed Feed. Removed Feeds are immutable.
     *               
     * 
     */
    FEED_DELETED,

    /**
     * 
     *                 A user can only create and modify feeds with user origin.
     *               
     * 
     */
    FEED_ORIGIN_IS_NOT_USER,

    /**
     * 
     *                 New FeedAttributes must not effect the unique key.
     *               
     * 
     */
    NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY,

    /**
     * 
     *                 Too many FeedAttributes for a Feed.
     *               
     * 
     */
    TOO_MANY_FEED_ATTRIBUTES_FOR_FEED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FeedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
