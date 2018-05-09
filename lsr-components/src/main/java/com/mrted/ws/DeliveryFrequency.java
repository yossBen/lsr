
package com.mrted.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deliveryFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONCE_A_DAY"/>
 *     &lt;enumeration value="ONCE_A_WEEK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deliveryFrequency")
@XmlEnum
public enum DeliveryFrequency {

    ONCE_A_DAY,
    ONCE_A_WEEK;

    public String value() {
        return name();
    }

    public static DeliveryFrequency fromValue(String v) {
        return valueOf(v);
    }

}
