
package com.legstar.test.coxb.tcobwvb;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Transaction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TransactionDate"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;maxLength value="8"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Filler40" type="{http://legstar.com/test/coxb/tcobwvb}Filler40"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="TransactionAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionComment"&gt;
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
@XmlType(name = "Transaction", propOrder = {
    "transactionDate",
    "filler40",
    "transactionAmount",
    "transactionComment"
})
public class Transaction
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "TransactionDate")
    @CobolElement(cobolName = "TRANSACTION-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, isRedefined = true, picture = "X(8)", srceLine = 39)
    protected String transactionDate;
    @XmlElement(name = "Filler40")
    @CobolElement(cobolName = "FILLER", type = CobolType.GROUP_ITEM, levelNumber = 15, redefines = "TRANSACTION-DATE", srceLine = 40)
    protected Filler40 filler40;
    @XmlElement(name = "TransactionAmount", required = true)
    @CobolElement(cobolName = "TRANSACTION-AMOUNT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, isSigned = true, totalDigits = 15, fractionDigits = 2, picture = "S9(13)V99", usage = "PACKED-DECIMAL", srceLine = 46)
    protected BigDecimal transactionAmount;
    @XmlElement(name = "TransactionComment", required = true)
    @CobolElement(cobolName = "TRANSACTION-COMMENT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(9)", srceLine = 47)
    protected String transactionComment;

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    public boolean isSetTransactionDate() {
        return (this.transactionDate!= null);
    }

    /**
     * Gets the value of the filler40 property.
     * 
     * @return
     *     possible object is
     *     {@link Filler40 }
     *     
     */
    public Filler40 getFiller40() {
        return filler40;
    }

    /**
     * Sets the value of the filler40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filler40 }
     *     
     */
    public void setFiller40(Filler40 value) {
        this.filler40 = value;
    }

    public boolean isSetFiller40() {
        return (this.filler40 != null);
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }

    public boolean isSetTransactionAmount() {
        return (this.transactionAmount!= null);
    }

    /**
     * Gets the value of the transactionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionComment() {
        return transactionComment;
    }

    /**
     * Sets the value of the transactionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionComment(String value) {
        this.transactionComment = value;
    }

    public boolean isSetTransactionComment() {
        return (this.transactionComment!= null);
    }

}
