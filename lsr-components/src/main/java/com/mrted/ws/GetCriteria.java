
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="langCode" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://ws.mrted.com/}searchCriteriaSorting" minOccurs="0"/>
 *         &lt;element name="lovOrders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCriteria", propOrder = {
    "langCode",
    "searchCriteriaSorting",
    "lovOrders"
})
public class GetCriteria {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LangCode langCode;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected SearchCriteriaSorting searchCriteriaSorting;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String lovOrders;

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link LangCode }
     *     
     */
    public LangCode getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangCode }
     *     
     */
    public void setLangCode(LangCode value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the searchCriteriaSorting property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaSorting }
     *     
     */
    public SearchCriteriaSorting getSearchCriteriaSorting() {
        return searchCriteriaSorting;
    }

    /**
     * Sets the value of the searchCriteriaSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaSorting }
     *     
     */
    public void setSearchCriteriaSorting(SearchCriteriaSorting value) {
        this.searchCriteriaSorting = value;
    }

    /**
     * Gets the value of the lovOrders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovOrders() {
        return lovOrders;
    }

    /**
     * Sets the value of the lovOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovOrders(String value) {
        this.lovOrders = value;
    }

}
