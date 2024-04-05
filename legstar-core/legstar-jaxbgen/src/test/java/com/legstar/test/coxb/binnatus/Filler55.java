
package com.legstar.test.coxb.binnatus;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler55 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler55"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsPs9X4Dis1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,5}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X9Dis1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X18Dis1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="21"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,20}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X4Dis2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,5}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X9Dis2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X18Dis2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="21"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,20}"/&gt;
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
@XmlType(name = "Filler55", propOrder = {
    "wsPs9X4Dis1",
    "wsPs9X9Dis1",
    "wsPs9X18Dis1",
    "wsPs9X4Dis2",
    "wsPs9X9Dis2",
    "wsPs9X18Dis2"
})
public class Filler55
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsPs9X4Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X4-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 5, picture = "+9(5)", srceLine = 56)
    protected String wsPs9X4Dis1;
    @XmlElement(name = "WsPs9X9Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X9-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 10, picture = "+9(10)", srceLine = 57)
    protected String wsPs9X9Dis1;
    @XmlElement(name = "WsPs9X18Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 20, picture = "+9(20)", srceLine = 58)
    protected String wsPs9X18Dis1;
    @XmlElement(name = "WsPs9X4Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X4-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 5, picture = "+9(5)", srceLine = 59)
    protected String wsPs9X4Dis2;
    @XmlElement(name = "WsPs9X9Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X9-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 10, picture = "+9(10)", srceLine = 60)
    protected String wsPs9X9Dis2;
    @XmlElement(name = "WsPs9X18Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 20, picture = "+9(20)", srceLine = 61)
    protected String wsPs9X18Dis2;

    /**
     * Gets the value of the wsPs9X4Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X4Dis1() {
        return wsPs9X4Dis1;
    }

    /**
     * Sets the value of the wsPs9X4Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X4Dis1(String value) {
        this.wsPs9X4Dis1 = value;
    }

    public boolean isSetWsPs9X4Dis1() {
        return (this.wsPs9X4Dis1 != null);
    }

    /**
     * Gets the value of the wsPs9X9Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X9Dis1() {
        return wsPs9X9Dis1;
    }

    /**
     * Sets the value of the wsPs9X9Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X9Dis1(String value) {
        this.wsPs9X9Dis1 = value;
    }

    public boolean isSetWsPs9X9Dis1() {
        return (this.wsPs9X9Dis1 != null);
    }

    /**
     * Gets the value of the wsPs9X18Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X18Dis1() {
        return wsPs9X18Dis1;
    }

    /**
     * Sets the value of the wsPs9X18Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X18Dis1(String value) {
        this.wsPs9X18Dis1 = value;
    }

    public boolean isSetWsPs9X18Dis1() {
        return (this.wsPs9X18Dis1 != null);
    }

    /**
     * Gets the value of the wsPs9X4Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X4Dis2() {
        return wsPs9X4Dis2;
    }

    /**
     * Sets the value of the wsPs9X4Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X4Dis2(String value) {
        this.wsPs9X4Dis2 = value;
    }

    public boolean isSetWsPs9X4Dis2() {
        return (this.wsPs9X4Dis2 != null);
    }

    /**
     * Gets the value of the wsPs9X9Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X9Dis2() {
        return wsPs9X9Dis2;
    }

    /**
     * Sets the value of the wsPs9X9Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X9Dis2(String value) {
        this.wsPs9X9Dis2 = value;
    }

    public boolean isSetWsPs9X9Dis2() {
        return (this.wsPs9X9Dis2 != null);
    }

    /**
     * Gets the value of the wsPs9X18Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X18Dis2() {
        return wsPs9X18Dis2;
    }

    /**
     * Sets the value of the wsPs9X18Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X18Dis2(String value) {
        this.wsPs9X18Dis2 = value;
    }

    public boolean isSetWsPs9X18Dis2() {
        return (this.wsPs9X18Dis2 != null);
    }

}
