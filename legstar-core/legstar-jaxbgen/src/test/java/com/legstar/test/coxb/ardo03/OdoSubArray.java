
package com.legstar.test.coxb.ardo03;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for OdoSubArray complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="OdoSubArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filler8"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
@XmlType(name = "OdoSubArray", propOrder = {
    "filler8"
})
public class OdoSubArray
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Filler8", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(4)", srceLine = 8)
    protected String filler8;

    /**
     * Gets the value of the filler8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller8() {
        return filler8;
    }

    /**
     * Sets the value of the filler8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller8(String value) {
        this.filler8 = value;
    }

    public boolean isSetFiller8() {
        return (this.filler8 != null);
    }

}
