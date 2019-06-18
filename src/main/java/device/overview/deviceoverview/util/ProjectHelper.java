package device.overview.deviceoverview.util;

import device.overview.deviceoverview.config.ConfigurationProperties;
import device.overview.deviceoverview.dao.LogEntity;
import device.overview.deviceoverview.dto.DeviceDto;
import device.overview.deviceoverview.dto.EventType;
import device.overview.deviceoverview.generated.ToDevice;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Queue;
import java.util.stream.Collectors;

@Component
public class ProjectHelper {

    private static Long LOG_MINUTES;

    public ProjectHelper(ConfigurationProperties configurationProperties) {
        LOG_MINUTES = configurationProperties.getLogTime();
    }

    public static LocalDateTime decision(DeviceDto deviceDto, boolean isState) {

        if (!isState && deviceDto.getLastOnLineTime() == null) {
            deviceDto.setLastOnLineTime(LocalDateTime.now());
            deviceDto.setEventType(EventType.TEMPORARY_OFF_LINE);
            stateLog(deviceDto, EventType.TEMPORARY_OFF_LINE);
        }
        else if (!isState && deviceDto.getLastOnLineTime().isAfter(LocalDateTime.now().minus(5, ChronoUnit.MINUTES))) {
            deviceDto.setEventType(EventType.TEMPORARY_OFF_LINE);
            stateLog(deviceDto, EventType.TEMPORARY_OFF_LINE);
        }
        else if (!isState && deviceDto.getLastOnLineTime().isBefore(LocalDateTime.now().minus(5, ChronoUnit.MINUTES))) {
            deviceDto.setEventType(EventType.OFF_LINE);
            stateLog(deviceDto, EventType.OFF_LINE);
        }
        else {
            deviceDto.setLastOnLineTime(LocalDateTime.now());
            deviceDto.setEventType(EventType.ON_LINE);
            deviceDto.setNotified(false);
            stateLog(deviceDto, EventType.ON_LINE);
        }
        acceptLogLength(LOG_MINUTES, deviceDto.getStateLog());
        return deviceDto.getLastOnLineTime();
    }

    public static ToDevice fromDeviceDTO(DeviceDto deviceDto){
        ToDevice toDevice = new ToDevice();
        toDevice.setId(deviceDto.getId());
        toDevice.setIp(deviceDto.getIp());
        toDevice.setName(deviceDto.getName());
        return toDevice;
    }

    private static void acceptLogLength(Long minutes, Queue<LogEntity> log){
        if(log != null && !log.isEmpty()){
            while(LocalDateTime.now().minus(minutes, ChronoUnit.MINUTES)
                    .isAfter(log.peek().getTime())){
                log.remove();
            }
        }
    }

    private static void stateLog(DeviceDto deviceDto, EventType eventType){
        deviceDto.getStateLog().add(new LogEntity(eventType, LocalDateTime.now()));
    }

    public static LogEntity[] addLastChecks(Queue<LogEntity> log){
        if(log.size() < 5){
            return log.toArray(new LogEntity[0]);
        }
        return log.stream()
                .skip(log.size() - 5)
                .collect(Collectors.toList())
                .toArray(new LogEntity[5]);
    }

}
