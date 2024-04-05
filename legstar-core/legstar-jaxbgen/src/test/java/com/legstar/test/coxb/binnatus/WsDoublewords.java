
package com.legstar.test.coxb.binnatus;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsDoublewords complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsDoublewords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsP9X18Min"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsP9X18Low"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="WsP9X18HighB" type="{http://legstar.com/test/coxb/binnatus}WsP9X18HighB"/&gt;
 *           &lt;element name="WsP9X18High"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="WsP9X18MaxB" type="{http://legstar.com/test/coxb/binnatus}WsP9X18MaxB"/&gt;
 *         &lt;element name="WsP9X18Max"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
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
@XmlType(name = "WsDoublewords", propOrder = {
    "wsP9X18Min",
    "wsP9X18Low",
    "wsP9X18HighB",
    "wsP9X18High",
    "wsP9X18MaxB",
    "wsP9X18Max"
})
public class WsDoublewords
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsP9X18Min", required = true)
    @CobolElement(cobolName = "WS-P9X18-MIN", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", value = "0", srceLine = 42)
    protected BigInteger wsP9X18Min = (new BigInteger("0"));
    @XmlElement(name = "WsP9X18Low", required = true)
    @CobolElement(cobolName = "WS-P9X18-LOW", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, picture = "9(18)", usage = "COMP-5", value = "4294967294", srceLine = 43)
    protected BigInteger wsP9X18Low = (new BigInteger("4294967294"));
    @XmlElement(name = "WsP9X18HighB")
    @CobolElement(cobolName = "WS-P9X18-HIGH-B", type = CobolType.GROUP_ITEM, levelNumber = 15, isRedefined = true, srceLine = 44)
    protected WsP9X18HighB wsP9X18HighB;
    @XmlElement(name = "WsP9X18High")
    @CobolElement(cobolName = "WS-P9X18-HIGH", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, redefines = "WS-P9X18-HIGH-B", picture = "9(18)", usage = "COMP-5", srceLine = 47)
    protected BigInteger wsP9X18High;
    @XmlElement(name = "WsP9X18MaxB", required = true)
    @CobolElement(cobolName = "WS-P9X18-MAX-B", type = CobolType.GROUP_ITEM, levelNumber = 15, isRedefined = true, srceLine = 49)
    protected WsP9X18MaxB wsP9X18MaxB;
    @XmlElement(name = "WsP9X18Max", required = true)
    @CobolElement(cobolName = "WS-P9X18-MAX", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 15, isSigned = false, totalDigits = 18, redefines = "WS-P9X18-MAX-B", picture = "9(18)", usage = "COMP-5", srceLine = 52)
    protected BigInteger wsP9X18Max;

    /**
     * Gets the value of the wsP9X18Min property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWsP9X18Min() {
        return wsP9X18Min;
    }

    /**
     * Sets the value of the wsP9X18Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWsP9X18Min(BigInteger value) {
        this.wsP9X18Min = value;
    }

    public boolean isSetWsP9X18Min() {
        return (this.wsP9X18Min!= null);
    }

    /**
     * Gets the value of the wsP9X18Low property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWsP9X18Low() {
        return wsP9X18Low;
    }

    /**
     * Sets the value of the wsP9X18Low property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWsP9X18Low(BigInteger value) {
        this.wsP9X18Low = value;
    }

    public boolean isSetWsP9X18Low() {
        return (this.wsP9X18Low!= null);
    }

    /**
     * Gets the value of the wsP9X18HighB property.
     * 
     * @return
     *     possible object is
     *     {@link WsP9X18HighB }
     *     
     */
    public WsP9X18HighB getWsP9X18HighB() {
        return wsP9X18HighB;
    }

    /**
     * Sets the value of the wsP9X18HighB property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsP9X18HighB }
     *     
     */
    public void setWsP9X18HighB(WsP9X18HighB value) {
        this.wsP9X18HighB = value;
    }

    public boolean isSetWsP9X18HighB() {
        return (this.wsP9X18HighB!= null);
    }

    /**
     * Gets the value of the wsP9X18High property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWsP9X18High() {
        return wsP9X18High;
    }

    /**
     * Sets the value of the wsP9X18High property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWsP9X18High(BigInteger value) {
        this.wsP9X18High = value;
    }

    public boolean isSetWsP9X18High() {
        return (this.wsP9X18High!= null);
    }

    /**
     * Gets the value of the wsP9X18MaxB property.
     * 
     * @return
     *     possible object is
     *     {@link WsP9X18MaxB }
     *     
     */
    public WsP9X18MaxB getWsP9X18MaxB() {
        return wsP9X18MaxB;
    }

    /**
     * Sets the value of the wsP9X18MaxB property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsP9X18MaxB }
     *     
     */
    public void setWsP9X18MaxB(WsP9X18MaxB value) {
        this.wsP9X18MaxB = value;
    }

    public boolean isSetWsP9X18MaxB() {
        return (this.wsP9X18MaxB!= null);
    }

    /**
     * Gets the value of the wsP9X18Max property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWsP9X18Max() {
        return wsP9X18Max;
    }

    /**
     * Sets the value of the wsP9X18Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWsP9X18Max(BigInteger value) {
        this.wsP9X18Max = value;
    }

    public boolean isSetWsP9X18Max() {
        return (this.wsP9X18Max!= null);
    }

}
