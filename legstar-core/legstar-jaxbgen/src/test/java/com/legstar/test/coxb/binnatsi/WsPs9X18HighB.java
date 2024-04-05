
package com.legstar.test.coxb.binnatsi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsPs9X18HighB complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WsPs9X18HighB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filler49"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Filler50"&gt;
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
@XmlType(name = "WsPs9X18HighB", propOrder = {
    "filler49",
    "filler50"
})
public class WsPs9X18HighB
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Filler49")
    @CobolElement(cobolName = "FILLER", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 20, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", value = "3", srceLine = 49)
    protected long filler49 = 3L;
    @XmlElement(name = "Filler50")
    @CobolElement(cobolName = "FILLER", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 20, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", value = "4294967295", srceLine = 50)
    protected long filler50 = 4294967295L;

    /**
     * Gets the value of the filler49 property.
     * 
     */
    public long getFiller49() {
        return filler49;
    }

    /**
     * Sets the value of the filler49 property.
     * 
     */
    public void setFiller49(long value) {
        this.filler49 = value;
    }

    public boolean isSetFiller49() {
        return true;
    }

    /**
     * Gets the value of the filler50 property.
     * 
     */
    public long getFiller50() {
        return filler50;
    }

    /**
     * Sets the value of the filler50 property.
     * 
     */
    public void setFiller50(long value) {
        this.filler50 = value;
    }

    public boolean isSetFiller50() {
        return true;
    }

}
