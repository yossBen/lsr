
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovWithValuesByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovWithValuesByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="langCode" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovWithValuesByName", propOrder = {
    "lovName",
    "langCode"
})
public class GetLovWithValuesByName {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String lovName;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LangCode langCode;

    /**
     * Gets the value of the lovName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovName() {
        return lovName;
    }

    /**
     * Sets the value of the lovName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovName(String value) {
        this.lovName = value;
    }

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

}
