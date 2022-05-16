import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { VacinasService } from '../vacinasservice';

@Component({
  selector: 'app-form-vacina',
  templateUrl: './form-vacina.component.html',
  styleUrls: ['./form-vacina.component.scss']
})
export class FormVacinasComponent implements OnInit {
  meuForm : FormGroup = new FormGroup({});
  // para saber se é edição
  isEdicao : boolean = false;

  // id de quem estou alterando
  id : number = -1;
  constructor(private formBuilder : FormBuilder, private vacinaService : VacinasService,
    private router : Router, private activatedRouter : ActivatedRoute ) { }

  ngOnInit(): void {
    this.meuForm=this.formBuilder.group({
      nome:[null, [Validators.required] ],
      fabricante:[null, [Validators.required] ],
      qntDoses:[null, [Validators.required]],
      intervalo:[null, [Validators.required]]
    });
    this.activatedRouter.params.subscribe((parametros : any)=>{
      console.log(parametros);
      if(parametros.id){
        console.log(`ediçao id ${parametros.id}`);
        this.isEdicao=true;
        this.id=parametros.id;

        this.vacinaService.getOne(parametros.id).subscribe(
          (dados)=>{
            console.log(dados);
            this.meuForm.patchValue(dados);
        })
      } else{
        console.log(`criação`);
        this.isEdicao=false;
      }
    });
  }

  onSubmit(){
    if(this.isEdicao == false){
      // é para salvar o registro
      this.vacinaService.save(this.meuForm.value)
        .subscribe(
          (data) => {
            console.log(data);
            // o navigate é para redirecionar para uma outra rota de interesse
            this.router.navigate(['/vacinas']);
          }
        );
    }
    // é alteração de algum registro
    else{
      this.vacinaService.update(this.id, this.meuForm.value)
      .subscribe(
        (data) => {
          console.log(data);
          // o navigate é para redirecionar para uma outra rota de interesse
          this.router.navigate(['/vacinas']);
        }
      );
    }
  }//fim onSubmit
}
