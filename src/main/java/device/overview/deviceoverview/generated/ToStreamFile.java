
package device.overview.deviceoverview.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toStreamFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toStreamFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtmpStreamAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtspStreamAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toStreamFile", namespace = "http://services.business.admin.ceyeclon.com/", propOrder = {
    "name",
    "rtmpStreamAddress",
    "rtspStreamAddress"
})
public class ToStreamFile {

    protected String name;
    protected String rtmpStreamAddress;
    protected String rtspStreamAddress;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rtmpStreamAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtmpStreamAddress() {
        return rtmpStreamAddress;
    }

    /**
     * Sets the value of the rtmpStreamAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtmpStreamAddress(String value) {
        this.rtmpStreamAddress = value;
    }

    /**
     * Gets the value of the rtspStreamAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtspStreamAddress() {
        return rtspStreamAddress;
    }

    /**
     * Sets the value of the rtspStreamAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtspStreamAddress(String value) {
        this.rtspStreamAddress = value;
    }

}
