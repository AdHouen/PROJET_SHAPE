import { MesureService } from './../../services/Mesure/mesure.service';
import { Router } from '@angular/router';

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mesure',
  templateUrl: './mesure.component.html',
  styleUrls: ['./mesure.component.css']
})
export class MesureComponent implements OnInit{

  declare mesures : any[];

  constructor (
    private MesureService : MesureService,
    private router : Router
  ){

  }

  ngOnInit(): void {
    this.getMensures();
  }
  getMensures() {
    this.MesureService.findAllMesures().subscribe(
      data => {
        console.log(data);
        this.mesures = data as any[];

      }
    )
  }

}
