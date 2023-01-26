import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Exercice } from 'src/app/models/exercice/exercice';
import { Muscle } from 'src/app/models/muscle/muscle';
import { ExerciceService } from 'src/app/services/exercice/exercice.service';
import { MuscleService } from 'src/app/services/muscle/muscle.service';

@Component({
  selector: 'app-planning',
  templateUrl: './planning.component.html',
  styleUrls: ['./planning.component.css']
})
export class PlanningComponent implements OnInit {

  declare muscles : Muscle[];
  declare exercices : Exercice[];


  constructor(
    private muscleService : MuscleService,
    private exerciceService : ExerciceService,
    private router: Router,


  ){

  }


  ngOnInit() {
    this.getMuscles();
    this.getExercices();
  }
  getExercices() {
    this.exerciceService.findAllExercices().subscribe(
      data => {
        console.log(data);
        this.exercices = data as any []

      }
    )

  }
  getMuscles() {
    this.muscleService.findAllMuscles().subscribe(
      data => {
        console.log(data);
        this.muscles = data as any []

      }
    )

  }



}
