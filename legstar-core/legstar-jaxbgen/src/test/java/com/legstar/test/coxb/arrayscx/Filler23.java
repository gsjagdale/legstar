
package com.legstar.test.coxb.arrayscx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Filler23 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Filler23"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WsItemA" maxOccurs="3" minOccurs="3"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="1"/&gt;
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
@XmlType(name = "Filler23", propOrder = {
    "wsItemA"
})
public class Filler23
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "WsItemA", type = Integer.class)
    @CobolElement(cobolName = "WS-ITEM-A", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 1, minOccurs = 3, maxOccurs = 3, picture = "9", srceLine = 24)
    protected List<Integer> wsItemA;

    /**
     * Gets the value of the wsItemA property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsItemA property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWsItemA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the wsItemA property.
     */
    public List<Integer> getWsItemA() {
        if (wsItemA == null) {
            wsItemA = new ArrayList<Integer>();
        }
        return this.wsItemA;
    }

    public boolean isSetWsItemA() {
        return ((this.wsItemA!= null)&&(!this.wsItemA.isEmpty()));
    }

    public void unsetWsItemA() {
        this.wsItemA = null;
    }

}
