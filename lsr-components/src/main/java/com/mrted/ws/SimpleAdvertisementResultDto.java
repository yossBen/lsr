
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleAdvertisementResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleAdvertisementResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simpleAdvertisements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="simpleAdvertisement" type="{http://ws.mrted.com/}simpleAdvertisementDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "simpleAdvertisementResultDto", propOrder = {
    "simpleAdvertisements",
    "totalResults"
})
public class SimpleAdvertisementResultDto {

    protected SimpleAdvertisementResultDto.SimpleAdvertisements simpleAdvertisements;
    protected Integer totalResults;

    /**
     * Gets the value of the simpleAdvertisements property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAdvertisementResultDto.SimpleAdvertisements }
     *     
     */
    public SimpleAdvertisementResultDto.SimpleAdvertisements getSimpleAdvertisements() {
        return simpleAdvertisements;
    }

    /**
     * Sets the value of the simpleAdvertisements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAdvertisementResultDto.SimpleAdvertisements }
     *     
     */
    public void setSimpleAdvertisements(SimpleAdvertisementResultDto.SimpleAdvertisements value) {
        this.simpleAdvertisements = value;
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
     *         &lt;element name="simpleAdvertisement" type="{http://ws.mrted.com/}simpleAdvertisementDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "simpleAdvertisement"
    })
    public static class SimpleAdvertisements {

        protected List<SimpleAdvertisementDto> simpleAdvertisement;

        /**
         * Gets the value of the simpleAdvertisement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the simpleAdvertisement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimpleAdvertisement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleAdvertisementDto }
         * 
         * 
         */
        public List<SimpleAdvertisementDto> getSimpleAdvertisement() {
            if (simpleAdvertisement == null) {
                simpleAdvertisement = new ArrayList<SimpleAdvertisementDto>();
            }
            return this.simpleAdvertisement;
        }

    }

}
