
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for DateTime complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="DateTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Second" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTime", propOrder = {
    "year",
    "month",
    "day",
    "hour",
    "minute",
    "second"
})
public class DateTimeType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Year")
    @CobolElement(cobolName = "Year", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int year;
    @XmlElement(name = "Month")
    @CobolElement(cobolName = "Month", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int month;
    @XmlElement(name = "Day")
    @CobolElement(cobolName = "R-Day", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int day;
    @XmlElement(name = "Hour")
    @CobolElement(cobolName = "Hour", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int hour;
    @XmlElement(name = "Minute")
    @CobolElement(cobolName = "Minute", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int minute;
    @XmlElement(name = "Second")
    @CobolElement(cobolName = "Second", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected int second;

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    public boolean isSetYear() {
        return true;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    public boolean isSetMonth() {
        return true;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    public boolean isSetDay() {
        return true;
    }

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    public boolean isSetHour() {
        return true;
    }

    /**
     * Gets the value of the minute property.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

    public boolean isSetMinute() {
        return true;
    }

    /**
     * Gets the value of the second property.
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

    public boolean isSetSecond() {
        return true;
    }

}
