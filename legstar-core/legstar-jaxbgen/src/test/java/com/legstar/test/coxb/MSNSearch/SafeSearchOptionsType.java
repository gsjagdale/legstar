
package com.legstar.test.coxb.MSNSearch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SafeSearchOptions</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="SafeSearchOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Moderate"/&gt;
 *     &lt;enumeration value="Strict"/&gt;
 *     &lt;enumeration value="Off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SafeSearchOptions")
@XmlEnum
public enum SafeSearchOptionsType {

    @XmlEnumValue("Moderate")
    MODERATE("Moderate"),
    @XmlEnumValue("Strict")
    STRICT("Strict"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    SafeSearchOptionsType(String v) {
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
    public static SafeSearchOptionsType fromValue(String v) {
        for (SafeSearchOptionsType c: SafeSearchOptionsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
