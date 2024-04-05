
package com.legstar.test.coxb.lsfileac;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WQueryData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WQueryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WQueryName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WQueryAddress"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WQueryPhone"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
@XmlType(name = "WQueryData", propOrder = {
    "wQueryName",
    "wQueryAddress",
    "wQueryPhone"
})
public class WQueryData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WQueryName", required = true)
    @CobolElement(cobolName = "W-QUERY-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", value = "*", srceLine = 32)
    protected String wQueryName = "*";
    @XmlElement(name = "WQueryAddress", required = true)
    @CobolElement(cobolName = "W-QUERY-ADDRESS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", value = "*", srceLine = 33)
    protected String wQueryAddress = "*";
    @XmlElement(name = "WQueryPhone", required = true)
    @CobolElement(cobolName = "W-QUERY-PHONE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = "*", srceLine = 34)
    protected String wQueryPhone = "*";

    /**
     * Gets the value of the wQueryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWQueryName() {
        return wQueryName;
    }

    /**
     * Sets the value of the wQueryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWQueryName(String value) {
        this.wQueryName = value;
    }

    public boolean isSetWQueryName() {
        return (this.wQueryName!= null);
    }

    /**
     * Gets the value of the wQueryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWQueryAddress() {
        return wQueryAddress;
    }

    /**
     * Sets the value of the wQueryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWQueryAddress(String value) {
        this.wQueryAddress = value;
    }

    public boolean isSetWQueryAddress() {
        return (this.wQueryAddress!= null);
    }

    /**
     * Gets the value of the wQueryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWQueryPhone() {
        return wQueryPhone;
    }

    /**
     * Sets the value of the wQueryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWQueryPhone(String value) {
        this.wQueryPhone = value;
    }

    public boolean isSetWQueryPhone() {
        return (this.wQueryPhone!= null);
    }

}
