package device.overview.deviceoverview.api.services;

import device.overview.deviceoverview.dto.DeviceDto;
import device.overview.deviceoverview.dto.PreviewDeviceDto;
import device.overview.deviceoverview.generated.PingTO;
import device.overview.deviceoverview.generated.ToDevice;

import java.util.List;

public interface TrackingDeviceService {

    List<DeviceDto> getAllDevices();

    List<ToDevice> receiveDevices();

    DeviceDto getDevice(int id);

    DeviceDto updateDeviceInfo(PingTO pingTO);

    PingTO getPing(String ip, int id);

    void notifyUI(DeviceDto deviceDto);

    List<PreviewDeviceDto> getAllPreviews();

    void updateDevice(int id, DeviceDto deviceDto);
}
