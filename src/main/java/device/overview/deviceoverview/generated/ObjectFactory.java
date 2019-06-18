
package device.overview.deviceoverview.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the device.overview.deviceoverview.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDeviceList_QNAME = new QName("http://services.business.admin.ceyeclon.com/", "getDeviceList");
    private final static QName _Ping_QNAME = new QName("http://services.business.admin.ceyeclon.com/", "ping");
    private final static QName _GetDeviceListResponse_QNAME = new QName("http://services.business.admin.ceyeclon.com/", "getDeviceListResponse");
    private final static QName _PingResponse_QNAME = new QName("http://services.business.admin.ceyeclon.com/", "pingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: device.overview.deviceoverview.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDeviceListResponse }
     * 
     */
    public GetDeviceListResponse createGetDeviceListResponse() {
        return new GetDeviceListResponse();
    }

    /**
     * Create an instance of {@link GetDeviceList }
     * 
     */
    public GetDeviceList createGetDeviceList() {
        return new GetDeviceList();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link PingTO }
     * 
     */
    public PingTO createPingTO() {
        return new PingTO();
    }

    /**
     * Create an instance of {@link PtzPos }
     * 
     */
    public PtzPos createPtzPos() {
        return new PtzPos();
    }

    /**
     * Create an instance of {@link ToParameter }
     * 
     */
    public ToParameter createToParameter() {
        return new ToParameter();
    }

    /**
     * Create an instance of {@link ToCamSetting }
     * 
     */
    public ToCamSetting createToCamSetting() {
        return new ToCamSetting();
    }

    /**
     * Create an instance of {@link ToStreamFile }
     * 
     */
    public ToStreamFile createToStreamFile() {
        return new ToStreamFile();
    }

    /**
     * Create an instance of {@link ToDevice }
     * 
     */
    public ToDevice createToDevice() {
        return new ToDevice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.business.admin.ceyeclon.com/", name = "getDeviceList")
    public JAXBElement<GetDeviceList> createGetDeviceList(GetDeviceList value) {
        return new JAXBElement<GetDeviceList>(_GetDeviceList_QNAME, GetDeviceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.business.admin.ceyeclon.com/", name = "ping")
    public JAXBElement<Ping> createPing(Ping value) {
        return new JAXBElement<Ping>(_Ping_QNAME, Ping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.business.admin.ceyeclon.com/", name = "getDeviceListResponse")
    public JAXBElement<GetDeviceListResponse> createGetDeviceListResponse(GetDeviceListResponse value) {
        return new JAXBElement<GetDeviceListResponse>(_GetDeviceListResponse_QNAME, GetDeviceListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.business.admin.ceyeclon.com/", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

}
