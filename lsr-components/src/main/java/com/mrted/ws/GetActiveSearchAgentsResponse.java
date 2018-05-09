
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActiveSearchAgentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getActiveSearchAgentsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}searchAgentDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActiveSearchAgentsResponse", propOrder = {
    "searchAgentDetails"
})
public class GetActiveSearchAgentsResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected List<SearchAgentDetails> searchAgentDetails;

    /**
     * Gets the value of the searchAgentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchAgentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchAgentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAgentDetails }
     * 
     * 
     */
    public List<SearchAgentDetails> getSearchAgentDetails() {
        if (searchAgentDetails == null) {
            searchAgentDetails = new ArrayList<SearchAgentDetails>();
        }
        return this.searchAgentDetails;
    }

}
