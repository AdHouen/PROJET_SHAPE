import { Entrainement } from './../../models/Entrainement/entrainement';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EntrainementService {

  constructor(private http:HttpClient) { }


  findAllEntrainements(){
    return this.http.get(AppSettings.APP_URL+"/entrainements")
  }

  saveEntrainement(Entrainement:Entrainement){
    return this.http.post(AppSettings.APP_URL+"/entrainements", Entrainement)

  }
}
