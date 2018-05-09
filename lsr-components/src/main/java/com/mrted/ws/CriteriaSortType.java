
package com.mrted.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for criteriaSortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="criteriaSortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LABEL"/>
 *     &lt;enumeration value="ORDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "criteriaSortType")
@XmlEnum
public enum CriteriaSortType {

    LABEL,
    ORDER;

    public String value() {
        return name();
    }

    public static CriteriaSortType fromValue(String v) {
        return valueOf(v);
    }

}
