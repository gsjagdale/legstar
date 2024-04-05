
package com.legstar.test.coxb.MSNSearch;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Result complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Result"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CacheUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SearchTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}Address" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}Location" minOccurs="0"/&gt;
 *         &lt;element name="SearchTagsArray" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}ArrayOfSearchTagSearchTagsArray" minOccurs="0"/&gt;
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}Image" minOccurs="0"/&gt;
 *         &lt;element name="Video" type="{http://schemas.microsoft.com/MSNSearch/2005/09/fex}Video" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "title",
    "description",
    "url",
    "displayUrl",
    "cacheUrl",
    "source",
    "searchTags",
    "phone",
    "dateTime",
    "address",
    "location",
    "searchTagsArray",
    "summary",
    "resultType",
    "image",
    "video"
})
public class ResultType
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Title")
    @CobolElement(cobolName = "R-Title", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String title;
    @XmlElement(name = "Description")
    @CobolElement(cobolName = "Description", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(256)", usage = "DISPLAY")
    protected String description;
    @XmlElement(name = "Url")
    @CobolElement(cobolName = "Url", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String url;
    @XmlElement(name = "DisplayUrl")
    @CobolElement(cobolName = "DisplayUrl", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String displayUrl;
    @XmlElement(name = "CacheUrl")
    @CobolElement(cobolName = "CacheUrl", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String cacheUrl;
    @XmlElement(name = "Source")
    @CobolElement(cobolName = "R-Source", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String source;
    @XmlElement(name = "SearchTags")
    @CobolElement(cobolName = "SearchTags", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String searchTags;
    @XmlElement(name = "Phone")
    @CobolElement(cobolName = "Phone", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String phone;
    @XmlElement(name = "DateTime")
    @CobolElement(cobolName = "DateTime", type = CobolType.GROUP_ITEM, levelNumber = 13)
    protected DateTimeType dateTime;
    @XmlElement(name = "Address")
    @CobolElement(cobolName = "R-Address", type = CobolType.GROUP_ITEM, levelNumber = 13)
    protected AddressType address;
    @XmlElement(name = "Location")
    @CobolElement(cobolName = "Location", type = CobolType.GROUP_ITEM, levelNumber = 13)
    protected LocationType location;
    @XmlElement(name = "SearchTagsArray")
    @CobolElement(cobolName = "SearchTagsArray", type = CobolType.GROUP_ITEM, levelNumber = 13)
    protected ArrayOfSearchTagSearchTagsArrayType searchTagsArray;
    @XmlElement(name = "Summary")
    @CobolElement(cobolName = "Summary", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String summary;
    @XmlElement(name = "ResultType")
    @CobolElement(cobolName = "ResultType", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 13, picture = "X(32)", usage = "DISPLAY")
    protected String resultType;
    @XmlElement(name = "Image")
    @CobolElement(cobolName = "Image", type = CobolType.GROUP_ITEM, levelNumber = 13)
    protected ImageType image;
    @XmlElement(name = "Video")
    @CobolElement(cobolName = "Video", type = CobolType.GROUP_ITEM, levelNumber = 13)
    protected VideoType video;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Gets the value of the displayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the value of the displayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    public boolean isSetDisplayUrl() {
        return (this.displayUrl!= null);
    }

    /**
     * Gets the value of the cacheUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheUrl() {
        return cacheUrl;
    }

    /**
     * Sets the value of the cacheUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheUrl(String value) {
        this.cacheUrl = value;
    }

    public boolean isSetCacheUrl() {
        return (this.cacheUrl!= null);
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Gets the value of the searchTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTags() {
        return searchTags;
    }

    /**
     * Sets the value of the searchTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTags(String value) {
        this.searchTags = value;
    }

    public boolean isSetSearchTags() {
        return (this.searchTags!= null);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

    public boolean isSetDateTime() {
        return (this.dateTime!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the searchTagsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchTagSearchTagsArrayType }
     *     
     */
    public ArrayOfSearchTagSearchTagsArrayType getSearchTagsArray() {
        return searchTagsArray;
    }

    /**
     * Sets the value of the searchTagsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchTagSearchTagsArrayType }
     *     
     */
    public void setSearchTagsArray(ArrayOfSearchTagSearchTagsArrayType value) {
        this.searchTagsArray = value;
    }

    public boolean isSetSearchTagsArray() {
        return (this.searchTagsArray!= null);
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    public boolean isSetSummary() {
        return (this.summary!= null);
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultType(String value) {
        this.resultType = value;
    }

    public boolean isSetResultType() {
        return (this.resultType!= null);
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImage(ImageType value) {
        this.image = value;
    }

    public boolean isSetImage() {
        return (this.image!= null);
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link VideoType }
     *     
     */
    public VideoType getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoType }
     *     
     */
    public void setVideo(VideoType value) {
        this.video = value;
    }

    public boolean isSetVideo() {
        return (this.video!= null);
    }

}
