import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormdeportivosComponent } from './formdeportivos.component';

describe('FormdeportivosComponent', () => {
  let component: FormdeportivosComponent;
  let fixture: ComponentFixture<FormdeportivosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormdeportivosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormdeportivosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
