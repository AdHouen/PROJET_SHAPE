import { Utilisateur } from './../../models/Utilisateur/utilisateur';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  constructor(private http:HttpClient) { }


  findAllUtilisateurs(){
    return this.http.get(AppSettings.APP_URL+"/utilisateurs")
  }

  saveUtilisateur(Utilisateur:Utilisateur){
    return this.http.post(AppSettings.APP_URL+"/utilisateurs", Utilisateur)

  }
}
