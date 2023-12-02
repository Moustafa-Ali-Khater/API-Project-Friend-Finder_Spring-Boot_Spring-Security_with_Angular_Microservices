import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeAlbumComponent } from './time-album.component';

describe('TimeAlbumComponent', () => {
  let component: TimeAlbumComponent;
  let fixture: ComponentFixture<TimeAlbumComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TimeAlbumComponent]
    });
    fixture = TestBed.createComponent(TimeAlbumComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
