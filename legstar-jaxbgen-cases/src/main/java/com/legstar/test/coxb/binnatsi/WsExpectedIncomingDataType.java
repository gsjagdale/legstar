//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 01:37:31 PM CEST 
//


package com.legstar.test.coxb.binnatsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsExpectedIncomingDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsExpectedIncomingDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsUnsignedNative" type="{http://legstar.com/test/coxb/binnatsi}WsUnsignedNativeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsExpectedIncomingDataType", propOrder = {
    "wsUnsignedNative"
})
public class WsExpectedIncomingDataType {

    @XmlElement(name = "WsUnsignedNative", required = true)
    @CobolElement(cobolName = "WS-UNSIGNED-NATIVE", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 30)
    protected WsUnsignedNativeType wsUnsignedNative;

    /**
     * Gets the value of the wsUnsignedNative property.
     * 
     * @return
     *     possible object is
     *     {@link WsUnsignedNativeType }
     *     
     */
    public WsUnsignedNativeType getWsUnsignedNative() {
        return wsUnsignedNative;
    }

    /**
     * Sets the value of the wsUnsignedNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsUnsignedNativeType }
     *     
     */
    public void setWsUnsignedNative(WsUnsignedNativeType value) {
        this.wsUnsignedNative = value;
    }

    public boolean isSetWsUnsignedNative() {
        return (this.wsUnsignedNative!= null);
    }

}
