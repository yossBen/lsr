
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovWithValuesByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovWithValuesByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovWithValues" type="{http://ws.mrted.com/}lovDescendantDto" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovWithValuesByNameResponse", propOrder = {
    "lovWithValues"
})
public class GetLovWithValuesByNameResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected List<LovDescendantDto> lovWithValues;

    /**
     * Gets the value of the lovWithValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lovWithValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLovWithValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LovDescendantDto }
     * 
     * 
     */
    public List<LovDescendantDto> getLovWithValues() {
        if (lovWithValues == null) {
            lovWithValues = new ArrayList<LovDescendantDto>();
        }
        return this.lovWithValues;
    }

}
