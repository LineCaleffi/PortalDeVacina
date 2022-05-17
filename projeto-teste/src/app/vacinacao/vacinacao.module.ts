import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListarVacinacaoComponent } from './listar-vacinacao/listar-vacinacao.component';
import { HttpClientModule } from '@angular/common/http';
import { VacinacaoRoutingModule } from './vacinacao-routing.module';



@NgModule({
  declarations: [
    ListarVacinacaoComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    VacinacaoRoutingModule
  ],
  exports:[
    ListarVacinacaoComponent
  ]
})
export class VacinacaoModule { }
