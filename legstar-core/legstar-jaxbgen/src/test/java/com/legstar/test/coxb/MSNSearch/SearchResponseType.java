
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for SearchResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="SearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Responses" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}ArrayOfSourceResponseResponses"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponse", propOrder = {
    "responses"
})
public class SearchResponseType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Responses", required = true)
    @CobolElement(cobolName = "Responses", type = CobolType.GROUP_ITEM, levelNumber = 5)
    protected ArrayOfSourceResponseResponsesType responses;

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceResponseResponsesType }
     *     
     */
    public ArrayOfSourceResponseResponsesType getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceResponseResponsesType }
     *     
     */
    public void setResponses(ArrayOfSourceResponseResponsesType value) {
        this.responses = value;
    }

    public boolean isSetResponses() {
        return (this.responses!= null);
    }

}
