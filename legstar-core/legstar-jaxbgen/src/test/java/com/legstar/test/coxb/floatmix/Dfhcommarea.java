
package com.legstar.test.coxb.floatmix;

import java.io.Serializable;
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
 *         &lt;element name="CFloat1234"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFloat0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFloat1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFloat345006P5678"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFloat798P20067Em16"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFloat3P40282347Ep38"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
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
    "cFloat1234",
    "cFloat0",
    "cFloat1",
    "cFloat345006P5678",
    "cFloat798P20067Em16",
    "cFloat3P40282347Ep38"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "CFloat1234")
    @CobolElement(cobolName = "C-FLOAT-1234", type = CobolType.SINGLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-1", srceLine = 21)
    protected float cFloat1234;
    @XmlElement(name = "CFloat0")
    @CobolElement(cobolName = "C-FLOAT-0", type = CobolType.SINGLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-1", srceLine = 22)
    protected float cFloat0;
    @XmlElement(name = "CFloat1")
    @CobolElement(cobolName = "C-FLOAT-1", type = CobolType.SINGLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-1", srceLine = 23)
    protected float cFloat1;
    @XmlElement(name = "CFloat345006P5678")
    @CobolElement(cobolName = "C-FLOAT-345006p5678", type = CobolType.SINGLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-1", srceLine = 24)
    protected float cFloat345006P5678;
    @XmlElement(name = "CFloat798P20067Em16")
    @CobolElement(cobolName = "C-FLOAT-798p20067em16", type = CobolType.SINGLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-1", srceLine = 25)
    protected float cFloat798P20067Em16;
    @XmlElement(name = "CFloat3P40282347Ep38")
    @CobolElement(cobolName = "C-FLOAT-3p40282347ep38", type = CobolType.SINGLE_FLOAT_ITEM, levelNumber = 5, usage = "COMP-1", srceLine = 26)
    protected float cFloat3P40282347Ep38;

    /**
     * Gets the value of the cFloat1234 property.
     * 
     */
    public float getCFloat1234() {
        return cFloat1234;
    }

    /**
     * Sets the value of the cFloat1234 property.
     * 
     */
    public void setCFloat1234(float value) {
        this.cFloat1234 = value;
    }

    public boolean isSetCFloat1234() {
        return true;
    }

    /**
     * Gets the value of the cFloat0 property.
     * 
     */
    public float getCFloat0() {
        return cFloat0;
    }

    /**
     * Sets the value of the cFloat0 property.
     * 
     */
    public void setCFloat0(float value) {
        this.cFloat0 = value;
    }

    public boolean isSetCFloat0() {
        return true;
    }

    /**
     * Gets the value of the cFloat1 property.
     * 
     */
    public float getCFloat1() {
        return cFloat1;
    }

    /**
     * Sets the value of the cFloat1 property.
     * 
     */
    public void setCFloat1(float value) {
        this.cFloat1 = value;
    }

    public boolean isSetCFloat1() {
        return true;
    }

    /**
     * Gets the value of the cFloat345006P5678 property.
     * 
     */
    public float getCFloat345006P5678() {
        return cFloat345006P5678;
    }

    /**
     * Sets the value of the cFloat345006P5678 property.
     * 
     */
    public void setCFloat345006P5678(float value) {
        this.cFloat345006P5678 = value;
    }

    public boolean isSetCFloat345006P5678() {
        return true;
    }

    /**
     * Gets the value of the cFloat798P20067Em16 property.
     * 
     */
    public float getCFloat798P20067Em16() {
        return cFloat798P20067Em16;
    }

    /**
     * Sets the value of the cFloat798P20067Em16 property.
     * 
     */
    public void setCFloat798P20067Em16(float value) {
        this.cFloat798P20067Em16 = value;
    }

    public boolean isSetCFloat798P20067Em16() {
        return true;
    }

    /**
     * Gets the value of the cFloat3P40282347Ep38 property.
     * 
     */
    public float getCFloat3P40282347Ep38() {
        return cFloat3P40282347Ep38;
    }

    /**
     * Sets the value of the cFloat3P40282347Ep38 property.
     * 
     */
    public void setCFloat3P40282347Ep38(float value) {
        this.cFloat3P40282347Ep38 = value;
    }

    public boolean isSetCFloat3P40282347Ep38() {
        return true;
    }

}
