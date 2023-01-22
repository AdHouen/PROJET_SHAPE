import { AbonnementService } from './../../services/Abonnement/abonnement.service';
import { Abonnement } from './../../models/Abonnement/abonnement';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-abonnement',
  templateUrl: './abonnement.component.html',
  styleUrls: ['./abonnement.component.css']
})
export class AbonnementComponent implements OnInit {

  declare abonnements : any[];

  constructor(
    private AbonnementService : AbonnementService,
    private router : Router
  ){

  }
  ngOnInit(): void {
    this.getAbonnements();
  }
  getAbonnements() {
    this.AbonnementService.findAllAbonnments().subscribe(
      data => {
        console.log(data);
        this.abonnements = data as any[];
      }
    )
  }



}
