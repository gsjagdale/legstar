
package com.legstar.test.coxb.typesmix;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="CAlphabetic"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *               &lt;pattern value="[\p{L}\s]{0,5}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNational"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CDbcs"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAlphanumericEdited"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *               &lt;pattern value="[\p{L}\s]{0,2}.{0,3}/?\d{0,2}0{0,2}\s{0,3}/?"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CAlphanumeric"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COctetString"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CSingleFloat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CDoubleFloat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPackedDecimal"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="17"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CZonedDecimal"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;totalDigits value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNumericEdited1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *               &lt;pattern value="[\d\.]{0,3}0{0,2}\d{0,4}(CR|\s\s)?"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNumericEdited2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *               &lt;pattern value="($|\d|\s){0,3}\d{0,4}/?,?\d{0,2}\.?\d{0,3}[\+\-\d]?"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNumericEdited3"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;pattern value="[1-9\*]{0,4}\d{0,3}\.?\d{0,2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNumericEdited4"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *               &lt;pattern value="[\+\-\d]?[1-9\s]{0,4}\d{0,2}\.?\d{0,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CIndex"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPointer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CProcPointer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFuncPointer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CExternalFloating"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,2}\.?\d{0,2}E?[\+\-\d]?\d{0,2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CBinary"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNativeBinary"&gt;
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
@XmlType(name = "Dfhcommarea", propOrder = {
    "cAlphabetic",
    "cNational",
    "cDbcs",
    "cAlphanumericEdited",
    "cAlphanumeric",
    "cOctetString",
    "cSingleFloat",
    "cDoubleFloat",
    "cPackedDecimal",
    "cZonedDecimal",
    "cNumericEdited1",
    "cNumericEdited2",
    "cNumericEdited3",
    "cNumericEdited4",
    "cIndex",
    "cPointer",
    "cProcPointer",
    "cFuncPointer",
    "cExternalFloating",
    "cBinary",
    "cNativeBinary"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CAlphabetic", required = true)
    @CobolElement(cobolName = "C-ALPHABETIC", type = CobolType.ALPHABETIC_ITEM, levelNumber = 5, picture = "A(5)", srceLine = 21)
    protected String cAlphabetic;
    @XmlElement(name = "CNational", required = true)
    @CobolElement(cobolName = "C-NATIONAL", type = CobolType.NATIONAL_ITEM, levelNumber = 5, picture = "N(9)", srceLine = 22)
    protected String cNational;
    @XmlElement(name = "CDbcs", required = true)
    @CobolElement(cobolName = "C-DBCS", type = CobolType.DBCS_ITEM, levelNumber = 5, picture = "G(4)", usage = "DISPLAY-1", srceLine = 23)
    protected String cDbcs;
    @XmlElement(name = "CAlphanumericEdited", required = true)
    @CobolElement(cobolName = "C-ALPHANUMERIC-EDITED", type = CobolType.ALPHANUMERIC_EDITED_ITEM, levelNumber = 5, picture = "A(2)X(3)/9900BBB/", srceLine = 24)
    protected String cAlphanumericEdited;
    @XmlElement(name = "CAlphanumeric", required = true)
    @CobolElement(cobolName = "C-ALPHANUMERIC", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(7)", srceLine = 25)
    protected String cAlphanumeric;
    @XmlElement(name = "COctetString", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-OCTET-STRING", type = CobolType.OCTET_STREAM_ITEM, levelNumber = 5, picture = "X(8)", srceLine = 26)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cOctetString;
    @XmlElement(name = "CSingleFloat")
    @CobolElement(cobolName = "C-SINGLE-FLOAT", type = CobolType.SINGLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-1", srceLine = 27)
    protected float cSingleFloat;
    @XmlElement(name = "CDoubleFloat")
    @CobolElement(cobolName = "C-DOUBLE-FLOAT", type = CobolType.DOUBLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-2", srceLine = 28)
    protected double cDoubleFloat;
    @XmlElement(name = "CPackedDecimal", required = true)
    @CobolElement(cobolName = "C-PACKED-DECIMAL", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 17, fractionDigits = 2, picture = "S9(15)V99", usage = "PACKED-DECIMAL", srceLine = 29)
    protected BigDecimal cPackedDecimal;
    @XmlElement(name = "CZonedDecimal")
    @CobolElement(cobolName = "C-ZONED-DECIMAL", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 14, picture = "S9(5)9(9)", usage = "DISPLAY", srceLine = 30)
    protected long cZonedDecimal;
    @XmlElement(name = "CNumericEdited1", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, picture = "PPP009999CR", srceLine = 31)
    protected String cNumericEdited1;
    @XmlElement(name = "CNumericEdited2", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = false, totalDigits = 11, fractionDigits = 3, picture = "$$$9999/,99.999+", srceLine = 32)
    protected String cNumericEdited2;
    @XmlElement(name = "CNumericEdited3", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-3", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = false, totalDigits = 9, fractionDigits = 2, picture = "****999.99", srceLine = 33)
    protected String cNumericEdited3;
    @XmlElement(name = "CNumericEdited4", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-4", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, fractionDigits = 3, picture = "-ZZZZ99.999", srceLine = 34)
    protected String cNumericEdited4;
    @XmlElement(name = "CIndex", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-INDEX", type = CobolType.INDEX_ITEM, levelNumber = 5, usage = "INDEX", srceLine = 35)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cIndex;
    @XmlElement(name = "CPointer", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-POINTER", type = CobolType.POINTER_ITEM, levelNumber = 5, usage = "POINTER", srceLine = 36)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cPointer;
    @XmlElement(name = "CProcPointer", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-PROC-POINTER", type = CobolType.PROC_POINTER_ITEM, levelNumber = 5, usage = "PROCEDURE-POINTER", srceLine = 37)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cProcPointer;
    @XmlElement(name = "CFuncPointer", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-FUNC-POINTER", type = CobolType.FUNC_POINTER_ITEM, levelNumber = 5, usage = "FUNCTION-POINTER", srceLine = 38)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cFuncPointer;
    @XmlElement(name = "CExternalFloating", required = true)
    @CobolElement(cobolName = "C-EXTERNAL-FLOATING", type = CobolType.EXTERNAL_FLOATING_ITEM, levelNumber = 5, picture = "+99.99E-99", srceLine = 39)
    protected String cExternalFloating;
    @XmlElement(name = "CBinary")
    @CobolElement(cobolName = "C-BINARY", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "BINARY", srceLine = 40)
    protected int cBinary;
    @XmlElement(name = "CNativeBinary")
    @CobolElement(cobolName = "C-NATIVE-BINARY", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "COMP-5", srceLine = 41)
    protected int cNativeBinary;

    /**
     * Gets the value of the cAlphabetic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlphabetic() {
        return cAlphabetic;
    }

    /**
     * Sets the value of the cAlphabetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlphabetic(String value) {
        this.cAlphabetic = value;
    }

    public boolean isSetCAlphabetic() {
        return (this.cAlphabetic!= null);
    }

    /**
     * Gets the value of the cNational property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNational() {
        return cNational;
    }

    /**
     * Sets the value of the cNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNational(String value) {
        this.cNational = value;
    }

    public boolean isSetCNational() {
        return (this.cNational!= null);
    }

    /**
     * Gets the value of the cDbcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDbcs() {
        return cDbcs;
    }

    /**
     * Sets the value of the cDbcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDbcs(String value) {
        this.cDbcs = value;
    }

    public boolean isSetCDbcs() {
        return (this.cDbcs!= null);
    }

    /**
     * Gets the value of the cAlphanumericEdited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlphanumericEdited() {
        return cAlphanumericEdited;
    }

    /**
     * Sets the value of the cAlphanumericEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlphanumericEdited(String value) {
        this.cAlphanumericEdited = value;
    }

    public boolean isSetCAlphanumericEdited() {
        return (this.cAlphanumericEdited!= null);
    }

    /**
     * Gets the value of the cAlphanumeric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlphanumeric() {
        return cAlphanumeric;
    }

    /**
     * Sets the value of the cAlphanumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlphanumeric(String value) {
        this.cAlphanumeric = value;
    }

    public boolean isSetCAlphanumeric() {
        return (this.cAlphanumeric!= null);
    }

    /**
     * Gets the value of the cOctetString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCOctetString() {
        return cOctetString;
    }

    /**
     * Sets the value of the cOctetString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOctetString(byte[] value) {
        this.cOctetString = value;
    }

    public boolean isSetCOctetString() {
        return (this.cOctetString!= null);
    }

    /**
     * Gets the value of the cSingleFloat property.
     * 
     */
    public float getCSingleFloat() {
        return cSingleFloat;
    }

    /**
     * Sets the value of the cSingleFloat property.
     * 
     */
    public void setCSingleFloat(float value) {
        this.cSingleFloat = value;
    }

    public boolean isSetCSingleFloat() {
        return true;
    }

    /**
     * Gets the value of the cDoubleFloat property.
     * 
     */
    public double getCDoubleFloat() {
        return cDoubleFloat;
    }

    /**
     * Sets the value of the cDoubleFloat property.
     * 
     */
    public void setCDoubleFloat(double value) {
        this.cDoubleFloat = value;
    }

    public boolean isSetCDoubleFloat() {
        return true;
    }

    /**
     * Gets the value of the cPackedDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCPackedDecimal() {
        return cPackedDecimal;
    }

    /**
     * Sets the value of the cPackedDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCPackedDecimal(BigDecimal value) {
        this.cPackedDecimal = value;
    }

    public boolean isSetCPackedDecimal() {
        return (this.cPackedDecimal!= null);
    }

    /**
     * Gets the value of the cZonedDecimal property.
     * 
     */
    public long getCZonedDecimal() {
        return cZonedDecimal;
    }

    /**
     * Sets the value of the cZonedDecimal property.
     * 
     */
    public void setCZonedDecimal(long value) {
        this.cZonedDecimal = value;
    }

    public boolean isSetCZonedDecimal() {
        return true;
    }

    /**
     * Gets the value of the cNumericEdited1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited1() {
        return cNumericEdited1;
    }

    /**
     * Sets the value of the cNumericEdited1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited1(String value) {
        this.cNumericEdited1 = value;
    }

    public boolean isSetCNumericEdited1() {
        return (this.cNumericEdited1 != null);
    }

    /**
     * Gets the value of the cNumericEdited2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited2() {
        return cNumericEdited2;
    }

    /**
     * Sets the value of the cNumericEdited2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited2(String value) {
        this.cNumericEdited2 = value;
    }

    public boolean isSetCNumericEdited2() {
        return (this.cNumericEdited2 != null);
    }

    /**
     * Gets the value of the cNumericEdited3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited3() {
        return cNumericEdited3;
    }

    /**
     * Sets the value of the cNumericEdited3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited3(String value) {
        this.cNumericEdited3 = value;
    }

    public boolean isSetCNumericEdited3() {
        return (this.cNumericEdited3 != null);
    }

    /**
     * Gets the value of the cNumericEdited4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited4() {
        return cNumericEdited4;
    }

    /**
     * Sets the value of the cNumericEdited4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited4(String value) {
        this.cNumericEdited4 = value;
    }

    public boolean isSetCNumericEdited4() {
        return (this.cNumericEdited4 != null);
    }

    /**
     * Gets the value of the cIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCIndex() {
        return cIndex;
    }

    /**
     * Sets the value of the cIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIndex(byte[] value) {
        this.cIndex = value;
    }

    public boolean isSetCIndex() {
        return (this.cIndex!= null);
    }

    /**
     * Gets the value of the cPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCPointer() {
        return cPointer;
    }

    /**
     * Sets the value of the cPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPointer(byte[] value) {
        this.cPointer = value;
    }

    public boolean isSetCPointer() {
        return (this.cPointer!= null);
    }

    /**
     * Gets the value of the cProcPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCProcPointer() {
        return cProcPointer;
    }

    /**
     * Sets the value of the cProcPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCProcPointer(byte[] value) {
        this.cProcPointer = value;
    }

    public boolean isSetCProcPointer() {
        return (this.cProcPointer!= null);
    }

    /**
     * Gets the value of the cFuncPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCFuncPointer() {
        return cFuncPointer;
    }

    /**
     * Sets the value of the cFuncPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFuncPointer(byte[] value) {
        this.cFuncPointer = value;
    }

    public boolean isSetCFuncPointer() {
        return (this.cFuncPointer!= null);
    }

    /**
     * Gets the value of the cExternalFloating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCExternalFloating() {
        return cExternalFloating;
    }

    /**
     * Sets the value of the cExternalFloating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCExternalFloating(String value) {
        this.cExternalFloating = value;
    }

    public boolean isSetCExternalFloating() {
        return (this.cExternalFloating!= null);
    }

    /**
     * Gets the value of the cBinary property.
     * 
     */
    public int getCBinary() {
        return cBinary;
    }

    /**
     * Sets the value of the cBinary property.
     * 
     */
    public void setCBinary(int value) {
        this.cBinary = value;
    }

    public boolean isSetCBinary() {
        return true;
    }

    /**
     * Gets the value of the cNativeBinary property.
     * 
     */
    public int getCNativeBinary() {
        return cNativeBinary;
    }

    /**
     * Sets the value of the cNativeBinary property.
     * 
     */
    public void setCNativeBinary(int value) {
        this.cNativeBinary = value;
    }

    public boolean isSetCNativeBinary() {
        return true;
    }

}
