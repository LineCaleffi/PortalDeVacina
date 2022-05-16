import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListarVacinacaoComponent } from './listar-vacinacao/listar-vacinacao.component';



@NgModule({
  declarations: [
    ListarVacinacaoComponent
  ],
  imports: [
    CommonModule,
    VacinacaoModule
  ],
  exports:[
    ListarVacinacaoComponent
  ]
})
export class VacinacaoModule { }
