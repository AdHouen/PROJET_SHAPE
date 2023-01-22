import { Router } from '@angular/router';
import { GallerieService } from './../../services/Gallerie/gallerie.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gallerie',
  templateUrl: './gallerie.component.html',
  styleUrls: ['./gallerie.component.css']
})
export class GallerieComponent implements OnInit {

  declare galleries : any[];

  constructor(
    private GallerieService : GallerieService,
    private router : Router
  ){

  }
  ngOnInit(): void {
    this.getGalleries();
  }
  getGalleries() {
    this.GallerieService.findAllGalleries().subscribe(
      data => {
        console.log(data);
        this.galleries = data as any[];

      }
    )
  }

}
