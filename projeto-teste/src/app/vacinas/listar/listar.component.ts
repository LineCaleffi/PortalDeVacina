import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { VacinasService } from '../vacinas.service';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.scss']
})
export class ListarComponent implements OnInit {

  vacinas : any =[];
  constructor(private activatedRoute: ActivatedRoute, private vacinaService : VacinasService) {
    // this.activatedRoute = new ActivatedRoute();
   }

   ngOnInit(): void {
    this.getAll();

    this.activatedRoute.params.subscribe((data)=>{
      console.log(data);
    });
  }

  private getAll(){
    this.vacinaService.getAll().subscribe((data)=>{
      console.log(data);
      this.vacinas = data;
    });
  }

  onDelete(id:number){
    this.vacinaService.delete(id).subscribe(()=>{
      console.log(`deletou registro com id ${id}`);
      this.getAll();
    })
  }

}
