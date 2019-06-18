package device.overview.deviceoverview.api.factories;

import device.overview.deviceoverview.generated.GetDeviceList;

import javax.xml.bind.JAXBElement;

public interface GetDeviceListFactory {

    JAXBElement<GetDeviceList> getDeviceList();
}
