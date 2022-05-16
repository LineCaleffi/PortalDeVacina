import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private httpClient: HttpClient) { }

  getAll(){
    return this.httpClient.get('http://localhost:8080/usuarios');
  }

  getOne(id: number){
    return this.httpClient.get(`http://localhost:8080/usuarios/${id}`);
  }

  save(obj: UsuarioService){
    return this.httpClient.post('http://localhost:8080/usuarios', obj);
  }

  update(id : number, obj : UsuarioService){
    return this.httpClient.patch(`http://localhost:8080/usuarios/${id}`, obj);
  }

  delete(id:number){
    return this.httpClient.delete(`http://localhost:8080/usuarios/${id}`);
  }
}
