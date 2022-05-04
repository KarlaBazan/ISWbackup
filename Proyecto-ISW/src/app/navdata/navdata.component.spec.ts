import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NavdataComponent } from './navdata.component';

describe('NavdataComponent', () => {
  let component: NavdataComponent;
  let fixture: ComponentFixture<NavdataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NavdataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NavdataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
