import { Router } from '@angular/router';
import { EntrainementService } from './../../services/Entrainement/entrainement.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-entrainement',
  templateUrl: './entrainement.component.html',
  styleUrls: ['./entrainement.component.css']
})
export class EntrainementComponent implements OnInit {

  declare entrainements : any[];

  constructor (
    private EntrainementService : EntrainementService,
    private router : Router
  ){

  }

  ngOnInit(): void {
    this.getEntrainements();

  }
  getEntrainements() {
    this.EntrainementService.findAllEntrainements().subscribe(
      data => {
        console.log(data);
        this.entrainements = data as any [];

      }
    )
  }


}
