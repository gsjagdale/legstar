
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Image complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImageWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ImageHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ImageFileSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThumbnailWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThumbnailHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThumbnailFileSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "imageURL",
    "imageWidth",
    "imageHeight",
    "imageFileSize",
    "thumbnailURL",
    "thumbnailWidth",
    "thumbnailHeight",
    "thumbnailFileSize"
})
public class ImageType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ImageURL")
    @CobolElement(cobolName = "ImageURL", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String imageURL;
    @XmlElement(name = "ImageWidth")
    @CobolElement(cobolName = "ImageWidth", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected Integer imageWidth;
    @XmlElement(name = "ImageHeight")
    @CobolElement(cobolName = "ImageHeight", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected Integer imageHeight;
    @XmlElement(name = "ImageFileSize")
    @CobolElement(cobolName = "ImageFileSize", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected Integer imageFileSize;
    @XmlElement(name = "ThumbnailURL")
    @CobolElement(cobolName = "ThumbnailURL", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(32)", usage = "DISPLAY")
    protected String thumbnailURL;
    @XmlElement(name = "ThumbnailWidth")
    @CobolElement(cobolName = "ThumbnailWidth", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected Integer thumbnailWidth;
    @XmlElement(name = "ThumbnailHeight")
    @CobolElement(cobolName = "ThumbnailHeight", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected Integer thumbnailHeight;
    @XmlElement(name = "ThumbnailFileSize")
    @CobolElement(cobolName = "ThumbnailFileSize", type = CobolType.BINARY_ITEM, levelNumber = 15, isSigned = true, totalDigits = 9, picture = "9(9)", usage = "COMP-5")
    protected Integer thumbnailFileSize;

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    public boolean isSetImageURL() {
        return (this.imageURL!= null);
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageWidth(Integer value) {
        this.imageWidth = value;
    }

    public boolean isSetImageWidth() {
        return (this.imageWidth!= null);
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageHeight(Integer value) {
        this.imageHeight = value;
    }

    public boolean isSetImageHeight() {
        return (this.imageHeight!= null);
    }

    /**
     * Gets the value of the imageFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageFileSize() {
        return imageFileSize;
    }

    /**
     * Sets the value of the imageFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageFileSize(Integer value) {
        this.imageFileSize = value;
    }

    public boolean isSetImageFileSize() {
        return (this.imageFileSize!= null);
    }

    /**
     * Gets the value of the thumbnailURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailURL() {
        return thumbnailURL;
    }

    /**
     * Sets the value of the thumbnailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailURL(String value) {
        this.thumbnailURL = value;
    }

    public boolean isSetThumbnailURL() {
        return (this.thumbnailURL!= null);
    }

    /**
     * Gets the value of the thumbnailWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    /**
     * Sets the value of the thumbnailWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThumbnailWidth(Integer value) {
        this.thumbnailWidth = value;
    }

    public boolean isSetThumbnailWidth() {
        return (this.thumbnailWidth!= null);
    }

    /**
     * Gets the value of the thumbnailHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    /**
     * Sets the value of the thumbnailHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThumbnailHeight(Integer value) {
        this.thumbnailHeight = value;
    }

    public boolean isSetThumbnailHeight() {
        return (this.thumbnailHeight!= null);
    }

    /**
     * Gets the value of the thumbnailFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThumbnailFileSize() {
        return thumbnailFileSize;
    }

    /**
     * Sets the value of the thumbnailFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThumbnailFileSize(Integer value) {
        this.thumbnailFileSize = value;
    }

    public boolean isSetThumbnailFileSize() {
        return (this.thumbnailFileSize!= null);
    }

}
