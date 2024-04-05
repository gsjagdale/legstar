
package com.legstar.test.coxb.ardo02;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for OdoArray complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="OdoArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filler10"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
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
@XmlType(name = "OdoArray", propOrder = {
    "filler10"
})
public class OdoArray
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Filler10", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 10)
    protected String filler10;

    /**
     * Gets the value of the filler10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller10() {
        return filler10;
    }

    /**
     * Sets the value of the filler10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller10(String value) {
        this.filler10 = value;
    }

    public boolean isSetFiller10() {
        return (this.filler10 != null);
    }

}
