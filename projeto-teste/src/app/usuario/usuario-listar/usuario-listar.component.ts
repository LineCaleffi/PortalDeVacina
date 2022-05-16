import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UsuarioService } from '../usuario.service';

@Component({
  selector: 'app-usuario-listar',
  templateUrl: './usuario-listar.component.html',
  styleUrls: ['./usuario-listar.component.scss']
})
export class UsuarioListarComponent implements OnInit {

  usuario : any =[];
  constructor(private activatedRoute: ActivatedRoute, private usuarioService : UsuarioService) {
    // this.activatedRoute = new ActivatedRoute();
   }

   ngOnInit(): void {
    this.getAll();

    this.activatedRoute.params.subscribe((data)=>{
      console.log(data);
    });
  }

  private getAll(){
    this.usuarioService.getAll().subscribe((data)=>{
      console.log(data);
      this.usuario = data;
    });
  }

  onDelete(id:number){
    this.usuarioService.delete(id).subscribe(()=>{
      console.log(`deletou registro com id ${id}`);
      this.getAll();
    })
  }


}
