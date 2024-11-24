import { Component } from '@angular/core';
import{Location} from '@angular/common';

@Component({
  selector: 'app-signuprecruiter',
  templateUrl: './signuprecruiter.component.html',
  styleUrl: './signuprecruiter.component.css'
})
export class SignuprecruiterComponent {
  constructor(private location: Location) {}
  goBack(): void {
    this.location.back(); // Retourne à la page précédente
  }
}
