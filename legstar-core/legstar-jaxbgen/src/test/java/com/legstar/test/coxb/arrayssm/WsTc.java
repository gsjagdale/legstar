
package com.legstar.test.coxb.arrayssm;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsTc complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsTc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filler24"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsTcA"&gt;
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
@XmlType(name = "WsTc", propOrder = {
    "filler24",
    "wsTcA"
})
public class WsTc
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Filler24", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(4)", value = "TCEC", srceLine = 24)
    protected String filler24 = "TCEC";
    @XmlElement(name = "WsTcA")
    @CobolElement(cobolName = "WS-TC-A", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 1, picture = "9(1)", srceLine = 25)
    protected int wsTcA;

    /**
     * Gets the value of the filler24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller24() {
        return filler24;
    }

    /**
     * Sets the value of the filler24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller24(String value) {
        this.filler24 = value;
    }

    public boolean isSetFiller24() {
        return (this.filler24 != null);
    }

    /**
     * Gets the value of the wsTcA property.
     * 
     */
    public int getWsTcA() {
        return wsTcA;
    }

    /**
     * Sets the value of the wsTcA property.
     * 
     */
    public void setWsTcA(int value) {
        this.wsTcA = value;
    }

    public boolean isSetWsTcA() {
        return true;
    }

}
