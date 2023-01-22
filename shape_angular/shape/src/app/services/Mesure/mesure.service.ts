import { Mesure } from './../../models/Mesure/mesure';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MesureService {

  constructor(private http:HttpClient) { }


  findAllMesures(){
    return this.http.get(AppSettings.APP_URL+"/mesures")
  }

  saveMesure(Mesure:Mesure){
    return this.http.post(AppSettings.APP_URL+"/mesures", Mesure)

  }
}
