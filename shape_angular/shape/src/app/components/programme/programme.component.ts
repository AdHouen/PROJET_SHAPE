import { Router } from '@angular/router';
import { ProgrammeService } from './../../services/Programme/programme.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-programme',
  templateUrl: './programme.component.html',
  styleUrls: ['./programme.component.css']
})
export class ProgrammeComponent implements OnInit {

  declare programmes : any[];

  constructor (
    private ProgrammeService : ProgrammeService,
    private router : Router
  ){

  }
  ngOnInit(): void {
    this.getProgrammes();
  }
  getProgrammes() {
    this.ProgrammeService.findAllProgrammes().subscribe(
      data => {
        console.log(data);
        this.programmes = data as any[];

      }
    )
  }

}
