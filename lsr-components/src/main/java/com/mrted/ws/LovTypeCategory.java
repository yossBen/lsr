
package com.mrted.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lovTypeCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lovTypeCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEMFIXED"/>
 *     &lt;enumeration value="SYSTEMCONFIGURABLE"/>
 *     &lt;enumeration value="CONFIGURABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lovTypeCategory")
@XmlEnum
public enum LovTypeCategory {

    SYSTEMFIXED,
    SYSTEMCONFIGURABLE,
    CONFIGURABLE;

    public String value() {
        return name();
    }

    public static LovTypeCategory fromValue(String v) {
        return valueOf(v);
    }

}
