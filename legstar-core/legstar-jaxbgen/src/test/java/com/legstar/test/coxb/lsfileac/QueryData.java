
package com.legstar.test.coxb.lsfileac;

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
 *         &lt;element name="QueryName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QueryAddress"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QueryPhone"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
    "queryName",
    "queryAddress",
    "queryPhone"
})
public class QueryData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "QueryName", required = true)
    @CobolElement(cobolName = "QUERY-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 92)
    protected String queryName;
    @XmlElement(name = "QueryAddress", required = true)
    @CobolElement(cobolName = "QUERY-ADDRESS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 93)
    protected String queryAddress;
    @XmlElement(name = "QueryPhone", required = true)
    @CobolElement(cobolName = "QUERY-PHONE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", srceLine = 94)
    protected String queryPhone;

    /**
     * Gets the value of the queryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    public boolean isSetQueryName() {
        return (this.queryName!= null);
    }

    /**
     * Gets the value of the queryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryAddress() {
        return queryAddress;
    }

    /**
     * Sets the value of the queryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryAddress(String value) {
        this.queryAddress = value;
    }

    public boolean isSetQueryAddress() {
        return (this.queryAddress!= null);
    }

    /**
     * Gets the value of the queryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryPhone() {
        return queryPhone;
    }

    /**
     * Sets the value of the queryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryPhone(String value) {
        this.queryPhone = value;
    }

    public boolean isSetQueryPhone() {
        return (this.queryPhone!= null);
    }

}
