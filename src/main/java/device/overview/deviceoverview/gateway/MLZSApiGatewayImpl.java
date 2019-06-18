package device.overview.deviceoverview.gateway;

import device.overview.deviceoverview.api.gateway.MLZSApiGateway;
import device.overview.deviceoverview.generated.GetDeviceList;
import device.overview.deviceoverview.generated.GetDeviceListResponse;
import device.overview.deviceoverview.generated.Ping;
import device.overview.deviceoverview.generated.PingResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;


@Component
public class MLZSApiGatewayImpl implements MLZSApiGateway {

    private WebServiceTemplate webServiceTemplate;
    private static final SoapActionCallback getDeviceListCallBack =
            new SoapActionCallback("http://services.business.admin.ceyeclon.com/MLZStateAPI/getDeviceList");
    private static final SoapActionCallback getPingCallBack =
            new SoapActionCallback("http://services.business.admin.ceyeclon.com/MLZStateAPI/ping");

    public MLZSApiGatewayImpl(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    @Override
    public JAXBElement<GetDeviceListResponse> sendRequestToDevices(JAXBElement<GetDeviceList> getDeviceList) {
       return getResponse(getDeviceList, getDeviceListCallBack);
    }

    @Override
    public JAXBElement<PingResponse> sendRequestToPing(JAXBElement<Ping> ping) {
        return getResponse(ping, getPingCallBack);
    }

    @SuppressWarnings("unchecked")
    private <T> T getResponse(JAXBElement<?> request, SoapActionCallback soapActionCallback) {
        return (T) webServiceTemplate.marshalSendAndReceive(request, soapActionCallback);
    }
}
