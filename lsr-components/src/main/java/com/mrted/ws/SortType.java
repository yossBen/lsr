
package com.mrted.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ASCENDING"/>
 *     &lt;enumeration value="DESCENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sortType")
@XmlEnum
public enum SortType {

    NONE,
    ASCENDING,
    DESCENDING;

    public String value() {
        return name();
    }

    public static SortType fromValue(String v) {
        return valueOf(v);
    }

}
