//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.23 at 05:00:24 PM CEST 
//


package com.legstar.test.coxb.binnatus;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for LsDoublewordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsDoublewordsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsP9X18Min">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X18Low">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X18High">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsP9X18Max">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsDoublewordsType", propOrder = {
    "lsP9X18Min",
    "lsP9X18Low",
    "lsP9X18High",
    "lsP9X18Max"
})
public class LsDoublewordsType {

    @XmlElement(name = "LsP9X18Min", required = true)
    @CobolElement(cobolName = "LS-P9X18-MIN", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 18)
    protected BigInteger lsP9X18Min;
    @XmlElement(name = "LsP9X18Low", required = true)
    @CobolElement(cobolName = "LS-P9X18-LOW", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 18)
    protected BigInteger lsP9X18Low;
    @XmlElement(name = "LsP9X18High", required = true)
    @CobolElement(cobolName = "LS-P9X18-HIGH", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 18)
    protected BigInteger lsP9X18High;
    @XmlElement(name = "LsP9X18Max", required = true)
    @CobolElement(cobolName = "LS-P9X18-MAX", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 18)
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
