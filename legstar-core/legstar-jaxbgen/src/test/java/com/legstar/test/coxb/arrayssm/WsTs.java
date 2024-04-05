
package com.legstar.test.coxb.arrayssm;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsTs complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsTs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filler21"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsTsA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="1"/&gt;
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
@XmlType(name = "WsTs", propOrder = {
    "filler21",
    "wsTsA"
})
public class WsTs
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Filler21", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(2)", value = "TS", srceLine = 21)
    protected String filler21 = "TS";
    @XmlElement(name = "WsTsA")
    @CobolElement(cobolName = "WS-TS-A", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 1, picture = "9(1)", srceLine = 22)
    protected int wsTsA;

    /**
     * Gets the value of the filler21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller21() {
        return filler21;
    }

    /**
     * Sets the value of the filler21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller21(String value) {
        this.filler21 = value;
    }

    public boolean isSetFiller21() {
        return (this.filler21 != null);
    }

    /**
     * Gets the value of the wsTsA property.
     * 
     */
    public int getWsTsA() {
        return wsTsA;
    }

    /**
     * Sets the value of the wsTsA property.
     * 
     */
    public void setWsTsA(int value) {
        this.wsTsA = value;
    }

    public boolean isSetWsTsA() {
        return true;
    }

}
