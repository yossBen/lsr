
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAdvertisementByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAdvertisementByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advertisement" type="{http://ws.mrted.com/}advertisementDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAdvertisementByIdResponse", propOrder = {
    "advertisement"
})
public class GetAdvertisementByIdResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected AdvertisementDto advertisement;

    /**
     * Gets the value of the advertisement property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto }
     *     
     */
    public AdvertisementDto getAdvertisement() {
        return advertisement;
    }

    /**
     * Sets the value of the advertisement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto }
     *     
     */
    public void setAdvertisement(AdvertisementDto value) {
        this.advertisement = value;
    }

}
