import {AfterContentInit, AfterViewInit, Component, OnInit} from "@angular/core";

import {Router} from "@angular/router";
import {Device} from "../models/device.model";
import {DeviceService} from "../service/device.service";
import {addHandler, connect} from "../util/ws.js";
import {first, last} from "rxjs/operators";

@Component({
  selector: 'app-edit-user',
  templateUrl: './devices.component.html',
  styleUrls: ['./devices.component.css']
})
export class DevicesComponent implements OnInit, AfterContentInit {
    devices: Device [];

    constructor(private router: Router, private deviceService: DeviceService) {
        connect();
    }

    ngOnInit(): void {
        this.collectData();
    }

    ngAfterContentInit(): void {
        this.wsHandling();
    }

    wsHandling(): void {
        addHandler(data => {
            if (data.objectType === 'DEVICE') {
                switch (data.eventType) {
                    case 'WS_EVENT_TYPE':
                        console.log(data.objectType + ' ' + data.eventType);
                        this.collectData();
                        break;
                    case 'WS_NOTIFICATION':
                        if(!data.body.notified){
                            this.showMessage(data.body);
                            console.log(data.objectType + ' ' + data.eventType);
                        }
                }
            } else {
                console.error(`Looks like the object type is unknown "${data.objectType}"`);
            }
        });
    }

    collectData() {
        this.deviceService.getDevices().subscribe(data => {
            this.devices = data;
        });
    }

    showDeviceLog(id) {
        localStorage.removeItem('deviceLogId');
        localStorage.setItem('deviceLogId', id);
        this.router.navigate(['device-log/' + id]);
    }

    checkColor(eventType: string){
        if(eventType != null) {
            switch (eventType) {
                case 'ON_LINE':
                    return '#6EAF6E';
                case 'TEMPORARY_OFF_LINE':
                    return '#FFC752';
                case 'OFF_LINE':
                    return '#F2695F'
            }
        } else {
            return '#BBBBBB';
        }
    }

    showMessage(device: Device) {
        if (confirm(device.name + ' id: ' + device.id + ' is offline over 5 minutes')) {
            device.notified = true;
            this.deviceService
                .updateDevice(device)
                .pipe(first())
                .subscribe();
        }
    }

    getHeight(){
        return '10px';
    }
}
