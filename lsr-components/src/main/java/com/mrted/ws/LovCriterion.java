
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lovCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lovCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}criterion">
 *       &lt;sequence>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parent" type="{http://ws.mrted.com/}criterion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="criteria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="criterion" type="{http://ws.mrted.com/}lovWithActivatorsCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lovCriterion", propOrder = {
    "order",
    "parents",
    "criteria"
})
public class LovCriterion
    extends Criterion
{

    protected Long order;
    protected LovCriterion.Parents parents;
    protected LovCriterion.Criteria criteria;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrder(Long value) {
        this.order = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     * @return
     *     possible object is
     *     {@link LovCriterion.Parents }
     *     
     */
    public LovCriterion.Parents getParents() {
        return parents;
    }

    /**
     * Sets the value of the parents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovCriterion.Parents }
     *     
     */
    public void setParents(LovCriterion.Parents value) {
        this.parents = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link LovCriterion.Criteria }
     *     
     */
    public LovCriterion.Criteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovCriterion.Criteria }
     *     
     */
    public void setCriteria(LovCriterion.Criteria value) {
        this.criteria = value;
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
     *         &lt;element name="criterion" type="{http://ws.mrted.com/}lovWithActivatorsCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "criterion"
    })
    public static class Criteria {

        protected List<LovWithActivatorsCriterion> criterion;

        /**
         * Gets the value of the criterion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criterion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriterion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LovWithActivatorsCriterion }
         * 
         * 
         */
        public List<LovWithActivatorsCriterion> getCriterion() {
            if (criterion == null) {
                criterion = new ArrayList<LovWithActivatorsCriterion>();
            }
            return this.criterion;
        }

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
     *         &lt;element name="parent" type="{http://ws.mrted.com/}criterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "parent"
    })
    public static class Parents {

        protected List<Criterion> parent;

        /**
         * Gets the value of the parent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Criterion }
         * 
         * 
         */
        public List<Criterion> getParent() {
            if (parent == null) {
                parent = new ArrayList<Criterion>();
            }
            return this.parent;
        }

    }

}
