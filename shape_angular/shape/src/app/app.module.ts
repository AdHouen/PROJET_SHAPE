import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AbonnementComponent } from './components/abonnement/abonnement.component';
import { GallerieComponent } from './components/gallerie/gallerie.component';
import { UtilisateurComponent } from './components/utilisateur/utilisateur.component';
import { ExercicePersoComponent } from './components/exercice-perso/exercice-perso.component';
import { MesureComponent } from './components/mesure/mesure.component';
import { MensurationComponent } from './components/mensuration/mensuration.component';
import { EntrainementComponent } from './components/entrainement/entrainement.component';
import { ProgrammeComponent } from './components/programme/programme.component';
import { ExerciceComponent } from './components/exercice/exercice.component';
import { MuscleComponent } from './components/muscle/muscle.component';


@NgModule({
  declarations: [
    AppComponent,
    AbonnementComponent,
    GallerieComponent,
    UtilisateurComponent,
    ExercicePersoComponent,
    MesureComponent,
    MensurationComponent,
    EntrainementComponent,
    ProgrammeComponent,
    ExerciceComponent,
    MuscleComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
