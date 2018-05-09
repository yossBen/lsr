
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAdvertisementsByPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAdvertisementsByPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="searchCriteriaDto" type="{http://ws.mrted.com/}searchCriteriaDto" minOccurs="0" form="qualified"/>
 *         &lt;element name="sortingDetailsDto" type="{http://ws.mrted.com/}sortingDetailsDto" minOccurs="0" form="qualified"/>
 *         &lt;element name="langCode" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAdvertisementsByPage", propOrder = {
    "pageNumber",
    "searchCriteriaDto",
    "sortingDetailsDto",
    "langCode"
})
public class GetAdvertisementsByPage {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected int pageNumber;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected SearchCriteriaDto searchCriteriaDto;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected SortingDetailsDto sortingDetailsDto;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LangCode langCode;

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the searchCriteriaDto property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaDto }
     *     
     */
    public SearchCriteriaDto getSearchCriteriaDto() {
        return searchCriteriaDto;
    }

    /**
     * Sets the value of the searchCriteriaDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaDto }
     *     
     */
    public void setSearchCriteriaDto(SearchCriteriaDto value) {
        this.searchCriteriaDto = value;
    }

    /**
     * Gets the value of the sortingDetailsDto property.
     * 
     * @return
     *     possible object is
     *     {@link SortingDetailsDto }
     *     
     */
    public SortingDetailsDto getSortingDetailsDto() {
        return sortingDetailsDto;
    }

    /**
     * Sets the value of the sortingDetailsDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingDetailsDto }
     *     
     */
    public void setSortingDetailsDto(SortingDetailsDto value) {
        this.sortingDetailsDto = value;
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

}
