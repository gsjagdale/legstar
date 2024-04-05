
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
 * <p>Java class for Filler71 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler71"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WLastName" maxOccurs="5" minOccurs="5"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
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
@XmlType(name = "Filler71", propOrder = {
    "wLastName"
})
public class Filler71
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WLastName", required = true)
    @CobolElement(cobolName = "W-LAST-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, minOccurs = 5, maxOccurs = 5, picture = "X(15)", srceLine = 72)
    protected List<String> wLastName;

    /**
     * Gets the value of the wLastName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wLastName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWLastName().add(newItem);
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
     *     The value of the wLastName property.
     */
    public List<String> getWLastName() {
        if (wLastName == null) {
            wLastName = new ArrayList<String>();
        }
        return this.wLastName;
    }

    public boolean isSetWLastName() {
        return ((this.wLastName!= null)&&(!this.wLastName.isEmpty()));
    }

    public void unsetWLastName() {
        this.wLastName = null;
    }

}
