import { Component, OnInit } from '@angular/core';
import { Hero } from '../model/hero';

@Component({
  selector: 'app-mi-control',
  templateUrl: './mi-control.component.html',
  styleUrls: ['./mi-control.component.css']
})
export class MiControlComponent implements OnInit {

  static constIds: number = 0;

  propiedadHola = 'Ya hemos comío';

  constructor() {
    MiControlComponent.constIds++;
  }

  ngOnInit() {
  }

}
