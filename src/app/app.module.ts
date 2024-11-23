import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {NgOptimizedImage} from "@angular/common";
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';

import { BackgroundComponent } from './background/background.component';
import { SigninrecruiterComponent } from './signinrecruiter/signinrecruiter.component';
import { SignincandidateComponent } from './signincandidate/signincandidate.component';
import { SignuprecruiterComponent } from './signuprecruiter/signuprecruiter.component';
import { SignupcandidateComponent } from './signupcandidate/signupcandidate.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    BackgroundComponent,
    SigninrecruiterComponent,
    SignincandidateComponent,
    SignuprecruiterComponent,
    SignupcandidateComponent,
    ForgotpasswordComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        NgOptimizedImage
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
