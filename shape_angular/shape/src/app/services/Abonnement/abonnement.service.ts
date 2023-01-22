import { Abonnement } from './../../models/Abonnement/abonnement';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AppSettings } from 'src/app/settings/app.settings';

@Injectable({
  providedIn: 'root'
})
export class AbonnementService {

  constructor(private http:HttpClient) { }


  findAllAbonnments(){
    return this.http.get(AppSettings.APP_URL+"/abonnements")
  }

  saveAbonnment(Abonnement:Abonnement){
    return this.http.post(AppSettings.APP_URL+"/abonnements", Abonnement)

  }
}
