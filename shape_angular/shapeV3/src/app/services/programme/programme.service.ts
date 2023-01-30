import { AppSettings } from './../../setting/app.setting';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Programme } from 'src/app/models/programme/programme';

@Injectable({
  providedIn: 'root'
})
export class ProgrammeService {

  httpOptions = {
    headers : new HttpHeaders ({'Content-Type' :'application/json'})
  }

  constructor(private http:HttpClient) { }

  findAllProgrammes(){
    return this.http.get(AppSettings.APP_URL+"/programmes")
  }

  saveProgramme(programme:Programme){
    return this.http.post(AppSettings.APP_URL+"/programmes", JSON.stringify(programme),this.httpOptions);

  }

  editProgramme(id_programme:number) {
    return this.http.get(AppSettings.APP_URL+"/programmes/"+id_programme)

  }

  updateProgramme(programme:Programme){
    return this.http.put(AppSettings.APP_URL+"/programmes/" + programme.id_programme, JSON.stringify(programme),this.httpOptions);
    //return this.http.put(AppSettings.APP_URL+"/programmes", JSON.stringify(programme),this.httpOptions);
  }

  deleteProgramme(id_programme : number){
    return this.http.delete(AppSettings.APP_URL+"/programmes/"+id_programme)

  }
}
