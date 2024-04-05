
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for SourceResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="SourceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}SourceType"/&gt;
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecourseQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}ArrayOfResultResults"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceResponse", propOrder = {
    "source",
    "offset",
    "total",
    "recourseQuery",
    "results"
})
public class SourceResponseType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    @CobolElement(cobolName = "R-Source", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X(32)", usage = "DISPLAY")
    protected SourceTypeType source;
    @XmlElement(name = "Offset")
    @CobolElement(cobolName = "Offset", type = CobolType.BINARY_ITEM, levelNumber = 9, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int offset;
    @XmlElement(name = "Total")
    @CobolElement(cobolName = "Total", type = CobolType.BINARY_ITEM, levelNumber = 9, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int total;
    @XmlElement(name = "RecourseQuery")
    @CobolElement(cobolName = "RecourseQuery", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X(32)", usage = "DISPLAY")
    protected String recourseQuery;
    @XmlElement(name = "Results", required = true)
    @CobolElement(cobolName = "Results", type = CobolType.GROUP_ITEM, levelNumber = 9)
    protected ArrayOfResultResultsType results;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeType }
     *     
     */
    public SourceTypeType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeType }
     *     
     */
    public void setSource(SourceTypeType value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return true;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    public boolean isSetTotal() {
        return true;
    }

    /**
     * Gets the value of the recourseQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecourseQuery() {
        return recourseQuery;
    }

    /**
     * Sets the value of the recourseQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecourseQuery(String value) {
        this.recourseQuery = value;
    }

    public boolean isSetRecourseQuery() {
        return (this.recourseQuery!= null);
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResultResultsType }
     *     
     */
    public ArrayOfResultResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResultResultsType }
     *     
     */
    public void setResults(ArrayOfResultResultsType value) {
        this.results = value;
    }

    public boolean isSetResults() {
        return (this.results!= null);
    }

}
