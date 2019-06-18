package device.overview.deviceoverview.handlers;

import device.overview.deviceoverview.api.factories.GetDeviceListFactory;
import device.overview.deviceoverview.api.gateway.MLZSApiGateway;
import device.overview.deviceoverview.api.handlers.GetDeviceListHandler;
import device.overview.deviceoverview.generated.ToDevice;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetDeviceListHandlerImpl implements GetDeviceListHandler {

    private MLZSApiGateway mlzsApiGateway;
    private GetDeviceListFactory getDeviceListFactory;

    public GetDeviceListHandlerImpl(MLZSApiGateway mlzsApiGateway, GetDeviceListFactory getDeviceListFactory) {
        this.mlzsApiGateway = mlzsApiGateway;
        this.getDeviceListFactory = getDeviceListFactory;
    }

    @Override
    public List<ToDevice> handle() {
        return mlzsApiGateway
                .sendRequestToDevices(getDeviceListFactory.getDeviceList())
                .getValue()
                .getReturn();
    }
}
