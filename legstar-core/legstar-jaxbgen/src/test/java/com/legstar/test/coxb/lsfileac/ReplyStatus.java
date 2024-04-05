
package com.legstar.test.coxb.lsfileac;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for ReplyStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ReplyStatus"&gt;
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
 *         &lt;element name="SearchDuration"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalItemsRead"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReplyResp"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReplyResp2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReplyMessage"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
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
@XmlType(name = "ReplyStatus", propOrder = {
    "replyType",
    "searchDuration",
    "totalItemsRead",
    "replyResp",
    "replyResp2",
    "replyMessage"
})
public class ReplyStatus
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ReplyType")
    @CobolElement(cobolName = "REPLY-TYPE", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, picture = "9(4)", usage = "BINARY", value = "0", srceLine = 77)
    protected int replyType = 0;
    @XmlElement(name = "SearchDuration", required = true)
    @CobolElement(cobolName = "SEARCH-DURATION", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = "0x0000000000000000", srceLine = 80)
    protected String searchDuration = "0x0000000000000000";
    @XmlElement(name = "TotalItemsRead")
    @CobolElement(cobolName = "TOTAL-ITEMS-READ", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "PACKED-DECIMAL", value = "0", srceLine = 81)
    protected long totalItemsRead = 0L;
    @XmlElement(name = "ReplyResp")
    @CobolElement(cobolName = "REPLY-RESP", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = true, totalDigits = 8, picture = "S9(8)", usage = "BINARY", value = "0", srceLine = 82)
    protected int replyResp = 0;
    @XmlElement(name = "ReplyResp2")
    @CobolElement(cobolName = "REPLY-RESP2", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = true, totalDigits = 8, picture = "S9(8)", usage = "BINARY", value = "0", srceLine = 83)
    protected int replyResp2 = 0;
    @XmlElement(name = "ReplyMessage", required = true)
    @CobolElement(cobolName = "REPLY-MESSAGE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(128)", srceLine = 84)
    protected String replyMessage = "";

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
     * Gets the value of the searchDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDuration() {
        return searchDuration;
    }

    /**
     * Sets the value of the searchDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDuration(String value) {
        this.searchDuration = value;
    }

    public boolean isSetSearchDuration() {
        return (this.searchDuration!= null);
    }

    /**
     * Gets the value of the totalItemsRead property.
     * 
     */
    public long getTotalItemsRead() {
        return totalItemsRead;
    }

    /**
     * Sets the value of the totalItemsRead property.
     * 
     */
    public void setTotalItemsRead(long value) {
        this.totalItemsRead = value;
    }

    public boolean isSetTotalItemsRead() {
        return true;
    }

    /**
     * Gets the value of the replyResp property.
     * 
     */
    public int getReplyResp() {
        return replyResp;
    }

    /**
     * Sets the value of the replyResp property.
     * 
     */
    public void setReplyResp(int value) {
        this.replyResp = value;
    }

    public boolean isSetReplyResp() {
        return true;
    }

    /**
     * Gets the value of the replyResp2 property.
     * 
     */
    public int getReplyResp2() {
        return replyResp2;
    }

    /**
     * Sets the value of the replyResp2 property.
     * 
     */
    public void setReplyResp2(int value) {
        this.replyResp2 = value;
    }

    public boolean isSetReplyResp2() {
        return true;
    }

    /**
     * Gets the value of the replyMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyMessage() {
        return replyMessage;
    }

    /**
     * Sets the value of the replyMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyMessage(String value) {
        this.replyMessage = value;
    }

    public boolean isSetReplyMessage() {
        return (this.replyMessage!= null);
    }

}
