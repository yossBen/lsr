
package com.mrted.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sortingDetailsDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortingDetailsDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortType" type="{http://ws.mrted.com/}sortType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortingDetailsDto", propOrder = {
    "columnName",
    "sortType"
})
public class SortingDetailsDto {

    protected String columnName;
    protected SortType sortType;

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link SortType }
     *     
     */
    public SortType getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortType }
     *     
     */
    public void setSortType(SortType value) {
        this.sortType = value;
    }

}
