
package com.mrted.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lovDescendantDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lovDescendantDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://ws.mrted.com/}dataType" minOccurs="0"/>
 *         &lt;element name="dataValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lovId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lovValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lovDescendantDto", propOrder = {
    "dataFormat",
    "dataType",
    "dataValue",
    "lovId",
    "lovName",
    "lovValue",
    "translation"
})
public class LovDescendantDto {

    protected String dataFormat;
    protected DataType dataType;
    protected BigDecimal dataValue;
    protected Long lovId;
    protected String lovName;
    protected String lovValue;
    protected String translation;

    /**
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormat(String value) {
        this.dataFormat = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dataValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDataValue() {
        return dataValue;
    }

    /**
     * Sets the value of the dataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDataValue(BigDecimal value) {
        this.dataValue = value;
    }

    /**
     * Gets the value of the lovId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLovId() {
        return lovId;
    }

    /**
     * Sets the value of the lovId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLovId(Long value) {
        this.lovId = value;
    }

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
     * Gets the value of the lovValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovValue() {
        return lovValue;
    }

    /**
     * Sets the value of the lovValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovValue(String value) {
        this.lovValue = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

}
