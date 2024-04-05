
package com.legstar.test.coxb.binpkdus;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler45 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler45"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsPs9X18Dis1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,18}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X18Dis2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,18}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X31Dis1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,31}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsPs9X31Dis2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *               &lt;pattern value="[\+\-\d]?\d{0,31}"/&gt;
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
@XmlType(name = "Filler45", propOrder = {
    "wsPs9X18Dis1",
    "wsPs9X18Dis2",
    "wsPs9X31Dis1",
    "wsPs9X31Dis2"
})
public class Filler45
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsPs9X18Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 18, picture = "+9(18)", srceLine = 46)
    protected String wsPs9X18Dis1;
    @XmlElement(name = "WsPs9X18Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X18-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 18, picture = "+9(18)", srceLine = 47)
    protected String wsPs9X18Dis2;
    @XmlElement(name = "WsPs9X31Dis1", required = true)
    @CobolElement(cobolName = "WS-PS9X31-DIS-1", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 31, picture = "+9(31)", srceLine = 48)
    protected String wsPs9X31Dis1;
    @XmlElement(name = "WsPs9X31Dis2", required = true)
    @CobolElement(cobolName = "WS-PS9X31-DIS-2", type = CobolType.NUMERIC_EDITED_ITEM, levelNumber = 5, isSigned = true, totalDigits = 31, picture = "+9(31)", srceLine = 49)
    protected String wsPs9X31Dis2;

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

    /**
     * Gets the value of the wsPs9X31Dis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X31Dis1() {
        return wsPs9X31Dis1;
    }

    /**
     * Sets the value of the wsPs9X31Dis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X31Dis1(String value) {
        this.wsPs9X31Dis1 = value;
    }

    public boolean isSetWsPs9X31Dis1() {
        return (this.wsPs9X31Dis1 != null);
    }

    /**
     * Gets the value of the wsPs9X31Dis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPs9X31Dis2() {
        return wsPs9X31Dis2;
    }

    /**
     * Sets the value of the wsPs9X31Dis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPs9X31Dis2(String value) {
        this.wsPs9X31Dis2 = value;
    }

    public boolean isSetWsPs9X31Dis2() {
        return (this.wsPs9X31Dis2 != null);
    }

}
