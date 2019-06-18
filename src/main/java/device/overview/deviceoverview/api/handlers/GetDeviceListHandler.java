package device.overview.deviceoverview.api.handlers;

import device.overview.deviceoverview.generated.ToDevice;

import java.util.List;

public interface GetDeviceListHandler {

    List<ToDevice> handle();
}
