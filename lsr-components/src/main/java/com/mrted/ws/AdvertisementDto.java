
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for advertisementDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advertisementDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compensationMaxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="compensationMinValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="configurableFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="configurableField" type="{http://ws.mrted.com/}lovCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customField" type="{http://ws.mrted.com/}customField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customLovs" minOccurs="0">
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
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="externalJobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generalApplication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operational" type="{http://ws.mrted.com/}simpleUserDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="organizations" minOccurs="0">
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
 *         &lt;element name="postingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="postingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="postingTargetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recruiters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recruiter" type="{http://ws.mrted.com/}simpleUserDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recruitingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showRecruiter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="siteLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardLovs" minOccurs="0">
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
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strapline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedImages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assignedImage" type="{http://ws.mrted.com/}assignedImageDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "advertisementDto", propOrder = {
    "applicationUrl",
    "categoryLists",
    "comment",
    "compensationMaxValue",
    "compensationMinValue",
    "configurableFields",
    "customFields",
    "customLovs",
    "dueDate",
    "duration",
    "expectedEndDate",
    "expectedStartDate",
    "externalJobNumber",
    "generalApplication",
    "id",
    "jobNumber",
    "jobTitle",
    "keyword",
    "language",
    "location",
    "operationals",
    "organizations",
    "postingEndDate",
    "postingStartDate",
    "postingTargetStatus",
    "recruiters",
    "recruitingCompany",
    "showCompensation",
    "showRecruiter",
    "siteLanguage",
    "standardLovs",
    "status",
    "strapline",
    "assignedImages",
    "requisitionInternalJobNumber"
})
public class AdvertisementDto {

    protected String applicationUrl;
    @XmlElement(required = true)
    protected AdvertisementDto.CategoryLists categoryLists;
    protected String comment;
    protected Double compensationMaxValue;
    protected Double compensationMinValue;
    protected AdvertisementDto.ConfigurableFields configurableFields;
    protected AdvertisementDto.CustomFields customFields;
    protected AdvertisementDto.CustomLovs customLovs;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    protected String duration;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedStartDate;
    protected String externalJobNumber;
    protected boolean generalApplication;
    protected Long id;
    protected String jobNumber;
    protected String jobTitle;
    protected String keyword;
    protected String language;
    protected String location;
    protected AdvertisementDto.Operationals operationals;
    protected AdvertisementDto.Organizations organizations;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingStartDate;
    protected String postingTargetStatus;
    protected AdvertisementDto.Recruiters recruiters;
    protected String recruitingCompany;
    protected boolean showCompensation;
    protected boolean showRecruiter;
    protected String siteLanguage;
    protected AdvertisementDto.StandardLovs standardLovs;
    protected String status;
    protected String strapline;
    protected AdvertisementDto.AssignedImages assignedImages;
    protected String requisitionInternalJobNumber;

    /**
     * Gets the value of the applicationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationUrl() {
        return applicationUrl;
    }

    /**
     * Sets the value of the applicationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationUrl(String value) {
        this.applicationUrl = value;
    }

    /**
     * Gets the value of the categoryLists property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.CategoryLists }
     *     
     */
    public AdvertisementDto.CategoryLists getCategoryLists() {
        return categoryLists;
    }

    /**
     * Sets the value of the categoryLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.CategoryLists }
     *     
     */
    public void setCategoryLists(AdvertisementDto.CategoryLists value) {
        this.categoryLists = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the compensationMaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompensationMaxValue() {
        return compensationMaxValue;
    }

    /**
     * Sets the value of the compensationMaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompensationMaxValue(Double value) {
        this.compensationMaxValue = value;
    }

    /**
     * Gets the value of the compensationMinValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompensationMinValue() {
        return compensationMinValue;
    }

    /**
     * Sets the value of the compensationMinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompensationMinValue(Double value) {
        this.compensationMinValue = value;
    }

    /**
     * Gets the value of the configurableFields property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.ConfigurableFields }
     *     
     */
    public AdvertisementDto.ConfigurableFields getConfigurableFields() {
        return configurableFields;
    }

    /**
     * Sets the value of the configurableFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.ConfigurableFields }
     *     
     */
    public void setConfigurableFields(AdvertisementDto.ConfigurableFields value) {
        this.configurableFields = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.CustomFields }
     *     
     */
    public AdvertisementDto.CustomFields getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.CustomFields }
     *     
     */
    public void setCustomFields(AdvertisementDto.CustomFields value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the customLovs property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.CustomLovs }
     *     
     */
    public AdvertisementDto.CustomLovs getCustomLovs() {
        return customLovs;
    }

    /**
     * Sets the value of the customLovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.CustomLovs }
     *     
     */
    public void setCustomLovs(AdvertisementDto.CustomLovs value) {
        this.customLovs = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the expectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedEndDate() {
        return expectedEndDate;
    }

    /**
     * Sets the value of the expectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedEndDate(XMLGregorianCalendar value) {
        this.expectedEndDate = value;
    }

    /**
     * Gets the value of the expectedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedStartDate() {
        return expectedStartDate;
    }

    /**
     * Sets the value of the expectedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedStartDate(XMLGregorianCalendar value) {
        this.expectedStartDate = value;
    }

    /**
     * Gets the value of the externalJobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalJobNumber() {
        return externalJobNumber;
    }

    /**
     * Sets the value of the externalJobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalJobNumber(String value) {
        this.externalJobNumber = value;
    }

    /**
     * Gets the value of the generalApplication property.
     * 
     */
    public boolean isGeneralApplication() {
        return generalApplication;
    }

    /**
     * Sets the value of the generalApplication property.
     * 
     */
    public void setGeneralApplication(boolean value) {
        this.generalApplication = value;
    }

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
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the operationals property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.Operationals }
     *     
     */
    public AdvertisementDto.Operationals getOperationals() {
        return operationals;
    }

    /**
     * Sets the value of the operationals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.Operationals }
     *     
     */
    public void setOperationals(AdvertisementDto.Operationals value) {
        this.operationals = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.Organizations }
     *     
     */
    public AdvertisementDto.Organizations getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.Organizations }
     *     
     */
    public void setOrganizations(AdvertisementDto.Organizations value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the postingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingEndDate() {
        return postingEndDate;
    }

    /**
     * Sets the value of the postingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingEndDate(XMLGregorianCalendar value) {
        this.postingEndDate = value;
    }

    /**
     * Gets the value of the postingStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingStartDate() {
        return postingStartDate;
    }

    /**
     * Sets the value of the postingStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingStartDate(XMLGregorianCalendar value) {
        this.postingStartDate = value;
    }

    /**
     * Gets the value of the postingTargetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingTargetStatus() {
        return postingTargetStatus;
    }

    /**
     * Sets the value of the postingTargetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingTargetStatus(String value) {
        this.postingTargetStatus = value;
    }

    /**
     * Gets the value of the recruiters property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.Recruiters }
     *     
     */
    public AdvertisementDto.Recruiters getRecruiters() {
        return recruiters;
    }

    /**
     * Sets the value of the recruiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.Recruiters }
     *     
     */
    public void setRecruiters(AdvertisementDto.Recruiters value) {
        this.recruiters = value;
    }

    /**
     * Gets the value of the recruitingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecruitingCompany() {
        return recruitingCompany;
    }

    /**
     * Sets the value of the recruitingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecruitingCompany(String value) {
        this.recruitingCompany = value;
    }

    /**
     * Gets the value of the showCompensation property.
     * 
     */
    public boolean isShowCompensation() {
        return showCompensation;
    }

    /**
     * Sets the value of the showCompensation property.
     * 
     */
    public void setShowCompensation(boolean value) {
        this.showCompensation = value;
    }

    /**
     * Gets the value of the showRecruiter property.
     * 
     */
    public boolean isShowRecruiter() {
        return showRecruiter;
    }

    /**
     * Sets the value of the showRecruiter property.
     * 
     */
    public void setShowRecruiter(boolean value) {
        this.showRecruiter = value;
    }

    /**
     * Gets the value of the siteLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteLanguage() {
        return siteLanguage;
    }

    /**
     * Sets the value of the siteLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteLanguage(String value) {
        this.siteLanguage = value;
    }

    /**
     * Gets the value of the standardLovs property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.StandardLovs }
     *     
     */
    public AdvertisementDto.StandardLovs getStandardLovs() {
        return standardLovs;
    }

    /**
     * Sets the value of the standardLovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.StandardLovs }
     *     
     */
    public void setStandardLovs(AdvertisementDto.StandardLovs value) {
        this.standardLovs = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the strapline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrapline() {
        return strapline;
    }

    /**
     * Sets the value of the strapline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrapline(String value) {
        this.strapline = value;
    }

    /**
     * Gets the value of the assignedImages property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementDto.AssignedImages }
     *     
     */
    public AdvertisementDto.AssignedImages getAssignedImages() {
        return assignedImages;
    }

    /**
     * Sets the value of the assignedImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementDto.AssignedImages }
     *     
     */
    public void setAssignedImages(AdvertisementDto.AssignedImages value) {
        this.assignedImages = value;
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
     *         &lt;element name="assignedImage" type="{http://ws.mrted.com/}assignedImageDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "assignedImage"
    })
    public static class AssignedImages {

        protected List<AssignedImageDto> assignedImage;

        /**
         * Gets the value of the assignedImage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedImage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignedImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssignedImageDto }
         * 
         * 
         */
        public List<AssignedImageDto> getAssignedImage() {
            if (assignedImage == null) {
                assignedImage = new ArrayList<AssignedImageDto>();
            }
            return this.assignedImage;
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
     *         &lt;element name="configurableField" type="{http://ws.mrted.com/}lovCriterion" maxOccurs="unbounded" minOccurs="0"/>
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
        "configurableField"
    })
    public static class ConfigurableFields {

        protected List<LovCriterion> configurableField;

        /**
         * Gets the value of the configurableField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configurableField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfigurableField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LovCriterion }
         * 
         * 
         */
        public List<LovCriterion> getConfigurableField() {
            if (configurableField == null) {
                configurableField = new ArrayList<LovCriterion>();
            }
            return this.configurableField;
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
     *         &lt;element name="customField" type="{http://ws.mrted.com/}customField" maxOccurs="unbounded" minOccurs="0"/>
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
        "customField"
    })
    public static class CustomFields {

        protected List<CustomField> customField;

        /**
         * Gets the value of the customField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomField }
         * 
         * 
         */
        public List<CustomField> getCustomField() {
            if (customField == null) {
                customField = new ArrayList<CustomField>();
            }
            return this.customField;
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
    public static class CustomLovs {

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
     *         &lt;element name="operational" type="{http://ws.mrted.com/}simpleUserDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "operational"
    })
    public static class Operationals {

        protected List<SimpleUserDto> operational;

        /**
         * Gets the value of the operational property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operational property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperational().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleUserDto }
         * 
         * 
         */
        public List<SimpleUserDto> getOperational() {
            if (operational == null) {
                operational = new ArrayList<SimpleUserDto>();
            }
            return this.operational;
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
     *         &lt;element name="recruiter" type="{http://ws.mrted.com/}simpleUserDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "recruiter"
    })
    public static class Recruiters {

        protected List<SimpleUserDto> recruiter;

        /**
         * Gets the value of the recruiter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recruiter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecruiter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleUserDto }
         * 
         * 
         */
        public List<SimpleUserDto> getRecruiter() {
            if (recruiter == null) {
                recruiter = new ArrayList<SimpleUserDto>();
            }
            return this.recruiter;
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
