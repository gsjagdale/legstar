
package com.legstar.test.coxb.redbotha;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Dfhcommarea complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Dfhcommarea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CNumeric"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                 &lt;totalDigits value="4"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Filler22" type="{http://legstar.com/test/coxb/redbotha}Filler22"/&gt;
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
@XmlType(name = "Dfhcommarea", propOrder = {
    "cNumeric",
    "filler22"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CNumeric")
    @CobolElement(cobolName = "C-NUMERIC", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, isRedefined = true, picture = "9(4)", usage = "BINARY", unmarshalChoiceStrategyClassName = "com.legstar.coxb.cust.redbotha.ChoiceSelector", srceLine = 21)
    protected Integer cNumeric;
    @XmlElement(name = "Filler22")
    @CobolElement(cobolName = "FILLER", type = CobolType.GROUP_ITEM, levelNumber = 5, redefines = "C-NUMERIC", srceLine = 22)
    protected Filler22 filler22;

    /**
     * Gets the value of the cNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCNumeric() {
        return cNumeric;
    }

    /**
     * Sets the value of the cNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCNumeric(Integer value) {
        this.cNumeric = value;
    }

    public boolean isSetCNumeric() {
        return (this.cNumeric!= null);
    }

    /**
     * Gets the value of the filler22 property.
     * 
     * @return
     *     possible object is
     *     {@link Filler22 }
     *     
     */
    public Filler22 getFiller22() {
        return filler22;
    }

    /**
     * Sets the value of the filler22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filler22 }
     *     
     */
    public void setFiller22(Filler22 value) {
        this.filler22 = value;
    }

    public boolean isSetFiller22() {
        return (this.filler22 != null);
    }

}
