
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
 * <p>Java class for ArrayOfSourceRequestRequests complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSourceRequestRequests"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceRequest" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}SourceRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSourceRequestRequests", propOrder = {
    "sourceRequest"
})
public class ArrayOfSourceRequestRequestsType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "SourceRequest")
    @CobolElement(cobolName = "SourceRequest", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 0, maxOccurs = 10)
    protected List<SourceRequestType> sourceRequest;

    /**
     * Gets the value of the sourceRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSourceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceRequestType }
     * </p>
     * 
     * 
     * @return
     *     The value of the sourceRequest property.
     */
    public List<SourceRequestType> getSourceRequest() {
        if (sourceRequest == null) {
            sourceRequest = new ArrayList<SourceRequestType>();
        }
        return this.sourceRequest;
    }

    public boolean isSetSourceRequest() {
        return ((this.sourceRequest!= null)&&(!this.sourceRequest.isEmpty()));
    }

    public void unsetSourceRequest() {
        this.sourceRequest = null;
    }

}
