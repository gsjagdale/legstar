
package com.legstar.test.coxb.lsfileaq;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for QueryData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="QueryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaxReplies"&gt;
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
@XmlType(name = "QueryData", propOrder = {
    "customerName",
    "maxReplies"
})
public class QueryData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CustomerName", required = true)
    @CobolElement(cobolName = "CUSTOMER-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(20)", srceLine = 37)
    protected String customerName;
    @XmlElement(name = "MaxReplies")
    @CobolElement(cobolName = "MAX-REPLIES", type = CobolType.BINARY_ITEM, levelNumber = 10, isSigned = true, totalDigits = 4, picture = "S9(4)", usage = "BINARY", value = "-1", srceLine = 38)
    protected short maxReplies = -1;

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public boolean isSetCustomerName() {
        return (this.customerName!= null);
    }

    /**
     * Gets the value of the maxReplies property.
     * 
     */
    public short getMaxReplies() {
        return maxReplies;
    }

    /**
     * Sets the value of the maxReplies property.
     * 
     */
    public void setMaxReplies(short value) {
        this.maxReplies = value;
    }

    public boolean isSetMaxReplies() {
        return true;
    }

}
