import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExercicePersoComponent } from './exercice-perso.component';

describe('ExercicePersoComponent', () => {
  let component: ExercicePersoComponent;
  let fixture: ComponentFixture<ExercicePersoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExercicePersoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExercicePersoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
