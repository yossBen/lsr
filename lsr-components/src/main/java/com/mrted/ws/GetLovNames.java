
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovNames complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovNames">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovTypeCategory" type="{http://ws.mrted.com/}lovTypeCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovNames", propOrder = {
    "lovTypeCategory"
})
public class GetLovNames {

    protected LovTypeCategory lovTypeCategory;

    /**
     * Gets the value of the lovTypeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link LovTypeCategory }
     *     
     */
    public LovTypeCategory getLovTypeCategory() {
        return lovTypeCategory;
    }

    /**
     * Sets the value of the lovTypeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovTypeCategory }
     *     
     */
    public void setLovTypeCategory(LovTypeCategory value) {
        this.lovTypeCategory = value;
    }

}
