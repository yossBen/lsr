
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCriteriaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCriteriaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardCriteriaWithLovs" type="{http://ws.mrted.com/}availableSearchCriteriaDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCriteriaResponse", propOrder = {
    "standardCriteriaWithLovs"
})
public class GetCriteriaResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected AvailableSearchCriteriaDto standardCriteriaWithLovs;

    /**
     * Gets the value of the standardCriteriaWithLovs property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto }
     *     
     */
    public AvailableSearchCriteriaDto getStandardCriteriaWithLovs() {
        return standardCriteriaWithLovs;
    }

    /**
     * Sets the value of the standardCriteriaWithLovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto }
     *     
     */
    public void setStandardCriteriaWithLovs(AvailableSearchCriteriaDto value) {
        this.standardCriteriaWithLovs = value;
    }

}
