
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advertisementSortingColumns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advertisementSortingColumns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" type="{http://ws.mrted.com/}keyValueDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advertisementSortingColumns", propOrder = {
    "column"
})
public class AdvertisementSortingColumns {

    protected List<KeyValueDTO> column;

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueDTO }
     * 
     * 
     */
    public List<KeyValueDTO> getColumn() {
        if (column == null) {
            column = new ArrayList<KeyValueDTO>();
        }
        return this.column;
    }

}
