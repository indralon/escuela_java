import { Component, OnInit } from '@angular/core';
import { HeroRestService } from '../hero-rest.service';
import { Hero } from '../model/hero';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-hero-rest',
  template: `CLIENTE REST PARA HEROES <ul>
  <li *ngFor ="let hero of heroesRecibidos">
    {{ hero.id }} - {{ hero.name }}
  </li>
  </ul>
  <label>Id: </label><input type="number" [(ngModel)]="id"  id="id" name="id">
  <label>Name: </label><input type="text" [(ngModel)]="name" id="name" name="name">
  <input type="button" (click)="enviar()" value="ENVIAR"/>`,
  styleUrls: ['./hero-rest.component.css']
})
export class HeroRestComponent implements OnInit {

  heroesRecibidos: Hero[];
  id: string; name: string;
  constructor(private heroRestSrv: HeroRestService) { }

  ngOnInit() {
    this.heroRestSrv.getHeroes().subscribe(heroesRec => this.heroesRecibidos = heroesRec);
  }

  enviar() {
    let nuevoHeroe = new Hero();
    nuevoHeroe.id = parseInt(this.id);
    nuevoHeroe.name = this.name;
    this.heroRestSrv.addHeroe(nuevoHeroe).subscribe(
      obj => {
        this.ngOnInit();
      }
    );

  }

}
