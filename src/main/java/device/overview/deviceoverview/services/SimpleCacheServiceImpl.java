package device.overview.deviceoverview.services;

import device.overview.deviceoverview.api.handlers.GetDeviceListHandler;
import device.overview.deviceoverview.api.services.SimpleCacheService;
import device.overview.deviceoverview.dto.DeviceDto;
import device.overview.deviceoverview.generated.ToDevice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class SimpleCacheServiceImpl implements SimpleCacheService {

    private static ConcurrentMap<Integer, DeviceDto> cachedDevices = new ConcurrentHashMap<>();
    private final GetDeviceListHandler getDeviceListHandler;

    public SimpleCacheServiceImpl(GetDeviceListHandler getDeviceListHandler) {
        this.getDeviceListHandler = getDeviceListHandler;
    }

    @Override
    public List<DeviceDto> getAllCachedDevices() {
        if(cachedDevices.values().isEmpty()){
            receiveDevicesForCache();
        }
        Collection<DeviceDto> values = cachedDevices.values();
        return new ArrayList<>(values);
    }

    @Override
    public void putAllDevices(List<ToDevice> devices) {
        devices.forEach(d -> cachedDevices.putIfAbsent(d.getId(), new DeviceDto(d)));
    }

    @Override
    public DeviceDto getOne(int id) {
        if(cachedDevices.values().isEmpty()){
            receiveDevicesForCache();
        }
        return cachedDevices.get(id);
    }

    @Override
    public void putOne(int id, DeviceDto deviceDto) {
        cachedDevices.put(id, deviceDto);
    }

    @Override
    public List<ToDevice> receiveDevicesForCache() {
        List<ToDevice> devices = getDeviceListHandler.handle();
        putAllDevices(devices);
        return devices;
    }
}
