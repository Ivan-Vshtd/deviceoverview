package device.overview.deviceoverview.factories;

import device.overview.deviceoverview.api.factories.PingFactory;
import device.overview.deviceoverview.generated.ObjectFactory;
import device.overview.deviceoverview.generated.Ping;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;

@Component
public class PingFactoryImpl implements PingFactory {

    private ObjectFactory objectFactory;

    public PingFactoryImpl(ObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
    }

    @Override
    public JAXBElement<Ping> getPing(String ip, int gateway) {
        Ping ping = objectFactory.createPing();
        ping.setIp(ip);
        ping.setGateway(gateway);
        return objectFactory.createPing(ping);
    }
}
