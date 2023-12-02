import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeLineProfileComponent } from './time-line-profile.component';

describe('TimeLineProfileComponent', () => {
  let component: TimeLineProfileComponent;
  let fixture: ComponentFixture<TimeLineProfileComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TimeLineProfileComponent]
    });
    fixture = TestBed.createComponent(TimeLineProfileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
