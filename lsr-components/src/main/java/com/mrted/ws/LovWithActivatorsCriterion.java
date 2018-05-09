
package com.mrted.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lovWithActivatorsCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lovWithActivatorsCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}criterion">
 *       &lt;sequence>
 *         &lt;element name="activators" type="{http://ws.mrted.com/}activators" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lovWithActivatorsCriterion", propOrder = {
    "activators"
})
public class LovWithActivatorsCriterion
    extends Criterion
{

    protected List<Activators> activators;

    /**
     * Gets the value of the activators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activators }
     * 
     * 
     */
    public List<Activators> getActivators() {
        if (activators == null) {
            activators = new ArrayList<Activators>();
        }
        return this.activators;
    }

}
