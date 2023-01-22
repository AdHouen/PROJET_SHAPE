import { Router } from '@angular/router';
import { UtilisateurService } from './../../services/Utilisateur/utilisateur.service';

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {

  declare utilisateurs : any[];

  constructor(
    private UtilisateurService : UtilisateurService,
    private router : Router
  ) {

  }
  ngOnInit(): void {
    this.getUtilisateurs();
  }
  getUtilisateurs() {
    this.UtilisateurService.findAllUtilisateurs().subscribe(
      data => {
        console.log(data);
        this.utilisateurs = data as any[];

      }
    )
  }

}
