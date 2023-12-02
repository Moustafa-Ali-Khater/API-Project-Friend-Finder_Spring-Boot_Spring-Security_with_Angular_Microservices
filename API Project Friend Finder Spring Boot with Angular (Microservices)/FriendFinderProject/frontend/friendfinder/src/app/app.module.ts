import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserhomeComponent } from './components/userhome/userhome.component';
import { TimeLinesComponent } from './components/time-lines/time-lines.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { ContactComponent } from './components/contact/contact.component';
import { TimeAboutComponent } from './components/time-lines/time-about/time-about.component';
import { TimeAlbumComponent } from './components/time-lines/time-album/time-album.component';
import { TimeFriendsComponent } from './components/time-lines/time-friends/time-friends.component';
import { TimeLineComponent } from './components/time-lines/time-line/time-line.component';
import { TimeLineDetailesComponent } from './components/time-lines/time-line-detailes/time-line-detailes.component';
import { TimeLineProfileComponent } from './components/time-lines/time-line-profile/time-line-profile.component';
import { CoolImagesComponent } from './components/userhome/cool-images/cool-images.component';
import { FriendsComponent } from './components/userhome/friends/friends.component';
import { LeftBarComponent } from './components/userhome/left-bar/left-bar.component';
import { MainPageComponent } from './components/userhome/main-page/main-page.component';
import { PublishComponent } from './components/userhome/publish/publish.component';
import { RightBarComponent } from './components/userhome/right-bar/right-bar.component';
import {RouterModule, RouterOutlet, Routes} from "@angular/router";


const routes:Routes = [
  {path: 'mainpage',component: MainPageComponent},
  {path: 'contact',component: ContactComponent},
  {path: 'timeline',component: TimeLineComponent},
  {path: 'time-line-about',component: TimeAboutComponent},
  {path: 'time-line-friends',component: TimeFriendsComponent},
  {path: 'time-line-album',component: TimeAlbumComponent},
  {path: '',component: MainPageComponent},
  {path: '**',component: MainPageComponent},
  {path: 'timeline',component: TimeLineComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    UserhomeComponent,
    TimeLinesComponent,
    SignUpComponent,
    HeaderComponent,
    FooterComponent,
    ContactComponent,
    TimeAboutComponent,
    TimeAlbumComponent,
    TimeFriendsComponent,
    TimeLineComponent,
    TimeLineDetailesComponent,
    TimeLineProfileComponent,
    CoolImagesComponent,
    FriendsComponent,
    LeftBarComponent,
    MainPageComponent,
    PublishComponent,
    RightBarComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
