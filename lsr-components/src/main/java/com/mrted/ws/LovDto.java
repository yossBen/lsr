
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lovDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lovDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lovId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lovChildren" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lovChild" type="{http://ws.mrted.com/}lovDescendantDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lovDto", propOrder = {
    "lovName",
    "lovId",
    "order",
    "lovChildren"
})
public class LovDto {

    protected String lovName;
    protected Long lovId;
    protected Integer order;
    protected LovDto.LovChildren lovChildren;

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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * Gets the value of the lovChildren property.
     * 
     * @return
     *     possible object is
     *     {@link LovDto.LovChildren }
     *     
     */
    public LovDto.LovChildren getLovChildren() {
        return lovChildren;
    }

    /**
     * Sets the value of the lovChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovDto.LovChildren }
     *     
     */
    public void setLovChildren(LovDto.LovChildren value) {
        this.lovChildren = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lovChild" type="{http://ws.mrted.com/}lovDescendantDto" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lovChild"
    })
    public static class LovChildren {

        protected List<LovDescendantDto> lovChild;

        /**
         * Gets the value of the lovChild property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lovChild property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLovChild().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LovDescendantDto }
         * 
         * 
         */
        public List<LovDescendantDto> getLovChild() {
            if (lovChild == null) {
                lovChild = new ArrayList<LovDescendantDto>();
            }
            return this.lovChild;
        }

    }

}
