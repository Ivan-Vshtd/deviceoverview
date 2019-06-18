package device.overview.deviceoverview.services;

import device.overview.deviceoverview.api.handlers.PingHandler;
import device.overview.deviceoverview.api.services.SimpleCacheService;
import device.overview.deviceoverview.api.services.TrackingDeviceService;
import device.overview.deviceoverview.dto.DeviceDto;
import device.overview.deviceoverview.dto.EventType;
import device.overview.deviceoverview.dto.ObjectType;
import device.overview.deviceoverview.dto.PreviewDeviceDto;
import device.overview.deviceoverview.generated.PingTO;
import device.overview.deviceoverview.generated.ToDevice;
import device.overview.deviceoverview.services.wssender.WsSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TrackingDeviceServiceImpl implements TrackingDeviceService {

    private final PingHandler pingHandler;
    private final BiConsumer<EventType, DeviceDto> wsSender;
    private final SimpleCacheService simpleCacheService;

    public TrackingDeviceServiceImpl(
            SimpleCacheService simpleCacheService,
            PingHandler pingHandler,
            WsSender wsSender) {
        this.simpleCacheService = simpleCacheService;
        this.pingHandler = pingHandler;
        this.wsSender = wsSender.getSender(ObjectType.DEVICE);
    }

    @Override
    public List<DeviceDto> getAllDevices() {
        return simpleCacheService.getAllCachedDevices();
    }

    @Override
    public List<ToDevice> receiveDevices() {
        return simpleCacheService.receiveDevicesForCache();
    }

    @Override
    public DeviceDto getDevice(int id) {
        return simpleCacheService.getOne(id);
    }

    @Override
    public DeviceDto updateDeviceInfo(PingTO pingTO) {
        log.debug("updating device info");

        DeviceDto editableDevice = simpleCacheService.getOne(pingTO.getMaingatewayID());
        editableDevice.update(pingTO);
        simpleCacheService.putOne(editableDevice.getId(), editableDevice);

        log.debug("{} with id:{} was successfully updated", editableDevice.getName(), editableDevice.getId());
        return editableDevice;
    }

    @Override
    public PingTO getPing(String ip, int id) {
        return pingHandler.handle(ip, id);
    }

    @Override
    public void notifyUI(DeviceDto deviceDto) {
        wsSender.accept(EventType.WS_EVENT_TYPE, new DeviceDto());
        if(deviceDto.getEventType().equals(EventType.OFF_LINE) && !deviceDto.isNotified()){

            log.info("device {} with id:{} is offlone too long, will notify operator", deviceDto.getName(), deviceDto.getId());
            wsSender.accept(EventType.WS_NOTIFICATION, deviceDto);
        }
    }

    @Override
    public List<PreviewDeviceDto> getAllPreviews() {
        List<PreviewDeviceDto> previews =
                getAllDevices()
                .stream()
                .map(PreviewDeviceDto::fromDeviceDto)
                .collect(Collectors.toList());

        previews.forEach(pdto -> {
            if(pdto.getIp() == null)
            { pdto.setIp("");}
        });

        return previews
                .stream()
                .sorted(Comparator.comparing(PreviewDeviceDto::getIp))
                .collect(Collectors.toList());
    }

    @Override
    public void updateDevice(int id, DeviceDto deviceDto) {
        DeviceDto editableDevice = simpleCacheService.getOne(id);
        editableDevice.setNotified(true);
        simpleCacheService.putOne(editableDevice.getId(), editableDevice);

        log.info("notification state of {} with id:{} successfully updated!", editableDevice.getName(), editableDevice.getId());
    }
}
