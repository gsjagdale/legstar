
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
 * <p>Java class for Filler95 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler95"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WDate" maxOccurs="5" minOccurs="5"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
@XmlType(name = "Filler95", propOrder = {
    "wDate"
})
public class Filler95
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WDate", required = true)
    @CobolElement(cobolName = "W-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, minOccurs = 5, maxOccurs = 5, picture = "X(8)", srceLine = 96)
    protected List<String> wDate;

    /**
     * Gets the value of the wDate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wDate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWDate().add(newItem);
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
     *     The value of the wDate property.
     */
    public List<String> getWDate() {
        if (wDate == null) {
            wDate = new ArrayList<String>();
        }
        return this.wDate;
    }

    public boolean isSetWDate() {
        return ((this.wDate!= null)&&(!this.wDate.isEmpty()));
    }

    public void unsetWDate() {
        this.wDate = null;
    }

}
