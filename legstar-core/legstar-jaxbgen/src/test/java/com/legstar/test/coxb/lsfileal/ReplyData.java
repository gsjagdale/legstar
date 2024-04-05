
package com.legstar.test.coxb.lsfileal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for ReplyData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ReplyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReplyType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ReplySuccessHeader" type="{http://legstar.com/test/coxb/lsfileal}ReplySuccessHeader"/&gt;
 *           &lt;element name="ReplyErrorHeader" type="{http://legstar.com/test/coxb/lsfileal}ReplyErrorHeader"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Filler65" type="{http://legstar.com/test/coxb/lsfileal}Filler65"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyData", propOrder = {
    "replyType",
    "replySuccessHeader",
    "replyErrorHeader",
    "filler65"
})
public class ReplyData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ReplyType")
    @CobolElement(cobolName = "REPLY-TYPE", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "BINARY", srceLine = 54)
    protected int replyType;
    @XmlElement(name = "ReplySuccessHeader")
    @CobolElement(cobolName = "REPLY-SUCCESS-HEADER", type = CobolType.GROUP_ITEM, levelNumber = 5, isRedefined = true, srceLine = 57)
    protected ReplySuccessHeader replySuccessHeader;
    @XmlElement(name = "ReplyErrorHeader")
    @CobolElement(cobolName = "REPLY-ERROR-HEADER", type = CobolType.GROUP_ITEM, levelNumber = 5, redefines = "REPLY-SUCCESS-HEADER", srceLine = 61)
    protected ReplyErrorHeader replyErrorHeader;
    @XmlElement(name = "Filler65", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 65)
    protected Filler65 filler65;

    /**
     * Gets the value of the replyType property.
     * 
     */
    public int getReplyType() {
        return replyType;
    }

    /**
     * Sets the value of the replyType property.
     * 
     */
    public void setReplyType(int value) {
        this.replyType = value;
    }

    public boolean isSetReplyType() {
        return true;
    }

    /**
     * Gets the value of the replySuccessHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ReplySuccessHeader }
     *     
     */
    public ReplySuccessHeader getReplySuccessHeader() {
        return replySuccessHeader;
    }

    /**
     * Sets the value of the replySuccessHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplySuccessHeader }
     *     
     */
    public void setReplySuccessHeader(ReplySuccessHeader value) {
        this.replySuccessHeader = value;
    }

    public boolean isSetReplySuccessHeader() {
        return (this.replySuccessHeader!= null);
    }

    /**
     * Gets the value of the replyErrorHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyErrorHeader }
     *     
     */
    public ReplyErrorHeader getReplyErrorHeader() {
        return replyErrorHeader;
    }

    /**
     * Sets the value of the replyErrorHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyErrorHeader }
     *     
     */
    public void setReplyErrorHeader(ReplyErrorHeader value) {
        this.replyErrorHeader = value;
    }

    public boolean isSetReplyErrorHeader() {
        return (this.replyErrorHeader!= null);
    }

    /**
     * Gets the value of the filler65 property.
     * 
     * @return
     *     possible object is
     *     {@link Filler65 }
     *     
     */
    public Filler65 getFiller65() {
        return filler65;
    }

    /**
     * Sets the value of the filler65 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filler65 }
     *     
     */
    public void setFiller65(Filler65 value) {
        this.filler65 = value;
    }

    public boolean isSetFiller65() {
        return (this.filler65 != null);
    }

}
