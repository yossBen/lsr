
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimpleAdvertisementsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSimpleAdvertisementsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}simpleAdvertisementResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimpleAdvertisementsResponse", propOrder = {
    "simpleAdvertisementResult"
})
public class GetSimpleAdvertisementsResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected SimpleAdvertisementResultDto simpleAdvertisementResult;

    /**
     * Gets the value of the simpleAdvertisementResult property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAdvertisementResultDto }
     *     
     */
    public SimpleAdvertisementResultDto getSimpleAdvertisementResult() {
        return simpleAdvertisementResult;
    }

    /**
     * Sets the value of the simpleAdvertisementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAdvertisementResultDto }
     *     
     */
    public void setSimpleAdvertisementResult(SimpleAdvertisementResultDto value) {
        this.simpleAdvertisementResult = value;
    }

}
