import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BmiCalculComponent } from './bmi-calcul.component';

describe('BmiCalculComponent', () => {
  let component: BmiCalculComponent;
  let fixture: ComponentFixture<BmiCalculComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BmiCalculComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BmiCalculComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
