import { UtilisateurComponent } from './components/utilisateur/utilisateur.component';
import { ProgrammeComponent } from './components/programme/programme.component';
import { MuscleComponent } from './components/muscle/muscle.component';
import { MesureComponent } from './components/mesure/mesure.component';
import { MensurationComponent } from './components/mensuration/mensuration.component';
import { GallerieComponent } from './components/gallerie/gallerie.component';
import { ExercicePersoComponent } from './components/exercice-perso/exercice-perso.component';
import { ExerciceComponent } from './components/exercice/exercice.component';
import { EntrainementComponent } from './components/entrainement/entrainement.component';
import { AbonnementComponent } from './components/abonnement/abonnement.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
  path:"abonnment",
  component:AbonnementComponent
},{
  path:"entrainement",
  component:EntrainementComponent
},{
  path:"exercice",
  component:ExerciceComponent
},{
  path:"exercice-perso",
  component:ExercicePersoComponent
},{
  path:"gallerie",
  component:GallerieComponent
},{
  path:"mensuration",
  component:MensurationComponent
},{
  path:"mesure",
  component:MesureComponent
},{
  path:"muscle",
  component:MuscleComponent
},{
  path:"programme",
  component:ProgrammeComponent
},{
  path:"utilisateur",
  component:UtilisateurComponent
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
