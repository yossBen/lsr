
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovNamesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovNamesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovNames" type="{http://ws.mrted.com/}lovDto" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovNamesResponse", propOrder = {
    "lovNames"
})
public class GetLovNamesResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected List<LovDto> lovNames;

    /**
     * Gets the value of the lovNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lovNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLovNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LovDto }
     * 
     * 
     */
    public List<LovDto> getLovNames() {
        if (lovNames == null) {
            lovNames = new ArrayList<LovDto>();
        }
        return this.lovNames;
    }

}
