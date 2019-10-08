import { Component, OnInit } from '@angular/core';
import { Hero } from '../model/hero';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-heros-list',
  templateUrl: './heros-list.component.html',
  styleUrls: ['./heros-list.component.css']
})
export class HerosListComponent implements OnInit {

  heroes: Hero[];
  selectedHero: Hero;

  constructor(private heroSrv: HeroService) { }

  ngOnInit() {
    // this.heroes = HEROES;
    this.getHeroesFromSrv();
  }

  onSelect(hero: Hero): void {
    this.selectedHero = hero;
  }

  getHeroesFromSrv(): void {
    this.heroes = this.heroSrv.getHeroes();
  }

}
