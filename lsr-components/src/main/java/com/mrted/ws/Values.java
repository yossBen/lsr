
package com.mrted.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for values.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="values">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Header1"/>
 *     &lt;enumeration value="Header2"/>
 *     &lt;enumeration value="TopOfJobDescription"/>
 *     &lt;enumeration value="Bottom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "values")
@XmlEnum
public enum Values {

    @XmlEnumValue("Header1")
    HEADER_1("Header1"),
    @XmlEnumValue("Header2")
    HEADER_2("Header2"),
    @XmlEnumValue("TopOfJobDescription")
    TOP_OF_JOB_DESCRIPTION("TopOfJobDescription"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom");
    private final String value;

    Values(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Values fromValue(String v) {
        for (Values c: Values.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
