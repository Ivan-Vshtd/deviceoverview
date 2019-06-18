package device.overview.deviceoverview.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ConfigurationProperties {

    @Value("${device.control.api.url}")
    private String devicesControlApiUrl;

    @Value("${api.key}")
    private String apiKey;

    @Value("${log.length.minutes}")
    private Long logTime;


}
