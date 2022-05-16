import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsuarioListarComponent } from './usuario-listar/usuario-listar.component';

const routes: Routes = [
  {path: 'usuarios', component: UsuarioListarComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class UsuarioRoutingModule { }
