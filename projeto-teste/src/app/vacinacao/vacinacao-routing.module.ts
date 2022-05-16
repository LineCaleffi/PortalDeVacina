import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarVacinacaoComponent } from './listar-vacinacao/listar-vacinacao.component';
//import { FormVacinasComponent } from './form-vacina/form-vacina.component';

const routes: Routes = [
  {path: 'vacinacao', component: ListarVacinacaoComponent},
 // {path: 'vacinacao/criar', component: FormVacinasComponent},
 // {path: 'vacinacao/editar/:id', component: FormVacinasComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class VacinasRoutingModule { }
