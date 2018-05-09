
package com.mrted.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAdvertisementById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAdvertisementById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postingTargetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="langCode" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *         &lt;element name="showImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAdvertisementById", propOrder = {
    "postingTargetId",
    "langCode",
    "showImages"
})
public class GetAdvertisementById {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long postingTargetId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LangCode langCode;
    @XmlElementRef(name = "showImages", namespace = "http://ws.mrted.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showImages;

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
     * Gets the value of the showImages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowImages() {
        return showImages;
    }

    /**
     * Sets the value of the showImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowImages(JAXBElement<Boolean> value) {
        this.showImages = value;
    }

}
