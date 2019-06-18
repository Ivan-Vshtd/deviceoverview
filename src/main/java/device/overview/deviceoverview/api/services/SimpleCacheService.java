package device.overview.deviceoverview.api.services;

import device.overview.deviceoverview.dto.DeviceDto;
import device.overview.deviceoverview.generated.ToDevice;

import java.util.List;

public interface SimpleCacheService {

    List<DeviceDto> getAllCachedDevices();

    void putAllDevices(List<ToDevice> devices);

    DeviceDto getOne(int id);

    void putOne(int id, DeviceDto deviceDto);

    List<ToDevice> receiveDevicesForCache();
}
