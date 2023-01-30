import { AddProgrammeComponent } from './components/add-programme/add-programme.component';
import { PlanningComponent } from './components/planning/planning.component';
import { ChoseUsComponent } from './components/chose-us/chose-us.component';
import { AccueilComponent } from './components/accueil/accueil.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path:'accueil',
    component: AccueilComponent

  },{
  path:'chooseUs',
    component: ChoseUsComponent
  },{
  path:'planning',
    component:PlanningComponent
  },{
    path:'programme',
    component:AddProgrammeComponent
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
