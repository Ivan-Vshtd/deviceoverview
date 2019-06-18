import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Device} from '../models/device.model';

@Injectable({ providedIn: 'root' })
export class DeviceService {

  private baseUrl = 'http://localhost:8080/devices';

  constructor(private http: HttpClient) {
  }

  public getDevices() {
    return this.http
        .get<Device[]>(this.baseUrl);
  }

  public getDeviceById(id) {
    return this.http
        .get<Device>(this.baseUrl + '/' + id);
  }

  public updateDevice(device: Device){
    return this.http
        .put<Device>(this.baseUrl + '/' + device.id, device);
  }

}
