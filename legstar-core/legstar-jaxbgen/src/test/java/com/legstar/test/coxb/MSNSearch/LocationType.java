
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Location complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "latitude",
    "longitude",
    "radius"
})
public class LocationType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Latitude")
    @CobolElement(cobolName = "Latitude", type = CobolType.DOUBLE_FLOAT_ITEM, levelNumber = 15, usage = "COMP-2")
    protected double latitude;
    @XmlElement(name = "Longitude")
    @CobolElement(cobolName = "Longitude", type = CobolType.DOUBLE_FLOAT_ITEM, levelNumber = 15, usage = "COMP-2")
    protected double longitude;
    @XmlElement(name = "Radius", defaultValue = "5.0")
    @CobolElement(cobolName = "Radius", type = CobolType.DOUBLE_FLOAT_ITEM, levelNumber = 15, usage = "COMP-2")
    protected Double radius;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return true;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return true;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadius(Double value) {
        this.radius = value;
    }

    public boolean isSetRadius() {
        return (this.radius!= null);
    }

}
