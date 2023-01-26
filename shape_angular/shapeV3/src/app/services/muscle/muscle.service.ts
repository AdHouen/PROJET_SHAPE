import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AppSettings } from 'src/app/setting/app.setting';
import { Muscle } from 'src/app/models/muscle/muscle';


@Injectable({
  providedIn: 'root'
})
export class MuscleService {
  httpOptions = {
    headers : new HttpHeaders ({'Content-Type' :'application/json'})
  }

  constructor(private http:HttpClient) { }

  findAllMuscles(){
    return this.http.get(AppSettings.APP_URL+"/muscles")
  }

  saveMuscle(muscle:Muscle){
    return this.http.post(AppSettings.APP_URL+"/muscles", JSON.stringify(muscle),this.httpOptions);

  }

  editMuscle(id_muscle:number) {
    return this.http.get(AppSettings.APP_URL+"/muscles/"+id_muscle)

  }

  updateMuscle(muscle:Muscle){
    return this.http.put(AppSettings.APP_URL+"/muscles", JSON.stringify(muscle),this.httpOptions);
  }

  deleteMuscle(id_muscle : number){
    return this.http.delete(AppSettings.APP_URL+"/muscles/"+id_muscle)

  }

  
}

