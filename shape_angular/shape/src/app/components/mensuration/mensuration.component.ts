import { Router } from '@angular/router';
import { MensurationService } from './../../services/Mensuration/mensuration.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mensuration',
  templateUrl: './mensuration.component.html',
  styleUrls: ['./mensuration.component.css']
})
export class MensurationComponent implements OnInit {

  declare mensurations : any [];

  constructor (
    private MensurationService : MensurationService,
    private router : Router
  ){

  }
  ngOnInit(): void {
    this.getMensurations();
  }
  getMensurations() {
   this.MensurationService.findAllMensurations().subscribe(
    data => {
      console.log(data);
      this.mensurations = data as any[];

    }
   )
  }


}
