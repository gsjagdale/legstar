
package com.legstar.test.coxb.customer;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="CustomerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n_ame" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "nAme",
    "number"
})
public class CustomerType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "n_ame", required = true)
    protected String nAme;
    @XmlElement(required = true)
    protected BigInteger number;

    /**
     * Gets the value of the nAme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAme() {
        return nAme;
    }

    /**
     * Sets the value of the nAme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAme(String value) {
        this.nAme = value;
    }

    public boolean isSetNAme() {
        return (this.nAme!= null);
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    public boolean isSetNumber() {
        return (this.number!= null);
    }

}
