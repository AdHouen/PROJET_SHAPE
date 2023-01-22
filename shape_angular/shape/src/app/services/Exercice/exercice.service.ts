import { Exercice } from './../../models/Exercice/exercice';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ExerciceService {

  constructor(private http:HttpClient) { }


  findAllExercices(){
    return this.http.get(AppSettings.APP_URL+"/exercices")
  }

  saveExercice(Exercice:Exercice){
    return this.http.post(AppSettings.APP_URL+"/exercices", Exercice)

  }
}
