
package com.legstar.test.coxb.varar021;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LkupInfo39 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LkupInfo39"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LkupId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LkupTypCd"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
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
@XmlType(name = "LkupInfo39", propOrder = {
    "lkupId",
    "lkupTypCd"
})
public class LkupInfo39
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LkupId", required = true)
    @CobolElement(cobolName = "LKUP-ID", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(18)", srceLine = 40)
    protected String lkupId;
    @XmlElement(name = "LkupTypCd", required = true)
    @CobolElement(cobolName = "LKUP-TYP-CD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(05)", srceLine = 41)
    protected String lkupTypCd;

    /**
     * Gets the value of the lkupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkupId() {
        return lkupId;
    }

    /**
     * Sets the value of the lkupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkupId(String value) {
        this.lkupId = value;
    }

    public boolean isSetLkupId() {
        return (this.lkupId!= null);
    }

    /**
     * Gets the value of the lkupTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkupTypCd() {
        return lkupTypCd;
    }

    /**
     * Sets the value of the lkupTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkupTypCd(String value) {
        this.lkupTypCd = value;
    }

    public boolean isSetLkupTypCd() {
        return (this.lkupTypCd!= null);
    }

}
