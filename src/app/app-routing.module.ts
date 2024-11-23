import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SigninrecruiterComponent } from './signinrecruiter/signinrecruiter.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BackgroundComponent } from './background/background.component';
import { SignincandidateComponent } from './signincandidate/signincandidate.component';
import { SignuprecruiterComponent } from './signuprecruiter/signuprecruiter.component';
import { SignupcandidateComponent } from './signupcandidate/signupcandidate.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
const routes: Routes = [{ path: 'loginRecruiter', component: SigninrecruiterComponent },
  { path: 'home', component: HomeComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'navbar', component: NavbarComponent },
{path: 'back', component : BackgroundComponent},
{path: 'loginCandidate', component : SignincandidateComponent},
{path: 'signupRecruiter', component : SignuprecruiterComponent},
{path: 'signupCandidate', component : SignupcandidateComponent},
{path: 'forgotPassword', component : ForgotpasswordComponent},];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
