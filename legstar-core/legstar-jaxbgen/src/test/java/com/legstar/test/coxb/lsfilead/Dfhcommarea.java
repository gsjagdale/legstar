
package com.legstar.test.coxb.lsfilead;

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
 *         &lt;element name="ComNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComAddress"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComPhone"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComComment"&gt;
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
@XmlType(name = "Dfhcommarea", propOrder = {
    "comNumber",
    "comName",
    "comAddress",
    "comPhone",
    "comDate",
    "comAmount",
    "comComment"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ComNumber")
    @CobolElement(cobolName = "COM-NUMBER", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 6, picture = "9(6)", srceLine = 33)
    protected long comNumber;
    @XmlElement(name = "ComName", required = true)
    @CobolElement(cobolName = "COM-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 34)
    protected String comName;
    @XmlElement(name = "ComAddress", required = true)
    @CobolElement(cobolName = "COM-ADDRESS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 35)
    protected String comAddress;
    @XmlElement(name = "ComPhone", required = true)
    @CobolElement(cobolName = "COM-PHONE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", srceLine = 36)
    protected String comPhone;
    @XmlElement(name = "ComDate", required = true)
    @CobolElement(cobolName = "COM-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", srceLine = 37)
    protected String comDate;
    @XmlElement(name = "ComAmount", required = true)
    @CobolElement(cobolName = "COM-AMOUNT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", srceLine = 38)
    protected String comAmount;
    @XmlElement(name = "ComComment", required = true)
    @CobolElement(cobolName = "COM-COMMENT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(9)", srceLine = 39)
    protected String comComment;

    /**
     * Gets the value of the comNumber property.
     * 
     */
    public long getComNumber() {
        return comNumber;
    }

    /**
     * Sets the value of the comNumber property.
     * 
     */
    public void setComNumber(long value) {
        this.comNumber = value;
    }

    public boolean isSetComNumber() {
        return true;
    }

    /**
     * Gets the value of the comName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComName() {
        return comName;
    }

    /**
     * Sets the value of the comName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComName(String value) {
        this.comName = value;
    }

    public boolean isSetComName() {
        return (this.comName!= null);
    }

    /**
     * Gets the value of the comAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComAddress() {
        return comAddress;
    }

    /**
     * Sets the value of the comAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComAddress(String value) {
        this.comAddress = value;
    }

    public boolean isSetComAddress() {
        return (this.comAddress!= null);
    }

    /**
     * Gets the value of the comPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComPhone() {
        return comPhone;
    }

    /**
     * Sets the value of the comPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComPhone(String value) {
        this.comPhone = value;
    }

    public boolean isSetComPhone() {
        return (this.comPhone!= null);
    }

    /**
     * Gets the value of the comDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComDate() {
        return comDate;
    }

    /**
     * Sets the value of the comDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComDate(String value) {
        this.comDate = value;
    }

    public boolean isSetComDate() {
        return (this.comDate!= null);
    }

    /**
     * Gets the value of the comAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComAmount() {
        return comAmount;
    }

    /**
     * Sets the value of the comAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComAmount(String value) {
        this.comAmount = value;
    }

    public boolean isSetComAmount() {
        return (this.comAmount!= null);
    }

    /**
     * Gets the value of the comComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComComment() {
        return comComment;
    }

    /**
     * Sets the value of the comComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComComment(String value) {
        this.comComment = value;
    }

    public boolean isSetComComment() {
        return (this.comComment!= null);
    }

}
