
package com.legstar.test.coxb.cultureinfo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for getInfoResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="getInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://cultureinfo.cases.test.xsdc.legstar.com/}cultureInfoReply" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoResponse", propOrder = {
    "_return"
})
public class GetInfoResponse
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "return")
    @CobolElement(cobolName = "R-return", type = CobolType.GROUP_ITEM, levelNumber = 3)
    protected CultureInfoReply _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CultureInfoReply }
     *     
     */
    public CultureInfoReply getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CultureInfoReply }
     *     
     */
    public void setReturn(CultureInfoReply value) {
        this._return = value;
    }

    public boolean isSetReturn() {
        return (this._return!= null);
    }

}
