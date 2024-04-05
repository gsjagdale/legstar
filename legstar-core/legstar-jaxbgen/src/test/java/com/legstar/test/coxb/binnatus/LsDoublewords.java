
package com.legstar.test.coxb.binnatus;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsDoublewords complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LsDoublewords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LsP9X18Min"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X18Low"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsP9X18High"&gt;
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
@XmlType(name = "LsDoublewords", propOrder = {
    "lsP9X18Min",
    "lsP9X18Low",
    "lsP9X18High",
    "lsP9X18Max"
})
public class LsDoublewords
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsP9X18Min", required = true)
    @CobolElement(cobolName = "LS-P9X18-MIN", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", srceLine = 80)
    protected BigInteger lsP9X18Min;
    @XmlElement(name = "LsP9X18Low", required = true)
    @CobolElement(cobolName = "LS-P9X18-LOW", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", srceLine = 81)
    protected BigInteger lsP9X18Low;
    @XmlElement(name = "LsP9X18High", required = true)
    @CobolElement(cobolName = "LS-P9X18-HIGH", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", srceLine = 82)
    protected BigInteger lsP9X18High;
    @XmlElement(name = "LsP9X18Max", required = true)
    @CobolElement(cobolName = "LS-P9X18-MAX", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", srceLine = 83)
    protected BigInteger lsP9X18Max;

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
     * Gets the value of the lsP9X18Low property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLsP9X18Low() {
        return lsP9X18Low;
    }

    /**
     * Sets the value of the lsP9X18Low property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLsP9X18Low(BigInteger value) {
        this.lsP9X18Low = value;
    }

    public boolean isSetLsP9X18Low() {
        return (this.lsP9X18Low!= null);
    }

    /**
     * Gets the value of the lsP9X18High property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLsP9X18High() {
        return lsP9X18High;
    }

    /**
     * Sets the value of the lsP9X18High property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLsP9X18High(BigInteger value) {
        this.lsP9X18High = value;
    }

    public boolean isSetLsP9X18High() {
        return (this.lsP9X18High!= null);
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
