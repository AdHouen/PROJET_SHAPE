import { Planning } from './../../models/planning/planning';
import { AppSettings } from './../../setting/app.setting';
import { Muscle } from './../../models/muscle/muscle';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlanningService {

  httpOptions = {
    headers : new HttpHeaders ({'Content-Type' :'application/json'})
  }

  constructor(private http:HttpClient) { }

  findAllPlannings(){
    return this.http.get(AppSettings.APP_URL+"/plannings")
  }

  savePlanning(planning:Planning){
    return this.http.post(AppSettings.APP_URL+"/plannings", JSON.stringify(planning),this.httpOptions);

  }

  editPlanning(id_programme:number) {
    return this.http.get(AppSettings.APP_URL+"/plannings/"+id_programme)

  }

  updatePlanning(planning:Planning){
    return this.http.put(AppSettings.APP_URL+"/plannings/" + planning.id_programme, JSON.stringify(planning),this.httpOptions);
    //return this.http.put(AppSettings.APP_URL+"/plannings", JSON.stringify(planning),this.httpOptions);
  }

  deletePlanning(id_programme : number){
    return this.http.delete(AppSettings.APP_URL+"/plannings/"+id_programme)

  }

}
