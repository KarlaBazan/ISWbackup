import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReccontraComponent } from './reccontra.component';

describe('ReccontraComponent', () => {
  let component: ReccontraComponent;
  let fixture: ComponentFixture<ReccontraComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReccontraComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReccontraComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
