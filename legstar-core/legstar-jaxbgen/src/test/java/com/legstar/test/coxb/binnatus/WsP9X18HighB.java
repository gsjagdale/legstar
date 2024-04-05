
package com.legstar.test.coxb.binnatus;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsP9X18HighB complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsP9X18HighB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filler45"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Filler46"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
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
@XmlType(name = "WsP9X18HighB", propOrder = {
    "filler45",
    "filler46"
})
public class WsP9X18HighB
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Filler45")
    @CobolElement(cobolName = "FILLER", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 20, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", value = "4294967294", srceLine = 45)
    protected long filler45 = 4294967294L;
    @XmlElement(name = "Filler46")
    @CobolElement(cobolName = "FILLER", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 20, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", value = "4294967294", srceLine = 46)
    protected long filler46 = 4294967294L;

    /**
     * Gets the value of the filler45 property.
     * 
     */
    public long getFiller45() {
        return filler45;
    }

    /**
     * Sets the value of the filler45 property.
     * 
     */
    public void setFiller45(long value) {
        this.filler45 = value;
    }

    public boolean isSetFiller45() {
        return true;
    }

    /**
     * Gets the value of the filler46 property.
     * 
     */
    public long getFiller46() {
        return filler46;
    }

    /**
     * Sets the value of the filler46 property.
     * 
     */
    public void setFiller46(long value) {
        this.filler46 = value;
    }

    public boolean isSetFiller46() {
        return true;
    }

}
