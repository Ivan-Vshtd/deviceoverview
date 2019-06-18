
package device.overview.deviceoverview.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GATEWAY"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="CAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pingType", namespace = "http://services.business.admin.ceyeclon.com/")
@XmlEnum
public enum PingType {

    GATEWAY,
    PC,
    CAM;

    public String value() {
        return name();
    }

    public static PingType fromValue(String v) {
        return valueOf(v);
    }

}
