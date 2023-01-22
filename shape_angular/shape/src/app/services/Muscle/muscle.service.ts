import { Muscle } from './../../models/Muscle/muscle';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MuscleService {

  constructor(private http:HttpClient) { }


  findAllMuscles(){
    return this.http.get(AppSettings.APP_URL+"/muscles")
  }

  saveMuscle(Muscle:Muscle){
    return this.http.post(AppSettings.APP_URL+"/muscles", Muscle)

  }
}
