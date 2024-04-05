
package com.legstar.test.coxb.arrayssm;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for TableComplex complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="TableComplex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementComplex"&gt;
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
@XmlType(name = "TableComplex", propOrder = {
    "elementComplex"
})
public class TableComplex
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ElementComplex", required = true)
    @CobolElement(cobolName = "ELEMENT-COMPLEX", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(5)", srceLine = 34)
    protected String elementComplex;

    /**
     * Gets the value of the elementComplex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementComplex() {
        return elementComplex;
    }

    /**
     * Sets the value of the elementComplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementComplex(String value) {
        this.elementComplex = value;
    }

    public boolean isSetElementComplex() {
        return (this.elementComplex!= null);
    }

}
