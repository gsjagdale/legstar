
package com.legstar.test.coxb.ardo02;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for AlternativeA complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="AlternativeA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OdoCounter"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="4"/&gt;
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
@XmlType(name = "AlternativeA", propOrder = {
    "odoCounter"
})
public class AlternativeA
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "OdoCounter")
    @CobolElement(cobolName = "ODO-COUNTER", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, isODOObject = true, picture = "9(4)", usage = "BINARY", srceLine = 6)
    protected int odoCounter;

    /**
     * Gets the value of the odoCounter property.
     * 
     */
    public int getOdoCounter() {
        return odoCounter;
    }

    /**
     * Sets the value of the odoCounter property.
     * 
     */
    public void setOdoCounter(int value) {
        this.odoCounter = value;
    }

    public boolean isSetOdoCounter() {
        return true;
    }

}
