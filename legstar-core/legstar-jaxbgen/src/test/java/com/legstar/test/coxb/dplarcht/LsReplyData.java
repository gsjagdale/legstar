
package com.legstar.test.coxb.dplarcht;

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
 * <p>Java class for LsReplyData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LsReplyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LsItemsCount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsItemsArray" type="{http://legstar.com/test/coxb/dplarcht}LsItemsArray" maxOccurs="500"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsReplyData", propOrder = {
    "lsItemsCount",
    "lsItemsArray"
})
public class LsReplyData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsItemsCount")
    @CobolElement(cobolName = "LS-ITEMS-COUNT", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 9, isODOObject = true, picture = "9(9)", usage = "COMP-5", srceLine = 99)
    protected long lsItemsCount;
    @XmlElement(name = "LsItemsArray", required = true)
    @CobolElement(cobolName = "LS-ITEMS-ARRAY", type = CobolType.GROUP_ITEM, levelNumber = 15, minOccurs = 1, maxOccurs = 500, dependingOn = "LS-ITEMS-COUNT", srceLine = 100)
    protected List<LsItemsArray> lsItemsArray;

    /**
     * Gets the value of the lsItemsCount property.
     * 
     */
    public long getLsItemsCount() {
        return lsItemsCount;
    }

    /**
     * Sets the value of the lsItemsCount property.
     * 
     */
    public void setLsItemsCount(long value) {
        this.lsItemsCount = value;
    }

    public boolean isSetLsItemsCount() {
        return true;
    }

    /**
     * Gets the value of the lsItemsArray property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lsItemsArray property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLsItemsArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LsItemsArray }
     * </p>
     * 
     * 
     * @return
     *     The value of the lsItemsArray property.
     */
    public List<LsItemsArray> getLsItemsArray() {
        if (lsItemsArray == null) {
            lsItemsArray = new ArrayList<LsItemsArray>();
        }
        return this.lsItemsArray;
    }

    public boolean isSetLsItemsArray() {
        return ((this.lsItemsArray!= null)&&(!this.lsItemsArray.isEmpty()));
    }

    public void unsetLsItemsArray() {
        this.lsItemsArray = null;
    }

}
