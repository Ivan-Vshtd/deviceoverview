package device.overview.deviceoverview.factories;

import device.overview.deviceoverview.api.factories.GetDeviceListFactory;
import device.overview.deviceoverview.config.ConfigurationProperties;
import device.overview.deviceoverview.generated.GetDeviceList;
import device.overview.deviceoverview.generated.ObjectFactory;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;

@Component
public class GetDeviceListFactoryImpl implements GetDeviceListFactory {

    private ConfigurationProperties configurationProperties;
    private ObjectFactory objectFactory;

    public GetDeviceListFactoryImpl(ConfigurationProperties configurationProperties, ObjectFactory objectFactory) {
        this.configurationProperties = configurationProperties;
        this.objectFactory = objectFactory;
    }

    @Override
    public JAXBElement<GetDeviceList> getDeviceList() {
        GetDeviceList getDeviceList = objectFactory.createGetDeviceList();
        getDeviceList.setKey(configurationProperties.getApiKey());
        return objectFactory.createGetDeviceList(getDeviceList);
    }
}
