import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class VacinasService {

  constructor(private httpClient: HttpClient) { }

  getAll(){
    return this.httpClient.get('http://localhost:8080/vacinas');
  }

  getOne(id: number){
    return this.httpClient.get(`http://localhost:8080/vacinas/${id}`);
  }

  save(obj: VacinasService){
    return this.httpClient.post('http://localhost:8080/vacinas', obj);
  }

  update(id : number, obj : VacinasService){
    return this.httpClient.patch(`http://localhost:8080/vacinas/${id}`, obj);
  }

  delete(id:number){
    return this.httpClient.delete(`http://localhost:8080/vacinas/${id}`);
  }
}
