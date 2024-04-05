
package com.legstar.test.coxb.MSNSearch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SourceType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="SourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Web"/&gt;
 *     &lt;enumeration value="News"/&gt;
 *     &lt;enumeration value="Ads"/&gt;
 *     &lt;enumeration value="InlineAnswers"/&gt;
 *     &lt;enumeration value="PhoneBook"/&gt;
 *     &lt;enumeration value="WordBreaker"/&gt;
 *     &lt;enumeration value="Spelling"/&gt;
 *     &lt;enumeration value="QueryLocation"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Video"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SourceType")
@XmlEnum
public enum SourceTypeType {

    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("News")
    NEWS("News"),
    @XmlEnumValue("Ads")
    ADS("Ads"),
    @XmlEnumValue("InlineAnswers")
    INLINE_ANSWERS("InlineAnswers"),
    @XmlEnumValue("PhoneBook")
    PHONE_BOOK("PhoneBook"),
    @XmlEnumValue("WordBreaker")
    WORD_BREAKER("WordBreaker"),
    @XmlEnumValue("Spelling")
    SPELLING("Spelling"),
    @XmlEnumValue("QueryLocation")
    QUERY_LOCATION("QueryLocation"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Video")
    VIDEO("Video");
    private final String value;

    SourceTypeType(String v) {
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
    public static SourceTypeType fromValue(String v) {
        for (SourceTypeType c: SourceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
