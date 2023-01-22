import { Router } from '@angular/router';
import { MuscleService } from './../../services/Muscle/muscle.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-muscle',
  templateUrl: './muscle.component.html',
  styleUrls: ['./muscle.component.css']
})
export class MuscleComponent implements OnInit {

  declare muscles : any[];

  constructor (
    private MuscleService : MuscleService,
    private router : Router
  ){

  }
  ngOnInit(): void {
    this.getMuscles();
  }
  getMuscles() {
    this.MuscleService.findAllMuscles().subscribe(
      data => {
        console.log(data);
        this.muscles = data as any[];

      }
    )
  }

}
