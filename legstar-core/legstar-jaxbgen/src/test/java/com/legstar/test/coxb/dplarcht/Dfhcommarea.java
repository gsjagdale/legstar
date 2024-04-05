
package com.legstar.test.coxb.dplarcht;

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
 *         &lt;element name="LsRequest" type="{http://legstar.com/test/coxb/dplarcht}LsRequest"/&gt;
 *         &lt;element name="LsReply" type="{http://legstar.com/test/coxb/dplarcht}LsReply"/&gt;
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
    "lsRequest",
    "lsReply"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsRequest", required = true)
    @CobolElement(cobolName = "LS-REQUEST", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 81)
    protected LsRequest lsRequest;
    @XmlElement(name = "LsReply", required = true)
    @CobolElement(cobolName = "LS-REPLY", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 93)
    protected LsReply lsReply;

    /**
     * Gets the value of the lsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LsRequest }
     *     
     */
    public LsRequest getLsRequest() {
        return lsRequest;
    }

    /**
     * Sets the value of the lsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsRequest }
     *     
     */
    public void setLsRequest(LsRequest value) {
        this.lsRequest = value;
    }

    public boolean isSetLsRequest() {
        return (this.lsRequest!= null);
    }

    /**
     * Gets the value of the lsReply property.
     * 
     * @return
     *     possible object is
     *     {@link LsReply }
     *     
     */
    public LsReply getLsReply() {
        return lsReply;
    }

    /**
     * Sets the value of the lsReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsReply }
     *     
     */
    public void setLsReply(LsReply value) {
        this.lsReply = value;
    }

    public boolean isSetLsReply() {
        return (this.lsReply!= null);
    }

}
