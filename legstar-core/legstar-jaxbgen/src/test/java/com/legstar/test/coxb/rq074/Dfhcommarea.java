
package com.legstar.test.coxb.rq074;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 *         &lt;element name="rq074Crud"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;enumeration value="UPD"/&gt;
 *               &lt;enumeration value="INQ"/&gt;
 *               &lt;enumeration value="CRE"/&gt;
 *               &lt;enumeration value="DEL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rq074Bool"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="0"/&gt;
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
    "rq074Crud",
    "rq074Bool"
})
public class Dfhcommarea
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(required = true)
    @CobolElement(cobolName = "RQ074-CRUD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(03)", srceLine = 2)
    protected Dfhcommarea.Rq074Crud rq074Crud;
    @XmlElement(required = true)
    @CobolElement(cobolName = "RQ074-BOOL", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = false, totalDigits = 4, picture = "9(04)", usage = "BINARY", srceLine = 7)
    protected Dfhcommarea.Rq074Bool rq074Bool;

    /**
     * Gets the value of the rq074Crud property.
     * 
     * @return
     *     possible object is
     *     {@link Dfhcommarea.Rq074Crud }
     *     
     */
    public Dfhcommarea.Rq074Crud getRq074Crud() {
        return rq074Crud;
    }

    /**
     * Sets the value of the rq074Crud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dfhcommarea.Rq074Crud }
     *     
     */
    public void setRq074Crud(Dfhcommarea.Rq074Crud value) {
        this.rq074Crud = value;
    }

    public boolean isSetRq074Crud() {
        return (this.rq074Crud!= null);
    }

    /**
     * Gets the value of the rq074Bool property.
     * 
     * @return
     *     possible object is
     *     {@link Dfhcommarea.Rq074Bool }
     *     
     */
    public Dfhcommarea.Rq074Bool getRq074Bool() {
        return rq074Bool;
    }

    /**
     * Sets the value of the rq074Bool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dfhcommarea.Rq074Bool }
     *     
     */
    public void setRq074Bool(Dfhcommarea.Rq074Bool value) {
        this.rq074Bool = value;
    }

    public boolean isSetRq074Bool() {
        return (this.rq074Bool!= null);
    }


    /**
     * <p>Java class for null</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *     &lt;totalDigits value="4"/&gt;
     *     &lt;enumeration value="1"/&gt;
     *     &lt;enumeration value="0"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum(Integer.class)
    public enum Rq074Bool {

        @XmlEnumValue("1")
        VALUE_1(1),
        @XmlEnumValue("0")
        VALUE_0(0);
        private final int value;

        Rq074Bool(int v) {
            value = v;
        }

        /**
         * Gets the value associated to the enum constant.
         * 
         * @return
         *     The value linked to the enum.
         */
        public int value() {
            return value;
        }

        /**
         * Gets the enum associated to the value passed as parameter.
         * 
         * @param v
         *     The value to get the enum from.
         * @return
         *     The enum which corresponds to the value, if it exists.
         * @throws IllegalArgumentException
         *     If no value matches in the enum declaration.
         */
        public static Dfhcommarea.Rq074Bool fromValue(int v) {
            for (Dfhcommarea.Rq074Bool c: Dfhcommarea.Rq074Bool.values()) {
                if (c.value == v) {
                    return c;
                }
            }
            throw new IllegalArgumentException(String.valueOf(v));
        }

    }


    /**
     * <p>Java class for null</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;maxLength value="3"/&gt;
     *     &lt;enumeration value="UPD"/&gt;
     *     &lt;enumeration value="INQ"/&gt;
     *     &lt;enumeration value="CRE"/&gt;
     *     &lt;enumeration value="DEL"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Rq074Crud {

        @XmlEnumValue("UPD")
        VALUE_UPD("UPD"),
        @XmlEnumValue("INQ")
        VALUE_INQ("INQ"),
        @XmlEnumValue("CRE")
        VALUE_CRE("CRE"),
        @XmlEnumValue("DEL")
        VALUE_DEL("DEL");
        private final String value;

        Rq074Crud(String v) {
            value = v;
        }

        /**
         * Gets the value associated to the enum constant.
         * 
         * @return
         *     The value linked to the enum.
         */
        public String value() {
            return value;
        }

        /**
         * Gets the enum associated to the value passed as parameter.
         * 
         * @param v
         *     The value to get the enum from.
         * @return
         *     The enum which corresponds to the value, if it exists.
         * @throws IllegalArgumentException
         *     If no value matches in the enum declaration.
         */
        public static Dfhcommarea.Rq074Crud fromValue(String v) {
            for (Dfhcommarea.Rq074Crud c: Dfhcommarea.Rq074Crud.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
