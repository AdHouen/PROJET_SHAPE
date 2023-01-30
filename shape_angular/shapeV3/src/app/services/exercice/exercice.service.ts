import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AppSettings } from 'src/app/setting/app.setting';
import { Exercice } from 'src/app/models/exercice/exercice';

@Injectable({
  providedIn: 'root'
})
export class ExerciceService {
  findExerciceeById(listMuscle: any) {
    throw new Error('Method not implemented.');
  }
  httpOptions = {
    headers : new HttpHeaders ({'Content-Type' :'application/json'})
  }

  constructor(private http:HttpClient) { }

  findAllExercices(){
    return this.http.get(AppSettings.APP_URL+"/exercices")
  }

  findExerciceById(id_exercice:number) {
    return this.http.get(AppSettings.APP_URL+"/exercices/"+id_exercice)
  }

  saveExercice(exercice:Exercice){
    return this.http.post(AppSettings.APP_URL+"/exercices", JSON.stringify(exercice),this.httpOptions);

  }


  editExercice(id_exercice:number) {
    return this.http.get(AppSettings.APP_URL+"/exercices/"+id_exercice)

  }

  updateExercice(exercice:Exercice){
    return this.http.put(AppSettings.APP_URL+"/exercices", JSON.stringify(exercice),this.httpOptions);
  }

  deleteExercice(id_exercice : number){
    return this.http.delete(AppSettings.APP_URL+"/exercices/"+id_exercice)

  }


}

