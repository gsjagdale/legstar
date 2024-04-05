
package com.legstar.test.coxb.arraysdo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsOdo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsOdo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filler21"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsOdoA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="2"/&gt;
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
@XmlType(name = "WsOdo", propOrder = {
    "filler21",
    "wsOdoA"
})
public class WsOdo
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Filler21", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(3)", value = "ODO", srceLine = 21)
    protected String filler21 = "ODO";
    @XmlElement(name = "WsOdoA")
    @CobolElement(cobolName = "WS-ODO-A", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 2, picture = "9(2)", srceLine = 22)
    protected int wsOdoA;

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
     * Gets the value of the wsOdoA property.
     * 
     */
    public int getWsOdoA() {
        return wsOdoA;
    }

    /**
     * Sets the value of the wsOdoA property.
     * 
     */
    public void setWsOdoA(int value) {
        this.wsOdoA = value;
    }

    public boolean isSetWsOdoA() {
        return true;
    }

}
