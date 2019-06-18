
package device.overview.deviceoverview.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="camSetting" type="{http://services.business.admin.ceyeclon.com/}toCamSetting" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://services.business.admin.ceyeclon.com/}toParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluginType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourcePortForPort80" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toDevice", namespace = "http://services.business.admin.ceyeclon.com/", propOrder = {
    "camSetting",
    "id",
    "ip",
    "name",
    "parameters",
    "password",
    "pluginType",
    "sourcePortForPort80",
    "username"
})
public class ToDevice {

    protected ToCamSetting camSetting;
    protected int id;
    protected String ip;
    protected String name;
    @XmlElement(nillable = true)
    protected List<ToParameter> parameters;
    protected String password;
    protected int pluginType;
    protected String sourcePortForPort80;
    protected String username;

    /**
     * Gets the value of the camSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ToCamSetting }
     *     
     */
    public ToCamSetting getCamSetting() {
        return camSetting;
    }

    /**
     * Sets the value of the camSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToCamSetting }
     *     
     */
    public void setCamSetting(ToCamSetting value) {
        this.camSetting = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

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
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToParameter }
     * 
     * 
     */
    public List<ToParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<ToParameter>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the pluginType property.
     * 
     */
    public int getPluginType() {
        return pluginType;
    }

    /**
     * Sets the value of the pluginType property.
     * 
     */
    public void setPluginType(int value) {
        this.pluginType = value;
    }

    /**
     * Gets the value of the sourcePortForPort80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePortForPort80() {
        return sourcePortForPort80;
    }

    /**
     * Sets the value of the sourcePortForPort80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePortForPort80(String value) {
        this.sourcePortForPort80 = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
