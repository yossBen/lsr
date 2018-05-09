
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStandardCriteriaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStandardCriteriaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardCriteria" type="{http://ws.mrted.com/}availableSearchCriteriaDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStandardCriteriaResponse", propOrder = {
    "standardCriteria"
})
public class GetStandardCriteriaResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected AvailableSearchCriteriaDto standardCriteria;

    /**
     * Gets the value of the standardCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto }
     *     
     */
    public AvailableSearchCriteriaDto getStandardCriteria() {
        return standardCriteria;
    }

    /**
     * Sets the value of the standardCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto }
     *     
     */
    public void setStandardCriteria(AvailableSearchCriteriaDto value) {
        this.standardCriteria = value;
    }

}
