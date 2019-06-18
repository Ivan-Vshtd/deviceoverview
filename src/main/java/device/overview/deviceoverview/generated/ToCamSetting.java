
package device.overview.deviceoverview.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toCamSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toCamSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fpsParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mjpegURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ptzPositions" type="{http://services.business.admin.ceyeclon.com/}ptzPos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resolutionParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtspPossible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rtspURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streamFiles" type="{http://services.business.admin.ceyeclon.com/}toStreamFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toCamSetting", namespace = "http://services.business.admin.ceyeclon.com/", propOrder = {
    "fpsParameter",
    "mjpegURL",
    "ptzPositions",
    "resolutionParameter",
    "rtspPossible",
    "rtspURL",
    "streamFiles"
})
public class ToCamSetting {

    protected String fpsParameter;
    protected String mjpegURL;
    @XmlElement(nillable = true)
    protected List<PtzPos> ptzPositions;
    protected String resolutionParameter;
    protected boolean rtspPossible;
    protected String rtspURL;
    @XmlElement(nillable = true)
    protected List<ToStreamFile> streamFiles;

    /**
     * Gets the value of the fpsParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpsParameter() {
        return fpsParameter;
    }

    /**
     * Sets the value of the fpsParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpsParameter(String value) {
        this.fpsParameter = value;
    }

    /**
     * Gets the value of the mjpegURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMjpegURL() {
        return mjpegURL;
    }

    /**
     * Sets the value of the mjpegURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMjpegURL(String value) {
        this.mjpegURL = value;
    }

    /**
     * Gets the value of the ptzPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptzPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtzPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtzPos }
     * 
     * 
     */
    public List<PtzPos> getPtzPositions() {
        if (ptzPositions == null) {
            ptzPositions = new ArrayList<PtzPos>();
        }
        return this.ptzPositions;
    }

    /**
     * Gets the value of the resolutionParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionParameter() {
        return resolutionParameter;
    }

    /**
     * Sets the value of the resolutionParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionParameter(String value) {
        this.resolutionParameter = value;
    }

    /**
     * Gets the value of the rtspPossible property.
     * 
     */
    public boolean isRtspPossible() {
        return rtspPossible;
    }

    /**
     * Sets the value of the rtspPossible property.
     * 
     */
    public void setRtspPossible(boolean value) {
        this.rtspPossible = value;
    }

    /**
     * Gets the value of the rtspURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtspURL() {
        return rtspURL;
    }

    /**
     * Sets the value of the rtspURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtspURL(String value) {
        this.rtspURL = value;
    }

    /**
     * Gets the value of the streamFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streamFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreamFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToStreamFile }
     * 
     * 
     */
    public List<ToStreamFile> getStreamFiles() {
        if (streamFiles == null) {
            streamFiles = new ArrayList<ToStreamFile>();
        }
        return this.streamFiles;
    }

}
