//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 01:37:31 PM CEST 
//


package com.legstar.test.coxb.dplarcht;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsReplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsReplyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsReplyType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsReplyData" type="{http://legstar.com/test/coxb/dplarcht}LsReplyDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsReplyType", propOrder = {
    "lsReplyType",
    "lsReplyData"
})
public class LsReplyType {

    @XmlElement(name = "LsReplyType")
    @CobolElement(cobolName = "LS-REPLY-TYPE", type = CobolType.BINARY_ITEM, levelNumber = 10, byteLength = 2, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "BINARY", srceLine = 94)
    protected int lsReplyType;
    @XmlElement(name = "LsReplyData", required = true)
    @CobolElement(cobolName = "LS-REPLY-DATA", type = CobolType.GROUP_ITEM, levelNumber = 10, srceLine = 98)
    protected LsReplyDataType lsReplyData;

    /**
     * Gets the value of the lsReplyType property.
     * 
     */
    public int getLsReplyType() {
        return lsReplyType;
    }

    /**
     * Sets the value of the lsReplyType property.
     * 
     */
    public void setLsReplyType(int value) {
        this.lsReplyType = value;
    }

    public boolean isSetLsReplyType() {
        return true;
    }

    /**
     * Gets the value of the lsReplyData property.
     * 
     * @return
     *     possible object is
     *     {@link LsReplyDataType }
     *     
     */
    public LsReplyDataType getLsReplyData() {
        return lsReplyData;
    }

    /**
     * Sets the value of the lsReplyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsReplyDataType }
     *     
     */
    public void setLsReplyData(LsReplyDataType value) {
        this.lsReplyData = value;
    }

    public boolean isSetLsReplyData() {
        return (this.lsReplyData!= null);
    }

}
