
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
 * <p>Java class for Filler63 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler63"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WFirstName" maxOccurs="5" minOccurs="5"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
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
@XmlType(name = "Filler63", propOrder = {
    "wFirstName"
})
public class Filler63
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WFirstName", required = true)
    @CobolElement(cobolName = "W-FIRST-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, minOccurs = 5, maxOccurs = 5, picture = "X(5)", srceLine = 64)
    protected List<String> wFirstName;

    /**
     * Gets the value of the wFirstName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wFirstName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWFirstName().add(newItem);
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
     *     The value of the wFirstName property.
     */
    public List<String> getWFirstName() {
        if (wFirstName == null) {
            wFirstName = new ArrayList<String>();
        }
        return this.wFirstName;
    }

    public boolean isSetWFirstName() {
        return ((this.wFirstName!= null)&&(!this.wFirstName.isEmpty()));
    }

    public void unsetWFirstName() {
        this.wFirstName = null;
    }

}
