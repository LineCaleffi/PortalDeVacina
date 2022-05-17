import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class VacinacaoService {

  constructor(private httpClient:HttpClient) { }

  getAll(){
    return this.httpClient.get('http://localhost:8080/vacinacao');
  }

  getOne(id: number){
    return this.httpClient.get(`http://localhost:8080/vacinacao/${id}`);
  }
}
