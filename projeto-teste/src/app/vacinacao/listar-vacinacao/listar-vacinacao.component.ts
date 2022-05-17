import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { VacinacaoService } from '../vacinacao.service';

@Component({
  selector: 'app-listar-vacinacao',
  templateUrl: './listar-vacinacao.component.html',
  styleUrls: ['./listar-vacinacao.component.scss']
})
export class ListarVacinacaoComponent implements OnInit {
  vacinacao : any =[];
  constructor(private activatedRoute: ActivatedRoute, private vacinacaoService : VacinacaoService) {
    // this.activatedRoute = new ActivatedRoute();
   }

   ngOnInit(): void {
    this.getAll();

    this.activatedRoute.params.subscribe((data)=>{
      console.log(data);
    });
  }

  private getAll(){
    this.vacinacaoService.getAll().subscribe((data)=>{
      console.log(data);
      this.vacinacao = data;
    });
  }

}
