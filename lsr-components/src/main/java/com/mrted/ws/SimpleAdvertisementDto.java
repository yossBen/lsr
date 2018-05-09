
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleAdvertisementDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleAdvertisementDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requisitionInternalJobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleAdvertisementDto", propOrder = {
    "id",
    "jobTitle",
    "requisitionInternalJobNumber"
})
public class SimpleAdvertisementDto {

    protected Long id;
    protected String jobTitle;
    protected String requisitionInternalJobNumber;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the requisitionInternalJobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitionInternalJobNumber() {
        return requisitionInternalJobNumber;
    }

    /**
     * Sets the value of the requisitionInternalJobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitionInternalJobNumber(String value) {
        this.requisitionInternalJobNumber = value;
    }

}
