import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListarComponent } from './listar/listar.component';

import { HttpClientModule } from '@angular/common/http';
import { VacinasRoutingModule } from './vacinas-routing.module';
import { FormVacinasComponent } from './form-vacina/form-vacina.component';
import { SharedModule } from '../shared/shared.module';


@NgModule({
  declarations: [
    ListarComponent,
    FormVacinasComponent
    ],
  imports: [
    CommonModule,
    HttpClientModule,
    VacinasRoutingModule,
    SharedModule
  ],
  exports:[
    ListarComponent
  ]
})
export class VacinasModule { }
