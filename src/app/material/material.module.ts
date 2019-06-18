import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatCardModule, MatGridListModule, MatListModule} from '@angular/material';

@NgModule({
  imports: [CommonModule, MatCardModule, MatListModule, MatGridListModule],
  exports: [CommonModule, MatCardModule, MatListModule, MatGridListModule],
})
export class CustomMaterialModule {
}
