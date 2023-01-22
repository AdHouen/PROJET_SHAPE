import { TestBed } from '@angular/core/testing';

import { ExercicePersoService } from './exercice-perso.service';

describe('ExercicePersoService', () => {
  let service: ExercicePersoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExercicePersoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
