import { Injectable } from '@angular/core';
import { listarcalif } from './kardex/kardex.interface';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RestService {
  //url:string= "http://localhost:8080/"

  constructor(private httpClient: HttpClient) { }

  public get(url:string):Observable<any>{
    return this.httpClient.get<any>(url);
  }

  /*getAllCal():Observable<listarcalif[]>{
    let calificaciones = this.url + "Materias/findAll";
    return this.httpClient.get<listarcalif[]>(calificaciones);
  }*/

  
}
