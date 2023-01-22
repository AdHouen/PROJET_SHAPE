import { Programme } from './../../models/Programme/programme';
import { AppSettings } from './../../settings/app.settings';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProgrammeService {

  constructor(private http:HttpClient) { }


  findAllProgrammes(){
    return this.http.get(AppSettings.APP_URL+"/programmes")
  }

  saveProgramme(Programme:Programme){
    return this.http.post(AppSettings.APP_URL+"/programmes", Programme)

  }
}
