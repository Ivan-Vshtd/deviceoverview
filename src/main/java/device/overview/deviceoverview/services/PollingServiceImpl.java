package device.overview.deviceoverview.services;

import device.overview.deviceoverview.api.services.PollingService;
import device.overview.deviceoverview.api.services.TrackingDeviceService;
import device.overview.deviceoverview.generated.PingTO;
import device.overview.deviceoverview.generated.ToDevice;
import device.overview.deviceoverview.util.ProjectHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@Slf4j
@Service
@EnableScheduling
public class PollingServiceImpl implements PollingService {

    private static final String SCHEDULED_DELAY = "${polling.scheduled.delay}";
    private static final String SCHEDULED_OFFLINE_DELAY = "${polling.scheduled.offline.delay}";
    private static final String INITIAL_DELAY_STRING = "1000";
    private static final String INITIAL_DELAY_STRING_OFF_LINE = "60000";

    private static final ExecutorService executorService = Executors.newFixedThreadPool(3);
    private final TrackingDeviceService trackingDeviceService;


    public PollingServiceImpl(TrackingDeviceService trackingDeviceService) {
        this.trackingDeviceService = trackingDeviceService;
    }

    @Scheduled(fixedDelayString = SCHEDULED_DELAY, initialDelayString = INITIAL_DELAY_STRING)
    @Override
    public void polling() {

        log.info("Polling service in schedule");
        executorService.submit(getPollingTask(trackingDeviceService.receiveDevices()));
    }

    @Scheduled(fixedRateString = SCHEDULED_OFFLINE_DELAY, initialDelayString = INITIAL_DELAY_STRING_OFF_LINE)
    @Override
    public void pollingOffLines() {
        List<ToDevice> offLineDevices =
                trackingDeviceService.getAllDevices()
                .stream()
                .filter(deviceDto -> !deviceDto.isState())
                .map(ProjectHelper::fromDeviceDTO)
                .collect(Collectors.toList());

        if (offLineDevices.isEmpty()) {
            return;
        }

        log.info("Polling service in schedule (offline devices)");
        offLineDevices.forEach(dev -> Executors.newFixedThreadPool(1)
                .submit(getPollingTask(Collections.singletonList(dev))));
    }

    private Runnable getPollingTask(List<ToDevice> receivedDevices) {
        return () -> {
            try {
                receivedDevices.forEach(d -> {
                    PingTO pingTo = trackingDeviceService.getPing(d.getIp(), d.getId());
                    trackingDeviceService.notifyUI(trackingDeviceService.updateDeviceInfo(pingTo));
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }
}
