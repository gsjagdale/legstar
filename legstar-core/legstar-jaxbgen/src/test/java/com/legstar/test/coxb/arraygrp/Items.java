
package com.legstar.test.coxb.arraygrp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Items complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Items"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemDesc"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="9"/&gt;
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
@XmlType(name = "Items", propOrder = {
    "itemDesc",
    "itemNumber"
})
public class Items
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ItemDesc", required = true)
    @CobolElement(cobolName = "ITEM-DESC", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(10)", srceLine = 9)
    protected String itemDesc;
    @XmlElement(name = "ItemNumber")
    @CobolElement(cobolName = "ITEM-NUMBER", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 9, picture = "9(9)", srceLine = 10)
    protected long itemNumber;

    /**
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    public boolean isSetItemDesc() {
        return (this.itemDesc!= null);
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     */
    public long getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     */
    public void setItemNumber(long value) {
        this.itemNumber = value;
    }

    public boolean isSetItemNumber() {
        return true;
    }

}
