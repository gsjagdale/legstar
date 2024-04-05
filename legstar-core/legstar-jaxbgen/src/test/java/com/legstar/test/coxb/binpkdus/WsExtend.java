
package com.legstar.test.coxb.binpkdus;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsExtend complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsExtend"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsP9X19"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *               &lt;maxInclusive value="9999999999999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsP9X31"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="31"/&gt;
 *               &lt;minInclusive value="0"/&gt;
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
@XmlType(name = "WsExtend", propOrder = {
    "wsP9X19",
    "wsP9X31"
})
public class WsExtend
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsP9X19", required = true)
    @CobolElement(cobolName = "WS-P9X19", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, isSigned = false, totalDigits = 19, picture = "9(19)", usage = "PACKED-DECIMAL", value = "1234567890123456789", srceLine = 40)
    protected BigInteger wsP9X19 = (new BigInteger("1234567890123456789"));
    @XmlElement(name = "WsP9X31", required = true)
    @CobolElement(cobolName = "WS-P9X31", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, isSigned = false, totalDigits = 31, picture = "9(31)", usage = "PACKED-DECIMAL", value = "1234567890123456789012345678901", srceLine = 42)
    protected BigInteger wsP9X31 = (new BigInteger("1234567890123456789012345678901"));

    /**
     * Gets the value of the wsP9X19 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWsP9X19() {
        return wsP9X19;
    }

    /**
     * Sets the value of the wsP9X19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWsP9X19(BigInteger value) {
        this.wsP9X19 = value;
    }

    public boolean isSetWsP9X19() {
        return (this.wsP9X19 != null);
    }

    /**
     * Gets the value of the wsP9X31 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWsP9X31() {
        return wsP9X31;
    }

    /**
     * Sets the value of the wsP9X31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWsP9X31(BigInteger value) {
        this.wsP9X31 = value;
    }

    public boolean isSetWsP9X31() {
        return (this.wsP9X31 != null);
    }

}
