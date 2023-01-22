import { ExercicePersoService } from './../../services/ExercicePerso/exercice-perso.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exercice-perso',
  templateUrl: './exercice-perso.component.html',
  styleUrls: ['./exercice-perso.component.css']
})
export class ExercicePersoComponent implements OnInit {

  declare exercicePersos : any[];

  constructor (
    private ExercicePersoService : ExercicePersoService,
    private router : Router
  ){

  }
  ngOnInit(): void {
    this.getExercicepersos();
  }
  getExercicepersos() {
    this.ExercicePersoService.findAllExercicePersos().subscribe(
    data => {
      console.log(data);
      this.exercicePersos = data as any [];

    }
    )
  }


}
