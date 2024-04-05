
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Address complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subdivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "addressLine",
    "primaryCity",
    "secondaryCity",
    "subdivision",
    "postalCode",
    "countryRegion",
    "formattedAddress"
})
public class AddressType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "AddressLine")
    @CobolElement(cobolName = "AddressLine", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String addressLine;
    @XmlElement(name = "PrimaryCity")
    @CobolElement(cobolName = "PrimaryCity", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String primaryCity;
    @XmlElement(name = "SecondaryCity")
    @CobolElement(cobolName = "SecondaryCity", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String secondaryCity;
    @XmlElement(name = "Subdivision")
    @CobolElement(cobolName = "Subdivision", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String subdivision;
    @XmlElement(name = "PostalCode")
    @CobolElement(cobolName = "PostalCode", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String postalCode;
    @XmlElement(name = "CountryRegion")
    @CobolElement(cobolName = "CountryRegion", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String countryRegion;
    @XmlElement(name = "FormattedAddress")
    @CobolElement(cobolName = "FormattedAddress", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String formattedAddress;

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine(String value) {
        this.addressLine = value;
    }

    public boolean isSetAddressLine() {
        return (this.addressLine!= null);
    }

    /**
     * Gets the value of the primaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCity() {
        return primaryCity;
    }

    /**
     * Sets the value of the primaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCity(String value) {
        this.primaryCity = value;
    }

    public boolean isSetPrimaryCity() {
        return (this.primaryCity!= null);
    }

    /**
     * Gets the value of the secondaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCity() {
        return secondaryCity;
    }

    /**
     * Sets the value of the secondaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCity(String value) {
        this.secondaryCity = value;
    }

    public boolean isSetSecondaryCity() {
        return (this.secondaryCity!= null);
    }

    /**
     * Gets the value of the subdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * Sets the value of the subdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivision(String value) {
        this.subdivision = value;
    }

    public boolean isSetSubdivision() {
        return (this.subdivision!= null);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public boolean isSetPostalCode() {
        return (this.postalCode!= null);
    }

    /**
     * Gets the value of the countryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRegion() {
        return countryRegion;
    }

    /**
     * Sets the value of the countryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRegion(String value) {
        this.countryRegion = value;
    }

    public boolean isSetCountryRegion() {
        return (this.countryRegion!= null);
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress(String value) {
        this.formattedAddress = value;
    }

    public boolean isSetFormattedAddress() {
        return (this.formattedAddress!= null);
    }

}
