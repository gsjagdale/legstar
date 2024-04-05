
package com.legstar.test.coxb.redopera;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler28 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler28"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CInteger"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Filler30"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="192"/&gt;
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
@XmlType(name = "Filler28", propOrder = {
    "cInteger",
    "filler30"
})
public class Filler28
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CInteger")
    @CobolElement(cobolName = "C-INTEGER", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 8, picture = "S9(8)", srceLine = 29)
    protected int cInteger;
    @XmlElement(name = "Filler30", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(192)", srceLine = 30)
    protected String filler30;

    /**
     * Gets the value of the cInteger property.
     * 
     */
    public int getCInteger() {
        return cInteger;
    }

    /**
     * Sets the value of the cInteger property.
     * 
     */
    public void setCInteger(int value) {
        this.cInteger = value;
    }

    public boolean isSetCInteger() {
        return true;
    }

    /**
     * Gets the value of the filler30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller30() {
        return filler30;
    }

    /**
     * Sets the value of the filler30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller30(String value) {
        this.filler30 = value;
    }

    public boolean isSetFiller30() {
        return (this.filler30 != null);
    }

}
