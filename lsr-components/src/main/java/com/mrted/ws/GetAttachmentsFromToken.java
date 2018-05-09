
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAttachmentsFromToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAttachmentsFromToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAttachmentsFromToken", propOrder = {
    "tokenString"
})
public class GetAttachmentsFromToken {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String tokenString;

    /**
     * Gets the value of the tokenString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenString() {
        return tokenString;
    }

    /**
     * Sets the value of the tokenString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenString(String value) {
        this.tokenString = value;
    }

}
