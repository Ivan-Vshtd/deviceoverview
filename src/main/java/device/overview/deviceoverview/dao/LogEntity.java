package device.overview.deviceoverview.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import device.overview.deviceoverview.dto.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class LogEntity {

    private static final String DATE_PATTERN = "yyyy-MM-dd HH:mm";

    private EventType eventType;

    @JsonFormat(pattern = DATE_PATTERN)
    private LocalDateTime time;
}
