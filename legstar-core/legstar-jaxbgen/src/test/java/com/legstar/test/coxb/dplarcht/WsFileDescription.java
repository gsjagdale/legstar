
package com.legstar.test.coxb.dplarcht;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsFileDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsFileDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsFileStart"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsFileName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsFileDsname"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="44"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WsFileEnablestatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;totalDigits value="8"/&gt;
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
@XmlType(name = "WsFileDescription", propOrder = {
    "wsFileStart",
    "wsFileName",
    "wsFileDsname",
    "wsFileEnablestatus"
})
public class WsFileDescription
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsFileStart", required = true)
    @CobolElement(cobolName = "WS-FILE-START", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = " ", srceLine = 54)
    protected String wsFileStart = "";
    @XmlElement(name = "WsFileName", required = true)
    @CobolElement(cobolName = "WS-FILE-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", value = " ", srceLine = 55)
    protected String wsFileName = "";
    @XmlElement(name = "WsFileDsname", required = true)
    @CobolElement(cobolName = "WS-FILE-DSNAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(44)", value = " ", srceLine = 56)
    protected String wsFileDsname = "";
    @XmlElement(name = "WsFileEnablestatus")
    @CobolElement(cobolName = "WS-FILE-ENABLESTATUS", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", usage = "BINARY", value = "0", srceLine = 57)
    protected long wsFileEnablestatus = 0L;

    /**
     * Gets the value of the wsFileStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsFileStart() {
        return wsFileStart;
    }

    /**
     * Sets the value of the wsFileStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsFileStart(String value) {
        this.wsFileStart = value;
    }

    public boolean isSetWsFileStart() {
        return (this.wsFileStart!= null);
    }

    /**
     * Gets the value of the wsFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsFileName() {
        return wsFileName;
    }

    /**
     * Sets the value of the wsFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsFileName(String value) {
        this.wsFileName = value;
    }

    public boolean isSetWsFileName() {
        return (this.wsFileName!= null);
    }

    /**
     * Gets the value of the wsFileDsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsFileDsname() {
        return wsFileDsname;
    }

    /**
     * Sets the value of the wsFileDsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsFileDsname(String value) {
        this.wsFileDsname = value;
    }

    public boolean isSetWsFileDsname() {
        return (this.wsFileDsname!= null);
    }

    /**
     * Gets the value of the wsFileEnablestatus property.
     * 
     */
    public long getWsFileEnablestatus() {
        return wsFileEnablestatus;
    }

    /**
     * Sets the value of the wsFileEnablestatus property.
     * 
     */
    public void setWsFileEnablestatus(long value) {
        this.wsFileEnablestatus = value;
    }

    public boolean isSetWsFileEnablestatus() {
        return true;
    }

}
