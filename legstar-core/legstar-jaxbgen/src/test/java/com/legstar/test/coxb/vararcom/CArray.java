
package com.legstar.test.coxb.vararcom;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for CArray complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="CArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CItem1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CItem2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *               &lt;totalDigits value="4"/&gt;
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
@XmlType(name = "CArray", propOrder = {
    "cItem1",
    "cItem2"
})
public class CArray
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CItem1", required = true)
    @CobolElement(cobolName = "C-ITEM-1", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(5)", srceLine = 24)
    protected String cItem1;
    @XmlElement(name = "CItem2")
    @CobolElement(cobolName = "C-ITEM-2", type = CobolType.BINARY_ITEM, levelNumber = 10, isSigned = true, totalDigits = 4, picture = "S9(4)", usage = "BINARY", srceLine = 25)
    protected short cItem2;

    /**
     * Gets the value of the cItem1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCItem1() {
        return cItem1;
    }

    /**
     * Sets the value of the cItem1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCItem1(String value) {
        this.cItem1 = value;
    }

    public boolean isSetCItem1() {
        return (this.cItem1 != null);
    }

    /**
     * Gets the value of the cItem2 property.
     * 
     */
    public short getCItem2() {
        return cItem2;
    }

    /**
     * Sets the value of the cItem2 property.
     * 
     */
    public void setCItem2(short value) {
        this.cItem2 = value;
    }

    public boolean isSetCItem2() {
        return true;
    }

}
