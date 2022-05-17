import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsuarioModule } from './usuario/usuario.module';
import { VacinacaoModule } from './vacinacao/vacinacao.module';
import { VacinasModule } from './vacinas/vacinas.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    VacinasModule,
    UsuarioModule,
    VacinacaoModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
