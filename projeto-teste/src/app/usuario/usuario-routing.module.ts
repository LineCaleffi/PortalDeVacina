import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormUsuarioComponent } from './form-usuario/form-usuario.component';
import { UsuarioListarComponent } from './usuario-listar/usuario-listar.component';

const routes: Routes = [
  {path: 'usuarios', component: UsuarioListarComponent},
  {path: 'usuarios/criar', component: FormUsuarioComponent},
  {path: 'usuarios/editar/:id', component: FormUsuarioComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class UsuarioRoutingModule { }
