import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { GetLandingImage } from './landing-image/landing-image-generator';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  public landingImg: string = "";
  
  ngOnInit(): void {
    const landing = GetLandingImage();
    this.landingImg = landing.landingImgPath;
  }
}
