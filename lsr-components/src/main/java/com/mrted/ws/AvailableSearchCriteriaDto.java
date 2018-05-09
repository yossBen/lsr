
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for availableSearchCriteriaDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availableSearchCriteriaDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adLanguages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="language" type="{http://ws.mrted.com/}criterion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="categoryLists">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="categoryList" type="{http://ws.mrted.com/}categoryListCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="countries">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="country" type="{http://ws.mrted.com/}countryCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customlovs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customLov" type="{http://ws.mrted.com/}lovCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizations">
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
 *         &lt;element name="postedSince" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="standardLovs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="standardLov" type="{http://ws.mrted.com/}lovCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "availableSearchCriteriaDto", propOrder = {
    "adLanguages",
    "categoryLists",
    "countries",
    "customlovs",
    "jobNumber",
    "keywords",
    "organizations",
    "postedSince",
    "standardLovs"
})
public class AvailableSearchCriteriaDto {

    @XmlElement(required = true)
    protected AvailableSearchCriteriaDto.AdLanguages adLanguages;
    @XmlElement(required = true)
    protected AvailableSearchCriteriaDto.CategoryLists categoryLists;
    @XmlElement(required = true)
    protected AvailableSearchCriteriaDto.Countries countries;
    @XmlElement(required = true)
    protected AvailableSearchCriteriaDto.Customlovs customlovs;
    protected String jobNumber;
    protected String keywords;
    @XmlElement(required = true)
    protected AvailableSearchCriteriaDto.Organizations organizations;
    protected Integer postedSince;
    @XmlElement(required = true)
    protected AvailableSearchCriteriaDto.StandardLovs standardLovs;

    /**
     * Gets the value of the adLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto.AdLanguages }
     *     
     */
    public AvailableSearchCriteriaDto.AdLanguages getAdLanguages() {
        return adLanguages;
    }

    /**
     * Sets the value of the adLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto.AdLanguages }
     *     
     */
    public void setAdLanguages(AvailableSearchCriteriaDto.AdLanguages value) {
        this.adLanguages = value;
    }

    /**
     * Gets the value of the categoryLists property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto.CategoryLists }
     *     
     */
    public AvailableSearchCriteriaDto.CategoryLists getCategoryLists() {
        return categoryLists;
    }

    /**
     * Sets the value of the categoryLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto.CategoryLists }
     *     
     */
    public void setCategoryLists(AvailableSearchCriteriaDto.CategoryLists value) {
        this.categoryLists = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto.Countries }
     *     
     */
    public AvailableSearchCriteriaDto.Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto.Countries }
     *     
     */
    public void setCountries(AvailableSearchCriteriaDto.Countries value) {
        this.countries = value;
    }

    /**
     * Gets the value of the customlovs property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto.Customlovs }
     *     
     */
    public AvailableSearchCriteriaDto.Customlovs getCustomlovs() {
        return customlovs;
    }

    /**
     * Sets the value of the customlovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto.Customlovs }
     *     
     */
    public void setCustomlovs(AvailableSearchCriteriaDto.Customlovs value) {
        this.customlovs = value;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto.Organizations }
     *     
     */
    public AvailableSearchCriteriaDto.Organizations getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto.Organizations }
     *     
     */
    public void setOrganizations(AvailableSearchCriteriaDto.Organizations value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the postedSince property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPostedSince() {
        return postedSince;
    }

    /**
     * Sets the value of the postedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPostedSince(Integer value) {
        this.postedSince = value;
    }

    /**
     * Gets the value of the standardLovs property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSearchCriteriaDto.StandardLovs }
     *     
     */
    public AvailableSearchCriteriaDto.StandardLovs getStandardLovs() {
        return standardLovs;
    }

    /**
     * Sets the value of the standardLovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSearchCriteriaDto.StandardLovs }
     *     
     */
    public void setStandardLovs(AvailableSearchCriteriaDto.StandardLovs value) {
        this.standardLovs = value;
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
     *         &lt;element name="language" type="{http://ws.mrted.com/}criterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "language"
    })
    public static class AdLanguages {

        protected List<Criterion> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Criterion }
         * 
         * 
         */
        public List<Criterion> getLanguage() {
            if (language == null) {
                language = new ArrayList<Criterion>();
            }
            return this.language;
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
     *         &lt;element name="categoryList" type="{http://ws.mrted.com/}categoryListCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "categoryList"
    })
    public static class CategoryLists {

        protected List<CategoryListCriterion> categoryList;

        /**
         * Gets the value of the categoryList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CategoryListCriterion }
         * 
         * 
         */
        public List<CategoryListCriterion> getCategoryList() {
            if (categoryList == null) {
                categoryList = new ArrayList<CategoryListCriterion>();
            }
            return this.categoryList;
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
     *         &lt;element name="country" type="{http://ws.mrted.com/}countryCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "country"
    })
    public static class Countries {

        protected List<CountryCriterion> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryCriterion }
         * 
         * 
         */
        public List<CountryCriterion> getCountry() {
            if (country == null) {
                country = new ArrayList<CountryCriterion>();
            }
            return this.country;
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
     *         &lt;element name="customLov" type="{http://ws.mrted.com/}lovCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "customLov"
    })
    public static class Customlovs {

        protected List<LovCriterion> customLov;

        /**
         * Gets the value of the customLov property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customLov property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomLov().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LovCriterion }
         * 
         * 
         */
        public List<LovCriterion> getCustomLov() {
            if (customLov == null) {
                customLov = new ArrayList<LovCriterion>();
            }
            return this.customLov;
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
    public static class Organizations {

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
     *         &lt;element name="standardLov" type="{http://ws.mrted.com/}lovCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "standardLov"
    })
    public static class StandardLovs {

        protected List<LovCriterion> standardLov;

        /**
         * Gets the value of the standardLov property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the standardLov property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStandardLov().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LovCriterion }
         * 
         * 
         */
        public List<LovCriterion> getStandardLov() {
            if (standardLov == null) {
                standardLov = new ArrayList<LovCriterion>();
            }
            return this.standardLov;
        }

    }

}
