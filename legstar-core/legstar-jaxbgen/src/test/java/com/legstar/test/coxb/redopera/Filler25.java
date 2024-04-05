
package com.legstar.test.coxb.redopera;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler25 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler25"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CString"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Filler27"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="170"/&gt;
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
@XmlType(name = "Filler25", propOrder = {
    "cString",
    "filler27"
})
public class Filler25
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CString", required = true)
    @CobolElement(cobolName = "C-STRING", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(30)", srceLine = 26)
    protected String cString;
    @XmlElement(name = "Filler27", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(170)", srceLine = 27)
    protected String filler27;

    /**
     * Gets the value of the cString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCString() {
        return cString;
    }

    /**
     * Sets the value of the cString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCString(String value) {
        this.cString = value;
    }

    public boolean isSetCString() {
        return (this.cString!= null);
    }

    /**
     * Gets the value of the filler27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller27() {
        return filler27;
    }

    /**
     * Sets the value of the filler27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller27(String value) {
        this.filler27 = value;
    }

    public boolean isSetFiller27() {
        return (this.filler27 != null);
    }

}
