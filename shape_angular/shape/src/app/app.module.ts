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
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { ContactComponent } from './components/contact/contact.component';
import { BmiCalculComponent } from './components/bmi-calcul/bmi-calcul.component';
import { SearchComponent } from './components/search/search.component';
import { CarouselComponent } from './components/carousel/carousel.component';
import { ChooseUsComponent } from './components/choose-us/choose-us.component';
import { GetInTouchComponent } from './components/get-in-touch/get-in-touch.component';
import { GalleryComponent } from './components/gallery/gallery.component';




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
    HeaderComponent,
    FooterComponent,
    ContactComponent,
    BmiCalculComponent,
    SearchComponent,
    CarouselComponent,
    ChooseUsComponent,
    GetInTouchComponent,
    GalleryComponent,



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
