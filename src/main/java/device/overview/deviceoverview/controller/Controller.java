package device.overview.deviceoverview.controller;

import device.overview.deviceoverview.api.services.TrackingDeviceService;
import device.overview.deviceoverview.dto.DeviceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("devices")
public class Controller {


    private TrackingDeviceService trackingDeviceService;

    public Controller(TrackingDeviceService trackingDeviceService) {
        this.trackingDeviceService = trackingDeviceService;
    }

    @GetMapping
    public ResponseEntity TrackingDevices(){
        return new ResponseEntity<>(trackingDeviceService.getAllPreviews(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity getPing(@PathVariable int id){
        return new ResponseEntity<>(trackingDeviceService.getDevice(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity updateDevice(@PathVariable int id, @RequestBody DeviceDto deviceDto){
        trackingDeviceService.updateDevice(id, deviceDto);
        return ResponseEntity.ok().build();
    }

}
