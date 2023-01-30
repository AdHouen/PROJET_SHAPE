import { ProgrammeService } from './../../services/programme/programme.service';
import { FormBuilder, Validators, FormGroup, ReactiveFormsModule} from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
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

  declare form : FormGroup;
  declare muscles : Muscle[];
  declare exercices : Exercice[];
  listMuscle : any;



  constructor(
    private muscleService : MuscleService,
    private exerciceService : ExerciceService,
    private programmeService: ProgrammeService,
    private router: Router,
    private formBuilder : FormBuilder,
    private route : ActivatedRoute,



  ){

  }


  ngOnInit() {
    this.getMuscles();
    this.getExercices();



    // this.getSelectedValue();

    this.form = this.formBuilder.group({
      // id_programme: ['', Validators.required],
      programme_poids: ['', Validators.required],
      programme_series: ['', Validators.required],
      programme_repetitions: ['', Validators.required],
      programme_pause: ['', Validators.required],
      programme_tempsSecondes: ['', Validators.required],
      programme_distance: ['', Validators.required],
      // id_entrainement: ['', Validators.required],

    })
    ;
  }

  create(){
    console.log(this.form.value);
    this.programmeService.saveProgramme(this.form.value).subscribe(
      () =>{
         this.router.navigate(["/planning"])
      }
    )

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
      );
      // if (this.route.snapshot.paramMap.get('id_muscle') != null) {
      //   this.remove();

    }
    onChange(value: any) {
      this.listMuscle = value.target.value;
      console.log(this.listMuscle);
      this.getMuscleById(this.listMuscle);
    }

    getMuscleById(param:any){
      this.muscleService.findMuscleById(this.listMuscle).subscribe(
        data2 => {
          console.log(data2);

        }
        );

    }
    getExerciceById(param:any){
      this.exerciceService.findExerciceById(this.listMuscle).subscribe(
        data3 => {
          console.log(data3);

        }
        );

  };

  // remove() {
  //   const id_programme = Number(this.route.snapshot.paramMap.get('id_programme')) ;
  //   this.programmeService.deleteProgramme(id_programme).subscribe(
  //     () => {
  //       this.router.navigate(["/planning"])

  //     }

  //   )
  // }




// }

}

