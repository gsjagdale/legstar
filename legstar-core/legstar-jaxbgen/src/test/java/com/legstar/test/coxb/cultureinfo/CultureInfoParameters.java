
package com.legstar.test.coxb.cultureinfo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for cultureInfoParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="cultureInfoParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cultureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decimalNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cultureInfoParameters", propOrder = {
    "cultureCode",
    "decimalNumber"
})
public class CultureInfoParameters
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @CobolElement(cobolName = "cultureCode", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(32)", usage = "DISPLAY")
    protected String cultureCode;
    @CobolElement(cobolName = "decimalNumber", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, fractionDigits = 2, picture = "9(7)V9(2)", usage = "COMP-3")
    protected BigDecimal decimalNumber;

    /**
     * Gets the value of the cultureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCultureCode() {
        return cultureCode;
    }

    /**
     * Sets the value of the cultureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCultureCode(String value) {
        this.cultureCode = value;
    }

    public boolean isSetCultureCode() {
        return (this.cultureCode!= null);
    }

    /**
     * Gets the value of the decimalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalNumber() {
        return decimalNumber;
    }

    /**
     * Sets the value of the decimalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalNumber(BigDecimal value) {
        this.decimalNumber = value;
    }

    public boolean isSetDecimalNumber() {
        return (this.decimalNumber!= null);
    }

}
