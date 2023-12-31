import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeLinesComponent } from './time-lines.component';

describe('TimeLinesComponent', () => {
  let component: TimeLinesComponent;
  let fixture: ComponentFixture<TimeLinesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TimeLinesComponent]
    });
    fixture = TestBed.createComponent(TimeLinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
