
package com.legstar.test.coxb.binnatus;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsHalfwords complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LsHalfwords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LsP9X4Min"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X4Low"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X4High"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X4Max"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
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
@XmlType(name = "LsHalfwords", propOrder = {
    "lsP9X4Min",
    "lsP9X4Low",
    "lsP9X4High",
    "lsP9X4Max"
})
public class LsHalfwords
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsP9X4Min")
    @CobolElement(cobolName = "LS-P9X4-MIN", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "COMP-5", srceLine = 70)
    protected int lsP9X4Min;
    @XmlElement(name = "LsP9X4Low")
    @CobolElement(cobolName = "LS-P9X4-LOW", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "COMP-5", srceLine = 71)
    protected int lsP9X4Low;
    @XmlElement(name = "LsP9X4High")
    @CobolElement(cobolName = "LS-P9X4-HIGH", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "COMP-5", srceLine = 72)
    protected int lsP9X4High;
    @XmlElement(name = "LsP9X4Max")
    @CobolElement(cobolName = "LS-P9X4-MAX", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "COMP-5", srceLine = 73)
    protected int lsP9X4Max;

    /**
     * Gets the value of the lsP9X4Min property.
     * 
     */
    public int getLsP9X4Min() {
        return lsP9X4Min;
    }

    /**
     * Sets the value of the lsP9X4Min property.
     * 
     */
    public void setLsP9X4Min(int value) {
        this.lsP9X4Min = value;
    }

    public boolean isSetLsP9X4Min() {
        return true;
    }

    /**
     * Gets the value of the lsP9X4Low property.
     * 
     */
    public int getLsP9X4Low() {
        return lsP9X4Low;
    }

    /**
     * Sets the value of the lsP9X4Low property.
     * 
     */
    public void setLsP9X4Low(int value) {
        this.lsP9X4Low = value;
    }

    public boolean isSetLsP9X4Low() {
        return true;
    }

    /**
     * Gets the value of the lsP9X4High property.
     * 
     */
    public int getLsP9X4High() {
        return lsP9X4High;
    }

    /**
     * Sets the value of the lsP9X4High property.
     * 
     */
    public void setLsP9X4High(int value) {
        this.lsP9X4High = value;
    }

    public boolean isSetLsP9X4High() {
        return true;
    }

    /**
     * Gets the value of the lsP9X4Max property.
     * 
     */
    public int getLsP9X4Max() {
        return lsP9X4Max;
    }

    /**
     * Sets the value of the lsP9X4Max property.
     * 
     */
    public void setLsP9X4Max(int value) {
        this.lsP9X4Max = value;
    }

    public boolean isSetLsP9X4Max() {
        return true;
    }

}
