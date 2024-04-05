
package com.legstar.test.coxb.lsfileac;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WQueryLimit complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WQueryLimit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WMaxItemsRead"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WMaxElapseTime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="8"/&gt;
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
@XmlType(name = "WQueryLimit", propOrder = {
    "wMaxItemsRead",
    "wMaxElapseTime"
})
public class WQueryLimit
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WMaxItemsRead")
    @CobolElement(cobolName = "W-MAX-ITEMS-READ", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "PACKED-DECIMAL", value = "200", srceLine = 37)
    protected long wMaxItemsRead = 200L;
    @XmlElement(name = "WMaxElapseTime")
    @CobolElement(cobolName = "W-MAX-ELAPSE-TIME", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "PACKED-DECIMAL", value = "10000", srceLine = 38)
    protected long wMaxElapseTime = 10000L;

    /**
     * Gets the value of the wMaxItemsRead property.
     * 
     */
    public long getWMaxItemsRead() {
        return wMaxItemsRead;
    }

    /**
     * Sets the value of the wMaxItemsRead property.
     * 
     */
    public void setWMaxItemsRead(long value) {
        this.wMaxItemsRead = value;
    }

    public boolean isSetWMaxItemsRead() {
        return true;
    }

    /**
     * Gets the value of the wMaxElapseTime property.
     * 
     */
    public long getWMaxElapseTime() {
        return wMaxElapseTime;
    }

    /**
     * Sets the value of the wMaxElapseTime property.
     * 
     */
    public void setWMaxElapseTime(long value) {
        this.wMaxElapseTime = value;
    }

    public boolean isSetWMaxElapseTime() {
        return true;
    }

}
