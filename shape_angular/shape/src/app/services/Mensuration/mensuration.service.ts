import { Mensuration } from './../../models/Mensuration/mensuration';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MensurationService {

  constructor(private http:HttpClient) { }


  findAllMensurations(){
    return this.http.get(AppSettings.APP_URL+"/mensurations")
  }

  saveMensurations(Mensuration:Mensuration){
    return this.http.post(AppSettings.APP_URL+"/mensurations", Mensuration)

  }
}
