
package com.legstar.test.coxb.dplarcht;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsProgramDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsProgramDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsProgramStart"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsProgramName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsProgramType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsProgramLanguage"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsProgramLength"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsProgramUsecount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="9"/&gt;
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
@XmlType(name = "WsProgramDescription", propOrder = {
    "wsProgramStart",
    "wsProgramName",
    "wsProgramType",
    "wsProgramLanguage",
    "wsProgramLength",
    "wsProgramUsecount"
})
public class WsProgramDescription
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsProgramStart", required = true)
    @CobolElement(cobolName = "WS-PROGRAM-START", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = " ", srceLine = 60)
    protected String wsProgramStart = "";
    @XmlElement(name = "WsProgramName", required = true)
    @CobolElement(cobolName = "WS-PROGRAM-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = " ", srceLine = 61)
    protected String wsProgramName = "";
    @XmlElement(name = "WsProgramType")
    @CobolElement(cobolName = "WS-PROGRAM-TYPE", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "BINARY", value = "0", srceLine = 62)
    protected long wsProgramType = 0L;
    @XmlElement(name = "WsProgramLanguage")
    @CobolElement(cobolName = "WS-PROGRAM-LANGUAGE", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "BINARY", value = "0", srceLine = 63)
    protected long wsProgramLanguage = 0L;
    @XmlElement(name = "WsProgramLength")
    @CobolElement(cobolName = "WS-PROGRAM-LENGTH", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "BINARY", srceLine = 64)
    protected int wsProgramLength;
    @XmlElement(name = "WsProgramUsecount")
    @CobolElement(cobolName = "WS-PROGRAM-USECOUNT", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "BINARY", srceLine = 65)
    protected int wsProgramUsecount;

    /**
     * Gets the value of the wsProgramStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsProgramStart() {
        return wsProgramStart;
    }

    /**
     * Sets the value of the wsProgramStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsProgramStart(String value) {
        this.wsProgramStart = value;
    }

    public boolean isSetWsProgramStart() {
        return (this.wsProgramStart!= null);
    }

    /**
     * Gets the value of the wsProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsProgramName() {
        return wsProgramName;
    }

    /**
     * Sets the value of the wsProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsProgramName(String value) {
        this.wsProgramName = value;
    }

    public boolean isSetWsProgramName() {
        return (this.wsProgramName!= null);
    }

    /**
     * Gets the value of the wsProgramType property.
     * 
     */
    public long getWsProgramType() {
        return wsProgramType;
    }

    /**
     * Sets the value of the wsProgramType property.
     * 
     */
    public void setWsProgramType(long value) {
        this.wsProgramType = value;
    }

    public boolean isSetWsProgramType() {
        return true;
    }

    /**
     * Gets the value of the wsProgramLanguage property.
     * 
     */
    public long getWsProgramLanguage() {
        return wsProgramLanguage;
    }

    /**
     * Sets the value of the wsProgramLanguage property.
     * 
     */
    public void setWsProgramLanguage(long value) {
        this.wsProgramLanguage = value;
    }

    public boolean isSetWsProgramLanguage() {
        return true;
    }

    /**
     * Gets the value of the wsProgramLength property.
     * 
     */
    public int getWsProgramLength() {
        return wsProgramLength;
    }

    /**
     * Sets the value of the wsProgramLength property.
     * 
     */
    public void setWsProgramLength(int value) {
        this.wsProgramLength = value;
    }

    public boolean isSetWsProgramLength() {
        return true;
    }

    /**
     * Gets the value of the wsProgramUsecount property.
     * 
     */
    public int getWsProgramUsecount() {
        return wsProgramUsecount;
    }

    /**
     * Sets the value of the wsProgramUsecount property.
     * 
     */
    public void setWsProgramUsecount(int value) {
        this.wsProgramUsecount = value;
    }

    public boolean isSetWsProgramUsecount() {
        return true;
    }

}
