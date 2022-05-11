import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CitadeinscripcionComponent } from './citadeinscripcion.component';

describe('CitadeinscripcionComponent', () => {
  let component: CitadeinscripcionComponent;
  let fixture: ComponentFixture<CitadeinscripcionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CitadeinscripcionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CitadeinscripcionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
