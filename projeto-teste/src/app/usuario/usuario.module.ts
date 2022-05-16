import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioListarComponent } from './usuario-listar/usuario-listar.component';
import { UsuarioRoutingModule } from './usuario-routing.module';
import { FormUsuarioComponent } from './form-usuario/form-usuario.component';
import { HttpClientModule } from '@angular/common/http';
import { SharedModule } from '../shared/shared.module';



@NgModule({
  declarations: [
    UsuarioListarComponent,
    FormUsuarioComponent
  ],
  imports: [
    CommonModule,
    UsuarioRoutingModule,
    HttpClientModule,
    SharedModule
  ],
  exports:[
    UsuarioListarComponent
  ]
})
export class UsuarioModule { }
