
package com.legstar.test.coxb.vararcom;

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
 * <p>Java class for Dfhcommarea complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Dfhcommarea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CItemsNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CArray" type="{http://legstar.com/test/coxb/vararcom}CArray" maxOccurs="250"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dfhcommarea", propOrder = {
    "cItemsNumber",
    "cArray"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CItemsNumber")
    @CobolElement(cobolName = "C-ITEMS-NUMBER", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 5, isSigned = true, totalDigits = 4, isODOObject = true, picture = "S9(4)", usage = "COMP-5", srceLine = 22)
    protected short cItemsNumber;
    @XmlElement(name = "CArray", required = true)
    @CobolElement(cobolName = "C-ARRAY", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = 1, maxOccurs = 250, dependingOn = "C-ITEMS-NUMBER", srceLine = 23)
    protected List<CArray> cArray;

    /**
     * Gets the value of the cItemsNumber property.
     * 
     */
    public short getCItemsNumber() {
        return cItemsNumber;
    }

    /**
     * Sets the value of the cItemsNumber property.
     * 
     */
    public void setCItemsNumber(short value) {
        this.cItemsNumber = value;
    }

    public boolean isSetCItemsNumber() {
        return true;
    }

    /**
     * Gets the value of the cArray property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cArray property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CArray }
     * </p>
     * 
     * 
     * @return
     *     The value of the cArray property.
     */
    public List<CArray> getCArray() {
        if (cArray == null) {
            cArray = new ArrayList<CArray>();
        }
        return this.cArray;
    }

    public boolean isSetCArray() {
        return ((this.cArray!= null)&&(!this.cArray.isEmpty()));
    }

    public void unsetCArray() {
        this.cArray = null;
    }

}
