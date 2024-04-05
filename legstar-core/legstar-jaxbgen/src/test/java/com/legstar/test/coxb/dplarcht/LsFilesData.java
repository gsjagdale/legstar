
package com.legstar.test.coxb.dplarcht;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsFilesData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LsFilesData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LsFileName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsFileDsname"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="44"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LsFileEnablestatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
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
@XmlType(name = "LsFilesData", propOrder = {
    "lsFileName",
    "lsFileDsname",
    "lsFileEnablestatus"
})
public class LsFilesData
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsFileName", required = true)
    @CobolElement(cobolName = "LS-FILE-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(8)", srceLine = 103)
    protected String lsFileName;
    @XmlElement(name = "LsFileDsname", required = true)
    @CobolElement(cobolName = "LS-FILE-DSNAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(44)", srceLine = 104)
    protected String lsFileDsname;
    @XmlElement(name = "LsFileEnablestatus", required = true)
    @CobolElement(cobolName = "LS-FILE-ENABLESTATUS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(12)", srceLine = 105)
    protected String lsFileEnablestatus;

    /**
     * Gets the value of the lsFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsFileName() {
        return lsFileName;
    }

    /**
     * Sets the value of the lsFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsFileName(String value) {
        this.lsFileName = value;
    }

    public boolean isSetLsFileName() {
        return (this.lsFileName!= null);
    }

    /**
     * Gets the value of the lsFileDsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsFileDsname() {
        return lsFileDsname;
    }

    /**
     * Sets the value of the lsFileDsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsFileDsname(String value) {
        this.lsFileDsname = value;
    }

    public boolean isSetLsFileDsname() {
        return (this.lsFileDsname!= null);
    }

    /**
     * Gets the value of the lsFileEnablestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsFileEnablestatus() {
        return lsFileEnablestatus;
    }

    /**
     * Sets the value of the lsFileEnablestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsFileEnablestatus(String value) {
        this.lsFileEnablestatus = value;
    }

    public boolean isSetLsFileEnablestatus() {
        return (this.lsFileEnablestatus!= null);
    }

}
