//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.23 at 05:00:38 PM CEST 
//


package com.legstar.test.coxb.floatmix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for DfhcommareaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DfhcommareaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CFloat1234">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFloat0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFloat1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFloat345006P5678">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFloat798P20067Em16">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFloat3P40282347Ep38">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
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
@XmlType(name = "DfhcommareaType", propOrder = {
    "cFloat1234",
    "cFloat0",
    "cFloat1",
    "cFloat345006P5678",
    "cFloat798P20067Em16",
    "cFloat3P40282347Ep38"
})
public class DfhcommareaType {

    @XmlElement(name = "CFloat1234")
    @CobolElement(cobolName = "C-FLOAT-1234", type = CobolType.SINGLE_FLOAT_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected float cFloat1234;
    @XmlElement(name = "CFloat0")
    @CobolElement(cobolName = "C-FLOAT-0", type = CobolType.SINGLE_FLOAT_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected float cFloat0;
    @XmlElement(name = "CFloat1")
    @CobolElement(cobolName = "C-FLOAT-1", type = CobolType.SINGLE_FLOAT_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected float cFloat1;
    @XmlElement(name = "CFloat345006P5678")
    @CobolElement(cobolName = "C-FLOAT-345006p5678", type = CobolType.SINGLE_FLOAT_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected float cFloat345006P5678;
    @XmlElement(name = "CFloat798P20067Em16")
    @CobolElement(cobolName = "C-FLOAT-798p20067em16", type = CobolType.SINGLE_FLOAT_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected float cFloat798P20067Em16;
    @XmlElement(name = "CFloat3P40282347Ep38")
    @CobolElement(cobolName = "C-FLOAT-3p40282347ep38", type = CobolType.SINGLE_FLOAT_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected float cFloat3P40282347Ep38;

    /**
     * Gets the value of the cFloat1234 property.
     * 
     */
    public float getCFloat1234() {
        return cFloat1234;
    }

    /**
     * Sets the value of the cFloat1234 property.
     * 
     */
    public void setCFloat1234(float value) {
        this.cFloat1234 = value;
    }

    public boolean isSetCFloat1234() {
        return true;
    }

    /**
     * Gets the value of the cFloat0 property.
     * 
     */
    public float getCFloat0() {
        return cFloat0;
    }

    /**
     * Sets the value of the cFloat0 property.
     * 
     */
    public void setCFloat0(float value) {
        this.cFloat0 = value;
    }

    public boolean isSetCFloat0() {
        return true;
    }

    /**
     * Gets the value of the cFloat1 property.
     * 
     */
    public float getCFloat1() {
        return cFloat1;
    }

    /**
     * Sets the value of the cFloat1 property.
     * 
     */
    public void setCFloat1(float value) {
        this.cFloat1 = value;
    }

    public boolean isSetCFloat1() {
        return true;
    }

    /**
     * Gets the value of the cFloat345006P5678 property.
     * 
     */
    public float getCFloat345006P5678() {
        return cFloat345006P5678;
    }

    /**
     * Sets the value of the cFloat345006P5678 property.
     * 
     */
    public void setCFloat345006P5678(float value) {
        this.cFloat345006P5678 = value;
    }

    public boolean isSetCFloat345006P5678() {
        return true;
    }

    /**
     * Gets the value of the cFloat798P20067Em16 property.
     * 
     */
    public float getCFloat798P20067Em16() {
        return cFloat798P20067Em16;
    }

    /**
     * Sets the value of the cFloat798P20067Em16 property.
     * 
     */
    public void setCFloat798P20067Em16(float value) {
        this.cFloat798P20067Em16 = value;
    }

    public boolean isSetCFloat798P20067Em16() {
        return true;
    }

    /**
     * Gets the value of the cFloat3P40282347Ep38 property.
     * 
     */
    public float getCFloat3P40282347Ep38() {
        return cFloat3P40282347Ep38;
    }

    /**
     * Sets the value of the cFloat3P40282347Ep38 property.
     * 
     */
    public void setCFloat3P40282347Ep38(float value) {
        this.cFloat3P40282347Ep38 = value;
    }

    public boolean isSetCFloat3P40282347Ep38() {
        return true;
    }

}
