
package com.legstar.test.coxb.varar021;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler23 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler23"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="WAlpha"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;maxLength value="5"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="WNum"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                 &lt;totalDigits value="5"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filler23", propOrder = {
    "wAlpha",
    "wNum"
})
public class Filler23
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WAlpha")
    @CobolElement(cobolName = "W-ALPHA", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, isRedefined = true, picture = "X(05)", srceLine = 24)
    protected String wAlpha;
    @XmlElement(name = "WNum")
    @CobolElement(cobolName = "W-NUM", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 5, redefines = "W-ALPHA", picture = "9(05)", srceLine = 25)
    protected Long wNum;

    /**
     * Gets the value of the wAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAlpha() {
        return wAlpha;
    }

    /**
     * Sets the value of the wAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAlpha(String value) {
        this.wAlpha = value;
    }

    public boolean isSetWAlpha() {
        return (this.wAlpha!= null);
    }

    /**
     * Gets the value of the wNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWNum() {
        return wNum;
    }

    /**
     * Sets the value of the wNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWNum(Long value) {
        this.wNum = value;
    }

    public boolean isSetWNum() {
        return (this.wNum!= null);
    }

}
