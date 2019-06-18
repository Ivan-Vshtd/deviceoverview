import {RouterModule, Routes} from '@angular/router';
import {DeviceLogComponent} from './device-log/device-log.component';
import {DevicesComponent} from "./devices/devices.component";

const routes: Routes = [
  {path: '', component: DevicesComponent},
  {path: 'device-log/:id', component: DeviceLogComponent},
];

export const  routing = RouterModule.forRoot(routes);
