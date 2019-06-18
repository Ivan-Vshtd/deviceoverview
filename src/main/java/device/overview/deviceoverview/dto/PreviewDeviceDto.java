package device.overview.deviceoverview.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import device.overview.deviceoverview.dao.LogEntity;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import static device.overview.deviceoverview.util.ProjectHelper.addLastChecks;

@ToString
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreviewDeviceDto {
    private int id;
    private String ip;
    private String name;
    private EventType eventType;
    private LogEntity[] lastChecks = new LogEntity[5];


    public static PreviewDeviceDto fromDeviceDto(DeviceDto deviceDto){
        return PreviewDeviceDto
                            .builder()
                            .id(deviceDto.getId())
                            .ip(deviceDto.getIp())
                            .name(deviceDto.getName())
                            .eventType(deviceDto.getEventType())
                            .lastChecks(addLastChecks(deviceDto.getStateLog()))
                            .build();
    }
}

