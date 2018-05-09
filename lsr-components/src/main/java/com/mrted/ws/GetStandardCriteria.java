
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStandardCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStandardCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="langCode" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://ws.mrted.com/}searchCriteriaSorting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStandardCriteria", propOrder = {
    "langCode",
    "searchCriteriaSorting"
})
public class GetStandardCriteria {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LangCode langCode;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected SearchCriteriaSorting searchCriteriaSorting;

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

}
