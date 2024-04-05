
package com.legstar.test.coxb.tcobwvb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler79 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler79"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WAddress" maxOccurs="5" minOccurs="5"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filler79", propOrder = {
    "wAddress"
})
public class Filler79
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WAddress", required = true)
    @CobolElement(cobolName = "W-ADDRESS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, minOccurs = 5, maxOccurs = 5, picture = "X(20)", srceLine = 80)
    protected List<String> wAddress;

    /**
     * Gets the value of the wAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the wAddress property.
     */
    public List<String> getWAddress() {
        if (wAddress == null) {
            wAddress = new ArrayList<String>();
        }
        return this.wAddress;
    }

    public boolean isSetWAddress() {
        return ((this.wAddress!= null)&&(!this.wAddress.isEmpty()));
    }

    public void unsetWAddress() {
        this.wAddress = null;
    }

}
