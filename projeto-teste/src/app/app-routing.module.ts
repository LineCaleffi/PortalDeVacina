import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsuarioListarComponent } from './usuario/usuario-listar/usuario-listar.component';
import { ListarVacinacaoComponent } from './vacinacao/listar-vacinacao/listar-vacinacao.component';
import { ListarComponent } from './vacinas/listar/listar.component';

const routes: Routes = [
  {path: 'vacinas', component: ListarComponent},
  {path:'usuarios', component: UsuarioListarComponent},
  {path:'vacinacao', component: ListarVacinacaoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
