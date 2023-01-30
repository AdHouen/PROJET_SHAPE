import { ProgrammeService } from './../../services/programme/programme.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-programme',
  templateUrl: './add-programme.component.html',
  styleUrls: ['./add-programme.component.css']
})
export class AddProgrammeComponent implements OnInit {
  declare form : FormGroup;
  

  constructor(
    private programmeService : ProgrammeService,
    private router : Router,
    private formBuilder : FormBuilder
  ){}


  ngOnInit(): void {
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
         this.router.navigate(["/programmes"])
      }
    )

  }

}
