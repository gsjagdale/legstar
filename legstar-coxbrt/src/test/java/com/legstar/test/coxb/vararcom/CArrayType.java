//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.23 at 05:00:58 PM CEST 
//


package com.legstar.test.coxb.vararcom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for CArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CItem1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CItem2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="-9999"/>
 *               &lt;maxInclusive value="9999"/>
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
@XmlType(name = "CArrayType", propOrder = {
    "cItem1",
    "cItem2"
})
public class CArrayType {

    @XmlElement(name = "CItem1", required = true)
    @CobolElement(cobolName = "C-ITEM-1", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 5, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String cItem1;
    @XmlElement(name = "CItem2")
    @CobolElement(cobolName = "C-ITEM-2", type = CobolType.BINARY_ITEM, byteLength = 2, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 4)
    protected short cItem2;

    /**
     * Gets the value of the cItem1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCItem1() {
        return cItem1;
    }

    /**
     * Sets the value of the cItem1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCItem1(String value) {
        this.cItem1 = value;
    }

    public boolean isSetCItem1() {
        return (this.cItem1 != null);
    }

    /**
     * Gets the value of the cItem2 property.
     * 
     */
    public short getCItem2() {
        return cItem2;
    }

    /**
     * Sets the value of the cItem2 property.
     * 
     */
    public void setCItem2(short value) {
        this.cItem2 = value;
    }

    public boolean isSetCItem2() {
        return true;
    }

}
