import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormdireccionComponent } from './formdireccion.component';

describe('FormdireccionComponent', () => {
  let component: FormdireccionComponent;
  let fixture: ComponentFixture<FormdireccionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormdireccionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormdireccionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
