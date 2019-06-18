import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CustomMaterialModule} from './material/material.module';
import {routing} from "./app-routing.module";
import {DeviceLogComponent} from "./device-log/device-log.component";
import {DevicesComponent} from "./devices/devices.component";

@NgModule({
    declarations: [
        AppComponent,
        DeviceLogComponent,
        DevicesComponent
    ],
    imports: [
        BrowserModule,
        routing,
        HttpClientModule,
        ReactiveFormsModule,
        BrowserAnimationsModule,
        CustomMaterialModule,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {

    constructor() {
    }
}

