
package com.legstar.test.coxb.MSNSearch;

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
 * <p>Java class for ArrayOfSourceResponseResponses complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSourceResponseResponses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceResponse" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}SourceResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSourceResponseResponses", propOrder = {
    "sourceResponse"
})
public class ArrayOfSourceResponseResponsesType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "SourceResponse")
    @CobolElement(cobolName = "SourceResponse", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 0, maxOccurs = 10)
    protected List<SourceResponseType> sourceResponse;

    /**
     * Gets the value of the sourceResponse property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceResponse property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSourceResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the sourceResponse property.
     */
    public List<SourceResponseType> getSourceResponse() {
        if (sourceResponse == null) {
            sourceResponse = new ArrayList<SourceResponseType>();
        }
        return this.sourceResponse;
    }

    public boolean isSetSourceResponse() {
        return ((this.sourceResponse!= null)&&(!this.sourceResponse.isEmpty()));
    }

    public void unsetSourceResponse() {
        this.sourceResponse = null;
    }

}
