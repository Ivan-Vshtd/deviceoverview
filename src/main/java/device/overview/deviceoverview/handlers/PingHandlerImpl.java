package device.overview.deviceoverview.handlers;

import device.overview.deviceoverview.api.factories.PingFactory;
import device.overview.deviceoverview.api.gateway.MLZSApiGateway;
import device.overview.deviceoverview.api.handlers.PingHandler;
import device.overview.deviceoverview.generated.PingTO;
import org.springframework.stereotype.Component;

@Component
public class PingHandlerImpl implements PingHandler {

    private MLZSApiGateway mlzsApiGateway;
    private PingFactory pingFactory;

    public PingHandlerImpl(MLZSApiGateway mlzsApiGateway, PingFactory pingFactory) {
        this.mlzsApiGateway = mlzsApiGateway;
        this.pingFactory = pingFactory;
    }

    @Override
    public PingTO handle(String ip, int gateway) {
        return mlzsApiGateway
                .sendRequestToPing(pingFactory.getPing(ip, gateway))
                .getValue()
                .getReturn();
    }
}
