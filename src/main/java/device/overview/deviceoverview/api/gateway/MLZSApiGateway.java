package device.overview.deviceoverview.api.gateway;

import device.overview.deviceoverview.generated.GetDeviceList;
import device.overview.deviceoverview.generated.GetDeviceListResponse;
import device.overview.deviceoverview.generated.Ping;
import device.overview.deviceoverview.generated.PingResponse;

import javax.xml.bind.JAXBElement;

public interface MLZSApiGateway {

    JAXBElement<GetDeviceListResponse> sendRequestToDevices(JAXBElement<GetDeviceList> getDeviceList);
    JAXBElement<PingResponse> sendRequestToPing(JAXBElement<Ping> getPing);

}
