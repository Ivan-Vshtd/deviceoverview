import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {DeviceService} from "../service/device.service";
import {Device} from "../models/device.model";


@Component({
  selector: 'app-add-user',
  templateUrl: './device-log.component.html',
  styleUrls: ['./device-log.component.css']
})
export class DeviceLogComponent implements OnInit {

  device: Device;

  constructor(private router: Router, private deviceService: DeviceService) {
  }

  ngOnInit(): void {
    let deviceId = localStorage.getItem('deviceLogId');
    console.log(deviceId);
    if (!deviceId) {
      alert('Invalid action!');
      this.router.navigate(['']);
      return;
    }
    this.deviceService.getDeviceById(deviceId).subscribe(
        data => {
          this.device = data
        }
    )
  }

  checkColor(eventType: string){
    if(eventType != null) {
      switch (eventType) {
        case 'ON_LINE':
          return '#6EAF6E';
        case 'OFF_LINE':
          return '#F2695F';
        case 'TEMPORARY_OFF_LINE':
          return '#FFC752'
      }
    } else {
      return '#BBBBBB';
    }
  }
}
