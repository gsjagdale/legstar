
package com.legstar.test.coxb.binarcht;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsUnsignedNative complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LsUnsignedNative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LsP9X4Min"&gt;
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
 *         &lt;element name="LsP9X9Min"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X9Max"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X18Min"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X18Max"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
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
@XmlType(name = "LsUnsignedNative", propOrder = {
    "lsP9X4Min",
    "lsP9X4Max",
    "lsP9X9Min",
    "lsP9X9Max",
    "lsP9X18Min",
    "lsP9X18Max"
})
public class LsUnsignedNative
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsP9X4Min")
    @CobolElement(cobolName = "LS-P9X4-MIN", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 10, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "COMP-5", srceLine = 42)
    protected int lsP9X4Min;
    @XmlElement(name = "LsP9X4Max")
    @CobolElement(cobolName = "LS-P9X4-MAX", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 10, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "COMP-5", srceLine = 43)
    protected int lsP9X4Max;
    @XmlElement(name = "LsP9X9Min")
    @CobolElement(cobolName = "LS-P9X9-MIN", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 10, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", srceLine = 44)
    protected long lsP9X9Min;
    @XmlElement(name = "LsP9X9Max")
    @CobolElement(cobolName = "LS-P9X9-MAX", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 10, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", srceLine = 45)
    protected long lsP9X9Max;
    @XmlElement(name = "LsP9X18Min", required = true)
    @CobolElement(cobolName = "LS-P9X18-MIN", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 10, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", srceLine = 46)
    protected BigInteger lsP9X18Min;
    @XmlElement(name = "LsP9X18Max", required = true)
    @CobolElement(cobolName = "LS-P9X18-MAX", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 10, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", srceLine = 47)
    protected BigInteger lsP9X18Max;

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

    /**
     * Gets the value of the lsP9X9Min property.
     * 
     */
    public long getLsP9X9Min() {
        return lsP9X9Min;
    }

    /**
     * Sets the value of the lsP9X9Min property.
     * 
     */
    public void setLsP9X9Min(long value) {
        this.lsP9X9Min = value;
    }

    public boolean isSetLsP9X9Min() {
        return true;
    }

    /**
     * Gets the value of the lsP9X9Max property.
     * 
     */
    public long getLsP9X9Max() {
        return lsP9X9Max;
    }

    /**
     * Sets the value of the lsP9X9Max property.
     * 
     */
    public void setLsP9X9Max(long value) {
        this.lsP9X9Max = value;
    }

    public boolean isSetLsP9X9Max() {
        return true;
    }

    /**
     * Gets the value of the lsP9X18Min property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLsP9X18Min() {
        return lsP9X18Min;
    }

    /**
     * Sets the value of the lsP9X18Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLsP9X18Min(BigInteger value) {
        this.lsP9X18Min = value;
    }

    public boolean isSetLsP9X18Min() {
        return (this.lsP9X18Min!= null);
    }

    /**
     * Gets the value of the lsP9X18Max property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLsP9X18Max() {
        return lsP9X18Max;
    }

    /**
     * Sets the value of the lsP9X18Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLsP9X18Max(BigInteger value) {
        this.lsP9X18Max = value;
    }

    public boolean isSetLsP9X18Max() {
        return (this.lsP9X18Max!= null);
    }

}
