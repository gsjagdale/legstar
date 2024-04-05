
package com.legstar.test.coxb.enumvar;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for SearchRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="SearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SafeSearch" type="{http://legstar.com/test/coxb/enumvar}SafeSearchOptions"/&gt;
 *         &lt;element name="SearchWeight" type="{http://legstar.com/test/coxb/enumvar}SearchWeightOptions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "appID",
    "safeSearch",
    "searchWeight"
})
public class SearchRequestType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "AppID", required = true)
    @CobolElement(cobolName = "APPID", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(40)", usage = "DISPLAY")
    protected String appID;
    @XmlElement(name = "SafeSearch", required = true, defaultValue = "Moderate")
    @XmlSchemaType(name = "string")
    @CobolElement(cobolName = "SAFESEARCH", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(32)", usage = "DISPLAY")
    protected SafeSearchOptionsType safeSearch;
    @XmlElement(name = "SearchWeight", required = true, defaultValue = "2")
    @CobolElement(cobolName = "SEARCHWEIGHT", type = CobolType.BINARY_ITEM, levelNumber = 5, totalDigits = 4, picture = "9(4) COMP", usage = "BINARY")
    protected BigInteger searchWeight;

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    public boolean isSetAppID() {
        return (this.appID!= null);
    }

    /**
     * Gets the value of the safeSearch property.
     * 
     * @return
     *     possible object is
     *     {@link SafeSearchOptionsType }
     *     
     */
    public SafeSearchOptionsType getSafeSearch() {
        return safeSearch;
    }

    /**
     * Sets the value of the safeSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeSearchOptionsType }
     *     
     */
    public void setSafeSearch(SafeSearchOptionsType value) {
        this.safeSearch = value;
    }

    public boolean isSetSafeSearch() {
        return (this.safeSearch!= null);
    }

    /**
     * Gets the value of the searchWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSearchWeight() {
        return searchWeight;
    }

    /**
     * Sets the value of the searchWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSearchWeight(BigInteger value) {
        this.searchWeight = value;
    }

    public boolean isSetSearchWeight() {
        return (this.searchWeight!= null);
    }

}
