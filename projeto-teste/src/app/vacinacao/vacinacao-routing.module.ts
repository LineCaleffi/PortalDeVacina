import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormVacinasComponent } from '../vacinas/form-vacina/form-vacina.component';
import { ListarComponent } from '../vacinas/listar/listar.component';

const routes: Routes = [
  {path: 'vacinas', component: ListarComponent},
  {path: 'vacinas/criar', component: FormVacinasComponent},
  {path: 'vacinas/editar/:id', component: FormVacinasComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class VacinacaoRoutingModule { }
