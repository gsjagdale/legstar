
package com.legstar.test.coxb.rq071;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for RQ071Input complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="RQ071Input"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fill__0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rq071__bp__id"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
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
@XmlType(name = "RQ071Input", propOrder = {
    "fill__0",
    "rq071__bp__id"
})
public class RQ071Input
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(required = true)
    @CobolElement(cobolName = "fill--0", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 3, picture = "X(16)", usage = "DISPLAY")
    protected String fill__0;
    @XmlElement(required = true)
    @CobolElement(cobolName = "rq071--bp--id", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 3, picture = "X(9)", usage = "DISPLAY")
    protected String rq071__bp__id;

    /**
     * Gets the value of the fill__0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill__0() {
        return fill__0;
    }

    /**
     * Sets the value of the fill__0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill__0(String value) {
        this.fill__0 = value;
    }

    public boolean isSetFill__0() {
        return (this.fill__0 != null);
    }

    /**
     * Gets the value of the rq071__bp__id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRq071__bp__id() {
        return rq071__bp__id;
    }

    /**
     * Sets the value of the rq071__bp__id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRq071__bp__id(String value) {
        this.rq071__bp__id = value;
    }

    public boolean isSetRq071__bp__id() {
        return (this.rq071__bp__id!= null);
    }

}
