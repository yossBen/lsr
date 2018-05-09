
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchCriteriaSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCriteriaSorting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryListsSorting" type="{http://ws.mrted.com/}criteriaSortType" minOccurs="0"/>
 *         &lt;element name="customLovsSorting" type="{http://ws.mrted.com/}criteriaSortType" minOccurs="0"/>
 *         &lt;element name="standardLovsSorting" type="{http://ws.mrted.com/}criteriaSortType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCriteriaSorting", propOrder = {
    "categoryListsSorting",
    "customLovsSorting",
    "standardLovsSorting"
})
public class SearchCriteriaSorting {

    protected CriteriaSortType categoryListsSorting;
    protected CriteriaSortType customLovsSorting;
    protected CriteriaSortType standardLovsSorting;

    /**
     * Gets the value of the categoryListsSorting property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaSortType }
     *     
     */
    public CriteriaSortType getCategoryListsSorting() {
        return categoryListsSorting;
    }

    /**
     * Sets the value of the categoryListsSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaSortType }
     *     
     */
    public void setCategoryListsSorting(CriteriaSortType value) {
        this.categoryListsSorting = value;
    }

    /**
     * Gets the value of the customLovsSorting property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaSortType }
     *     
     */
    public CriteriaSortType getCustomLovsSorting() {
        return customLovsSorting;
    }

    /**
     * Sets the value of the customLovsSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaSortType }
     *     
     */
    public void setCustomLovsSorting(CriteriaSortType value) {
        this.customLovsSorting = value;
    }

    /**
     * Gets the value of the standardLovsSorting property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaSortType }
     *     
     */
    public CriteriaSortType getStandardLovsSorting() {
        return standardLovsSorting;
    }

    /**
     * Sets the value of the standardLovsSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaSortType }
     *     
     */
    public void setStandardLovsSorting(CriteriaSortType value) {
        this.standardLovsSorting = value;
    }

}
