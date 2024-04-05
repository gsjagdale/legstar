
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for ArrayOfstringSearchTagFilters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfstringSearchTagFilters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfstringSearchTagFilters", propOrder = {
    "string"
})
public class ArrayOfstringSearchTagFiltersType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @CobolElement(cobolName = "R-string", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, minOccurs = 0, maxOccurs = 10, picture = "X(32)", usage = "DISPLAY")
    protected List<String> string;

    /**
     * Gets the value of the string property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the string property.
     */
    public List<String> getString() {
        if (string == null) {
            string = new ArrayList<String>();
        }
        return this.string;
    }

    public boolean isSetString() {
        return ((this.string!= null)&&(!this.string.isEmpty()));
    }

    public void unsetString() {
        this.string = null;
    }

}
