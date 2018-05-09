
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for update complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="update">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}searchAgentDto" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="language" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update", propOrder = {
    "searchAgentDto",
    "token",
    "language"
})
public class Update {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected SearchAgentDto searchAgentDto;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String token;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LangCode language;

    /**
     * Gets the value of the searchAgentDto property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAgentDto }
     *     
     */
    public SearchAgentDto getSearchAgentDto() {
        return searchAgentDto;
    }

    /**
     * Sets the value of the searchAgentDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAgentDto }
     *     
     */
    public void setSearchAgentDto(SearchAgentDto value) {
        this.searchAgentDto = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LangCode }
     *     
     */
    public LangCode getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangCode }
     *     
     */
    public void setLanguage(LangCode value) {
        this.language = value;
    }

}
