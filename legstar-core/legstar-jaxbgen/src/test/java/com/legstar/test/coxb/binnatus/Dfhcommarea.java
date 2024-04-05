
package com.legstar.test.coxb.binnatus;

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
 *         &lt;element name="LsUnsignedNative" type="{http://legstar.com/test/coxb/binnatus}LsUnsignedNative"/&gt;
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
    "lsUnsignedNative"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "LsUnsignedNative", required = true)
    @CobolElement(cobolName = "LS-UNSIGNED-NATIVE", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 68)
    protected LsUnsignedNative lsUnsignedNative;

    /**
     * Gets the value of the lsUnsignedNative property.
     * 
     * @return
     *     possible object is
     *     {@link LsUnsignedNative }
     *     
     */
    public LsUnsignedNative getLsUnsignedNative() {
        return lsUnsignedNative;
    }

    /**
     * Sets the value of the lsUnsignedNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link LsUnsignedNative }
     *     
     */
    public void setLsUnsignedNative(LsUnsignedNative value) {
        this.lsUnsignedNative = value;
    }

    public boolean isSetLsUnsignedNative() {
        return (this.lsUnsignedNative!= null);
    }

}
