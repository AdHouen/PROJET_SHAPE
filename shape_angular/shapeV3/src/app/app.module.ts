import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccueilComponent } from './components/accueil/accueil.component';
import { ChoseUsComponent } from './components/chose-us/chose-us.component';
import { PlanningComponent } from './components/planning/planning.component';
import { AddProgrammeComponent } from './components/add-programme/add-programme.component';


@NgModule({
  declarations: [
    AppComponent,
    AccueilComponent,
    ChoseUsComponent,
    PlanningComponent,
    AddProgrammeComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
