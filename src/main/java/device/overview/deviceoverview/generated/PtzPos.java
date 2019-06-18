
package device.overview.deviceoverview.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ptzPos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ptzPos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commands" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ptzPos", namespace = "http://services.business.admin.ceyeclon.com/", propOrder = {
    "commands",
    "nameDE",
    "nameEN",
    "nameFR",
    "specialValue",
    "value"
})
public class PtzPos {

    @XmlElement(nillable = true)
    protected List<String> commands;
    protected String nameDE;
    protected String nameEN;
    protected String nameFR;
    protected String specialValue;
    protected String value;

    /**
     * Gets the value of the commands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommands() {
        if (commands == null) {
            commands = new ArrayList<String>();
        }
        return this.commands;
    }

    /**
     * Gets the value of the nameDE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDE() {
        return nameDE;
    }

    /**
     * Sets the value of the nameDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDE(String value) {
        this.nameDE = value;
    }

    /**
     * Gets the value of the nameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEN() {
        return nameEN;
    }

    /**
     * Sets the value of the nameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEN(String value) {
        this.nameEN = value;
    }

    /**
     * Gets the value of the nameFR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFR() {
        return nameFR;
    }

    /**
     * Sets the value of the nameFR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFR(String value) {
        this.nameFR = value;
    }

    /**
     * Gets the value of the specialValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialValue() {
        return specialValue;
    }

    /**
     * Sets the value of the specialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialValue(String value) {
        this.specialValue = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
