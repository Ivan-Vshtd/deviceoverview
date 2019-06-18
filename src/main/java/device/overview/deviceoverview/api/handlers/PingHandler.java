package device.overview.deviceoverview.api.handlers;

import device.overview.deviceoverview.generated.PingTO;

public interface PingHandler {

    PingTO handle(String ip, int gateway);
}
