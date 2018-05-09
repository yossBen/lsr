
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchCriteriaDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCriteriaDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adLanguages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="categoryList" type="{http://ws.mrted.com/}categoryNameDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customLovs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customLovGroup" type="{http://ws.mrted.com/}customLovGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="generalApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="organizationIds">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="postedSince" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scheduleTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "searchCriteriaDto", propOrder = {
    "adLanguages",
    "categoryLists",
    "contractTypes",
    "countries",
    "customLovs",
    "generalApplication",
    "jobNumber",
    "keywords",
    "showImages",
    "organizationIds",
    "postedSince",
    "regions",
    "scheduleTypes"
})
public class SearchCriteriaDto {

    @XmlElement(required = true)
    protected SearchCriteriaDto.AdLanguages adLanguages;
    @XmlElement(required = true)
    protected SearchCriteriaDto.CategoryLists categoryLists;
    @XmlElement(required = true)
    protected SearchCriteriaDto.ContractTypes contractTypes;
    @XmlElement(required = true)
    protected SearchCriteriaDto.Countries countries;
    @XmlElement(required = true)
    protected SearchCriteriaDto.CustomLovs customLovs;
    protected Boolean generalApplication;
    protected String jobNumber;
    protected String keywords;
    protected Boolean showImages;
    @XmlElement(required = true)
    protected SearchCriteriaDto.OrganizationIds organizationIds;
    protected Integer postedSince;
    @XmlElement(required = true)
    protected SearchCriteriaDto.Regions regions;
    @XmlElement(required = true)
    protected SearchCriteriaDto.ScheduleTypes scheduleTypes;

    /**
     * Gets the value of the adLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.AdLanguages }
     *     
     */
    public SearchCriteriaDto.AdLanguages getAdLanguages() {
        return adLanguages;
    }

    /**
     * Sets the value of the adLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.AdLanguages }
     *     
     */
    public void setAdLanguages(SearchCriteriaDto.AdLanguages value) {
        this.adLanguages = value;
    }

    /**
     * Gets the value of the categoryLists property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.CategoryLists }
     *     
     */
    public SearchCriteriaDto.CategoryLists getCategoryLists() {
        return categoryLists;
    }

    /**
     * Sets the value of the categoryLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.CategoryLists }
     *     
     */
    public void setCategoryLists(SearchCriteriaDto.CategoryLists value) {
        this.categoryLists = value;
    }

    /**
     * Gets the value of the contractTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.ContractTypes }
     *     
     */
    public SearchCriteriaDto.ContractTypes getContractTypes() {
        return contractTypes;
    }

    /**
     * Sets the value of the contractTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.ContractTypes }
     *     
     */
    public void setContractTypes(SearchCriteriaDto.ContractTypes value) {
        this.contractTypes = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.Countries }
     *     
     */
    public SearchCriteriaDto.Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.Countries }
     *     
     */
    public void setCountries(SearchCriteriaDto.Countries value) {
        this.countries = value;
    }

    /**
     * Gets the value of the customLovs property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.CustomLovs }
     *     
     */
    public SearchCriteriaDto.CustomLovs getCustomLovs() {
        return customLovs;
    }

    /**
     * Sets the value of the customLovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.CustomLovs }
     *     
     */
    public void setCustomLovs(SearchCriteriaDto.CustomLovs value) {
        this.customLovs = value;
    }

    /**
     * Gets the value of the generalApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneralApplication() {
        return generalApplication;
    }

    /**
     * Sets the value of the generalApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneralApplication(Boolean value) {
        this.generalApplication = value;
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
     * Gets the value of the showImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowImages() {
        return showImages;
    }

    /**
     * Sets the value of the showImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowImages(Boolean value) {
        this.showImages = value;
    }

    /**
     * Gets the value of the organizationIds property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.OrganizationIds }
     *     
     */
    public SearchCriteriaDto.OrganizationIds getOrganizationIds() {
        return organizationIds;
    }

    /**
     * Sets the value of the organizationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.OrganizationIds }
     *     
     */
    public void setOrganizationIds(SearchCriteriaDto.OrganizationIds value) {
        this.organizationIds = value;
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
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.Regions }
     *     
     */
    public SearchCriteriaDto.Regions getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.Regions }
     *     
     */
    public void setRegions(SearchCriteriaDto.Regions value) {
        this.regions = value;
    }

    /**
     * Gets the value of the scheduleTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto.ScheduleTypes }
     *     
     */
    public SearchCriteriaDto.ScheduleTypes getScheduleTypes() {
        return scheduleTypes;
    }

    /**
     * Sets the value of the scheduleTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto.ScheduleTypes }
     *     
     */
    public void setScheduleTypes(SearchCriteriaDto.ScheduleTypes value) {
        this.scheduleTypes = value;
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
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<String> language;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getLanguage() {
            if (language == null) {
                language = new ArrayList<String>();
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
     *         &lt;element name="categoryList" type="{http://ws.mrted.com/}categoryNameDto" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<CategoryNameDto> categoryList;

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
         * {@link CategoryNameDto }
         * 
         * 
         */
        public List<CategoryNameDto> getCategoryList() {
            if (categoryList == null) {
                categoryList = new ArrayList<CategoryNameDto>();
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
     *         &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "contractType"
    })
    public static class ContractTypes {

        @XmlElement(type = Long.class)
        protected List<Long> contractType;

        /**
         * Gets the value of the contractType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContractType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getContractType() {
            if (contractType == null) {
                contractType = new ArrayList<Long>();
            }
            return this.contractType;
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
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(type = Long.class)
        protected List<Long> country;

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
         * {@link Long }
         * 
         * 
         */
        public List<Long> getCountry() {
            if (country == null) {
                country = new ArrayList<Long>();
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
     *         &lt;element name="customLovGroup" type="{http://ws.mrted.com/}customLovGroup" maxOccurs="unbounded" minOccurs="0"/>
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
        "customLovGroup"
    })
    public static class CustomLovs {

        protected List<CustomLovGroup> customLovGroup;

        /**
         * Gets the value of the customLovGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customLovGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomLovGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomLovGroup }
         * 
         * 
         */
        public List<CustomLovGroup> getCustomLovGroup() {
            if (customLovGroup == null) {
                customLovGroup = new ArrayList<CustomLovGroup>();
            }
            return this.customLovGroup;
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
     *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "organizationId"
    })
    public static class OrganizationIds {

        @XmlElement(type = Long.class)
        protected List<Long> organizationId;

        /**
         * Gets the value of the organizationId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organizationId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganizationId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getOrganizationId() {
            if (organizationId == null) {
                organizationId = new ArrayList<Long>();
            }
            return this.organizationId;
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
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "region"
    })
    public static class Regions {

        @XmlElement(type = Long.class)
        protected List<Long> region;

        /**
         * Gets the value of the region property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the region property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getRegion() {
            if (region == null) {
                region = new ArrayList<Long>();
            }
            return this.region;
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
     *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "scheduleType"
    })
    public static class ScheduleTypes {

        @XmlElement(type = Long.class)
        protected List<Long> scheduleType;

        /**
         * Gets the value of the scheduleType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scheduleType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScheduleType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getScheduleType() {
            if (scheduleType == null) {
                scheduleType = new ArrayList<Long>();
            }
            return this.scheduleType;
        }

    }

}
