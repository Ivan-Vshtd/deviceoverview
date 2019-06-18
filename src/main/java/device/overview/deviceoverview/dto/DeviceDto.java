package device.overview.deviceoverview.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import device.overview.deviceoverview.dao.LogEntity;
import device.overview.deviceoverview.generated.PingTO;
import device.overview.deviceoverview.generated.ToDevice;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import static device.overview.deviceoverview.util.ProjectHelper.decision;

@ToString
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceDto {
    private static final String DATE_PATTERN = "yyyy-MM-dd HH:mm";

    private int id;
    private String ip;
    private String name;
    private boolean state;
    private boolean notified;
    private EventType eventType;

    @JsonFormat(pattern = DATE_PATTERN)
    private LocalDateTime lastOnLineTime;
    private Queue<LogEntity> stateLog = new ConcurrentLinkedQueue<>();

    public DeviceDto(ToDevice toDevice){
        this.id = toDevice.getId();
        this.ip = toDevice.getIp();
        this.name = toDevice.getName();
    }

    public DeviceDto update(PingTO pingTO){
        this.id = pingTO.getMaingatewayID();
        this.ip = pingTO.getIp();
        this.state = pingTO.isState();
        this.lastOnLineTime = decision(this, pingTO.isState());
        return this;
    }
}
