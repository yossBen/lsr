
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}criterion">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="suborganizations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organization" type="{http://ws.mrted.com/}organizationCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "organizationCriterion", propOrder = {
    "level",
    "suborganizations"
})
public class OrganizationCriterion
    extends Criterion
{

    protected Long level;
    protected OrganizationCriterion.Suborganizations suborganizations;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLevel(Long value) {
        this.level = value;
    }

    /**
     * Gets the value of the suborganizations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationCriterion.Suborganizations }
     *     
     */
    public OrganizationCriterion.Suborganizations getSuborganizations() {
        return suborganizations;
    }

    /**
     * Sets the value of the suborganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationCriterion.Suborganizations }
     *     
     */
    public void setSuborganizations(OrganizationCriterion.Suborganizations value) {
        this.suborganizations = value;
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
     *         &lt;element name="organization" type="{http://ws.mrted.com/}organizationCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "organization"
    })
    public static class Suborganizations {

        protected List<OrganizationCriterion> organization;

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationCriterion }
         * 
         * 
         */
        public List<OrganizationCriterion> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<OrganizationCriterion>();
            }
            return this.organization;
        }

    }

}
