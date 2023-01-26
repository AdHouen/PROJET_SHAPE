import { Muscle } from './../../models/muscle/muscle';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlanningService {

  httpOptions = {
    headers : new HttpHeaders ({'Content-Type' :'application/json'})
  }

  constructor(private http:HttpClient) {


   }

   getMuscle_Exercice(){
    return this.http.get<Muscle>('/muscles')
   }


}
