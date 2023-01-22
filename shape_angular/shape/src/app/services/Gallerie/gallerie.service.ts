import { Gallerie } from './../../models/Gallerie/gallerie';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GallerieService {

  constructor(private http:HttpClient) { }


  findAllGalleries(){
    return this.http.get(AppSettings.APP_URL+"/galleries")
  }

  saveGallerie(Gallerie:Gallerie){
    return this.http.post(AppSettings.APP_URL+"/galleries", Gallerie)

  }
}
