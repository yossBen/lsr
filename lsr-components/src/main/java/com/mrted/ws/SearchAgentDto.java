
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchAgentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAgentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryFrequency" type="{http://ws.mrted.com/}deliveryFrequency" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="searchCriteria" type="{http://ws.mrted.com/}searchCriteriaDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAgentDto", propOrder = {
    "deliveryFrequency",
    "email",
    "expirationDate",
    "searchCriteria"
})
@XmlSeeAlso({
    SearchAgentDetails.class
})
public class SearchAgentDto {

    protected DeliveryFrequency deliveryFrequency;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected SearchCriteriaDto searchCriteria;

    /**
     * Gets the value of the deliveryFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryFrequency }
     *     
     */
    public DeliveryFrequency getDeliveryFrequency() {
        return deliveryFrequency;
    }

    /**
     * Sets the value of the deliveryFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryFrequency }
     *     
     */
    public void setDeliveryFrequency(DeliveryFrequency value) {
        this.deliveryFrequency = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto }
     *     
     */
    public SearchCriteriaDto getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto }
     *     
     */
    public void setSearchCriteria(SearchCriteriaDto value) {
        this.searchCriteria = value;
    }

}
