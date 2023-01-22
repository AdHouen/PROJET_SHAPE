import { ExercicePerso } from './../../models/ExercicePerso/exercice-perso';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ExercicePersoService {

  constructor(private http:HttpClient) { }


  findAllExercicePersos(){
    return this.http.get(AppSettings.APP_URL+"/exercicePersos")
  }

  saveExercicePerso(ExercicePerso:ExercicePerso){
    return this.http.post(AppSettings.APP_URL+"/exercicePersos", ExercicePerso)

  }
}
