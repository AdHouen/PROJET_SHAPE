import { Router } from '@angular/router';
import { EntrainementService } from './../../services/Entrainement/entrainement.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exercice',
  templateUrl: './exercice.component.html',
  styleUrls: ['./exercice.component.css']
})
export class ExerciceComponent implements OnInit{

  declare exercices : any[];

  constructor (
    private EntrainementService : EntrainementService,
    private router : Router
  ){

  }
  ngOnInit(): void {
    this.getExercices();

  }
  getExercices() {
    this.EntrainementService.findAllEntrainements().subscribe(
      data => {
        console.log(data);
        this.exercices = data as any[]

      }
    )
  }


}
