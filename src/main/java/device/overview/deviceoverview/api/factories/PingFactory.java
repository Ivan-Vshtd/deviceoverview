package device.overview.deviceoverview.api.factories;

import device.overview.deviceoverview.generated.Ping;

import javax.xml.bind.JAXBElement;

public interface PingFactory {

    JAXBElement<Ping> getPing(String ip, int gateway);
}
