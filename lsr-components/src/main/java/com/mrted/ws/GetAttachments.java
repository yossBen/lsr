
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAttachments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAttachments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postingTargetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAttachments", propOrder = {
    "postingTargetId"
})
public class GetAttachments {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long postingTargetId;

    /**
     * Gets the value of the postingTargetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostingTargetId() {
        return postingTargetId;
    }

    /**
     * Sets the value of the postingTargetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostingTargetId(Long value) {
        this.postingTargetId = value;
    }

}
