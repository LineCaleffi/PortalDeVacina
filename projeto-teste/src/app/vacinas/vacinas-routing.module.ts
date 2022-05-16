import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormVacinasComponent } from './form-vacina/form-vacina.component';
import { ListarComponent } from './listar/listar.component';

const routes: Routes = [
  {path: 'vacina', component: ListarComponent},
  {path: 'vacina/criar', component: FormVacinasComponent},
  {path: 'vacina/editar/:id', component: FormVacinasComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class VacinasRoutingModule { }
