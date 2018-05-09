
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advertisementResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advertisementResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advertisements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="advertisement" type="{http://ws.mrted.com/}advertisementDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advertisementResultDto", propOrder = {
    "advertisements",
    "totalResults"
})
public class AdvertisementResultDto {

    protected AdvertisementResultDto.Advertisements advertisements;
    protected Integer totalResults;

    /**
     * Gets the value of the advertisements property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementResultDto.Advertisements }
     *     
     */
    public AdvertisementResultDto.Advertisements getAdvertisements() {
        return advertisements;
    }

    /**
     * Sets the value of the advertisements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementResultDto.Advertisements }
     *     
     */
    public void setAdvertisements(AdvertisementResultDto.Advertisements value) {
        this.advertisements = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalResults(Integer value) {
        this.totalResults = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="advertisement" type="{http://ws.mrted.com/}advertisementDto" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advertisement"
    })
    public static class Advertisements {

        protected List<AdvertisementDto> advertisement;

        /**
         * Gets the value of the advertisement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the advertisement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdvertisement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdvertisementDto }
         * 
         * 
         */
        public List<AdvertisementDto> getAdvertisement() {
            if (advertisement == null) {
                advertisement = new ArrayList<AdvertisementDto>();
            }
            return this.advertisement;
        }

    }

}
