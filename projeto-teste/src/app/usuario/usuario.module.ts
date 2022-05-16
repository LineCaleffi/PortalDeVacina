import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioListarComponent } from './usuario-listar/usuario-listar.component';
import { UsuarioRoutingModule } from './usuario-routing.module';



@NgModule({
  declarations: [
    UsuarioListarComponent
  ],
  imports: [
    CommonModule,
    UsuarioRoutingModule
  ],
  exports:[
    UsuarioListarComponent
  ]
})
export class UsuarioModule { }
