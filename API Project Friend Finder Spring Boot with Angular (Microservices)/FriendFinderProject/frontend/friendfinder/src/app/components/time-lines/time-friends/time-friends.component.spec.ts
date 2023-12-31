import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeFriendsComponent } from './time-friends.component';

describe('TimeFriendsComponent', () => {
  let component: TimeFriendsComponent;
  let fixture: ComponentFixture<TimeFriendsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TimeFriendsComponent]
    });
    fixture = TestBed.createComponent(TimeFriendsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
