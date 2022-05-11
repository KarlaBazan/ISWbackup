import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SolidictamenComponent } from './solidictamen.component';

describe('SolidictamenComponent', () => {
  let component: SolidictamenComponent;
  let fixture: ComponentFixture<SolidictamenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SolidictamenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SolidictamenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
