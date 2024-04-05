
package com.legstar.test.coxb.dplarcht;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsTransactionsData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LsTransactionsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LsTransactionName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsTransactionProgram"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsTransactionStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Filler119"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="36"/&gt;
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
@XmlType(name = "LsTransactionsData", propOrder = {
    "lsTransactionName",
    "lsTransactionProgram",
    "lsTransactionStatus",
    "filler119"
})
public class LsTransactionsData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsTransactionName", required = true)
    @CobolElement(cobolName = "LS-TRANSACTION-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(8)", srceLine = 116)
    protected String lsTransactionName;
    @XmlElement(name = "LsTransactionProgram", required = true)
    @CobolElement(cobolName = "LS-TRANSACTION-PROGRAM", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(8)", srceLine = 117)
    protected String lsTransactionProgram;
    @XmlElement(name = "LsTransactionStatus", required = true)
    @CobolElement(cobolName = "LS-TRANSACTION-STATUS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(12)", srceLine = 118)
    protected String lsTransactionStatus;
    @XmlElement(name = "Filler119", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(36)", srceLine = 119)
    protected String filler119;

    /**
     * Gets the value of the lsTransactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsTransactionName() {
        return lsTransactionName;
    }

    /**
     * Sets the value of the lsTransactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsTransactionName(String value) {
        this.lsTransactionName = value;
    }

    public boolean isSetLsTransactionName() {
        return (this.lsTransactionName!= null);
    }

    /**
     * Gets the value of the lsTransactionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsTransactionProgram() {
        return lsTransactionProgram;
    }

    /**
     * Sets the value of the lsTransactionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsTransactionProgram(String value) {
        this.lsTransactionProgram = value;
    }

    public boolean isSetLsTransactionProgram() {
        return (this.lsTransactionProgram!= null);
    }

    /**
     * Gets the value of the lsTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsTransactionStatus() {
        return lsTransactionStatus;
    }

    /**
     * Sets the value of the lsTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsTransactionStatus(String value) {
        this.lsTransactionStatus = value;
    }

    public boolean isSetLsTransactionStatus() {
        return (this.lsTransactionStatus!= null);
    }

    /**
     * Gets the value of the filler119 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller119() {
        return filler119;
    }

    /**
     * Sets the value of the filler119 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller119(String value) {
        this.filler119 = value;
    }

    public boolean isSetFiller119() {
        return (this.filler119 != null);
    }

}
