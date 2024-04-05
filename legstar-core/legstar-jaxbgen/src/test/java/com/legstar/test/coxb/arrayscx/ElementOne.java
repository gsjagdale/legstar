
package com.legstar.test.coxb.arrayscx;

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
 * <p>Java class for ElementOne complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ElementOne"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementTwo" type="{http://legstar.com/test/coxb/arrayscx}ElementTwo" maxOccurs="3" minOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementOne", propOrder = {
    "elementTwo"
})
public class ElementOne
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ElementTwo", required = true)
    @CobolElement(cobolName = "ELEMENT-TWO", type = CobolType.GROUP_ITEM, levelNumber = 15, minOccurs = 3, maxOccurs = 3, srceLine = 31)
    protected List<ElementTwo> elementTwo;

    /**
     * Gets the value of the elementTwo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementTwo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElementTwo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementTwo }
     * </p>
     * 
     * 
     * @return
     *     The value of the elementTwo property.
     */
    public List<ElementTwo> getElementTwo() {
        if (elementTwo == null) {
            elementTwo = new ArrayList<ElementTwo>();
        }
        return this.elementTwo;
    }

    public boolean isSetElementTwo() {
        return ((this.elementTwo!= null)&&(!this.elementTwo.isEmpty()));
    }

    public void unsetElementTwo() {
        this.elementTwo = null;
    }

}
