
package com.legstar.test.coxb.dplarcht;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsTransactionDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsTransactionDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsTransactionStart"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsTransactionName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsTransactionProgram"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsTransactionStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="8"/&gt;
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
@XmlType(name = "WsTransactionDescription", propOrder = {
    "wsTransactionStart",
    "wsTransactionName",
    "wsTransactionProgram",
    "wsTransactionStatus"
})
public class WsTransactionDescription
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsTransactionStart", required = true)
    @CobolElement(cobolName = "WS-TRANSACTION-START", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = " ", srceLine = 68)
    protected String wsTransactionStart = "";
    @XmlElement(name = "WsTransactionName", required = true)
    @CobolElement(cobolName = "WS-TRANSACTION-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = " ", srceLine = 69)
    protected String wsTransactionName = "";
    @XmlElement(name = "WsTransactionProgram", required = true)
    @CobolElement(cobolName = "WS-TRANSACTION-PROGRAM", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = " ", srceLine = 70)
    protected String wsTransactionProgram = "";
    @XmlElement(name = "WsTransactionStatus")
    @CobolElement(cobolName = "WS-TRANSACTION-STATUS", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "BINARY", value = "0", srceLine = 71)
    protected long wsTransactionStatus = 0L;

    /**
     * Gets the value of the wsTransactionStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsTransactionStart() {
        return wsTransactionStart;
    }

    /**
     * Sets the value of the wsTransactionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsTransactionStart(String value) {
        this.wsTransactionStart = value;
    }

    public boolean isSetWsTransactionStart() {
        return (this.wsTransactionStart!= null);
    }

    /**
     * Gets the value of the wsTransactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsTransactionName() {
        return wsTransactionName;
    }

    /**
     * Sets the value of the wsTransactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsTransactionName(String value) {
        this.wsTransactionName = value;
    }

    public boolean isSetWsTransactionName() {
        return (this.wsTransactionName!= null);
    }

    /**
     * Gets the value of the wsTransactionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsTransactionProgram() {
        return wsTransactionProgram;
    }

    /**
     * Sets the value of the wsTransactionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsTransactionProgram(String value) {
        this.wsTransactionProgram = value;
    }

    public boolean isSetWsTransactionProgram() {
        return (this.wsTransactionProgram!= null);
    }

    /**
     * Gets the value of the wsTransactionStatus property.
     * 
     */
    public long getWsTransactionStatus() {
        return wsTransactionStatus;
    }

    /**
     * Sets the value of the wsTransactionStatus property.
     * 
     */
    public void setWsTransactionStatus(long value) {
        this.wsTransactionStatus = value;
    }

    public boolean isSetWsTransactionStatus() {
        return true;
    }

}
