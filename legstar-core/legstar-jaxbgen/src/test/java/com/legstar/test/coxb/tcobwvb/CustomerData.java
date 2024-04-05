
package com.legstar.test.coxb.tcobwvb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for CustomerData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="CustomerData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersonalData" type="{http://legstar.com/test/coxb/tcobwvb}PersonalData"/&gt;
 *         &lt;element name="Transactions" type="{http://legstar.com/test/coxb/tcobwvb}Transactions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerData", propOrder = {
    "customerId",
    "personalData",
    "transactions"
})
public class CustomerData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CustomerId")
    @CobolElement(cobolName = "CUSTOMER-ID", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 6, picture = "9(6)", srceLine = 30)
    protected long customerId;
    @XmlElement(name = "PersonalData", required = true)
    @CobolElement(cobolName = "PERSONAL-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 31)
    protected PersonalData personalData;
    @XmlElement(name = "Transactions", required = true)
    @CobolElement(cobolName = "TRANSACTIONS", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 35)
    protected Transactions transactions;

    /**
     * Gets the value of the customerId property.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    public boolean isSetCustomerId() {
        return true;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalData }
     *     
     */
    public PersonalData getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalData }
     *     
     */
    public void setPersonalData(PersonalData value) {
        this.personalData = value;
    }

    public boolean isSetPersonalData() {
        return (this.personalData!= null);
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link Transactions }
     *     
     */
    public Transactions getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transactions }
     *     
     */
    public void setTransactions(Transactions value) {
        this.transactions = value;
    }

    public boolean isSetTransactions() {
        return (this.transactions!= null);
    }

}
