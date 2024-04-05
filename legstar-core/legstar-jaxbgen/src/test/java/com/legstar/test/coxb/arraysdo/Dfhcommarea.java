
package com.legstar.test.coxb.arraysdo;

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
 * <p>Java class for Dfhcommarea complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Dfhcommarea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TableSize"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TableOdo" maxOccurs="100"&gt;
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
@XmlType(name = "Dfhcommarea", propOrder = {
    "tableSize",
    "tableOdo"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "TableSize")
    @CobolElement(cobolName = "TABLE-SIZE", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 2, isODOObject = true, picture = "9(2)", srceLine = 26)
    protected int tableSize;
    @XmlElement(name = "TableOdo", required = true)
    @CobolElement(cobolName = "TABLE-ODO", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, minOccurs = 1, maxOccurs = 100, dependingOn = "TABLE-SIZE", picture = "X(5)", srceLine = 27)
    protected List<String> tableOdo;

    /**
     * Gets the value of the tableSize property.
     * 
     */
    public int getTableSize() {
        return tableSize;
    }

    /**
     * Sets the value of the tableSize property.
     * 
     */
    public void setTableSize(int value) {
        this.tableSize = value;
    }

    public boolean isSetTableSize() {
        return true;
    }

    /**
     * Gets the value of the tableOdo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableOdo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTableOdo().add(newItem);
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
     *     The value of the tableOdo property.
     */
    public List<String> getTableOdo() {
        if (tableOdo == null) {
            tableOdo = new ArrayList<String>();
        }
        return this.tableOdo;
    }

    public boolean isSetTableOdo() {
        return ((this.tableOdo!= null)&&(!this.tableOdo.isEmpty()));
    }

    public void unsetTableOdo() {
        this.tableOdo = null;
    }

}
