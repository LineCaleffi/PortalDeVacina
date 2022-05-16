import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioListarComponent } from './usuario-listar/usuario-listar.component';
import { UsuarioRoutingModule } from './usuario-routing.module';
import { FormUsuarioComponent } from './form-usuario/form-usuario.component';



@NgModule({
  declarations: [
    UsuarioListarComponent,
    FormUsuarioComponent
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
