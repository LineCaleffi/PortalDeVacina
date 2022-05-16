import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsuarioListarComponent } from './usuario/usuario-listar/usuario-listar.component';
import { ListarComponent } from './vacinas/listar/listar.component';

const routes: Routes = [
  {path: 'series', component: ListarComponent},
  {path: 'vacinas', component: ListarComponent},
  {path:'usuarios', component: UsuarioListarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
