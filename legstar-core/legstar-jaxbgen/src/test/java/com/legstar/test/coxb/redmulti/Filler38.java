
package com.legstar.test.coxb.redmulti;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler38 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler38"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CErrorNum"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CErrorDescription"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="196"/&gt;
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
@XmlType(name = "Filler38", propOrder = {
    "cErrorNum",
    "cErrorDescription"
})
public class Filler38
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CErrorNum")
    @CobolElement(cobolName = "C-ERROR-NUM", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, picture = "9(4)", srceLine = 39)
    protected int cErrorNum;
    @XmlElement(name = "CErrorDescription", required = true)
    @CobolElement(cobolName = "C-ERROR-DESCRIPTION", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(196)", srceLine = 40)
    protected String cErrorDescription;

    /**
     * Gets the value of the cErrorNum property.
     * 
     */
    public int getCErrorNum() {
        return cErrorNum;
    }

    /**
     * Sets the value of the cErrorNum property.
     * 
     */
    public void setCErrorNum(int value) {
        this.cErrorNum = value;
    }

    public boolean isSetCErrorNum() {
        return true;
    }

    /**
     * Gets the value of the cErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCErrorDescription() {
        return cErrorDescription;
    }

    /**
     * Sets the value of the cErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCErrorDescription(String value) {
        this.cErrorDescription = value;
    }

    public boolean isSetCErrorDescription() {
        return (this.cErrorDescription!= null);
    }

}
