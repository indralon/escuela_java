import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import { HEROES } from './model/array-heros';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  allHeroes: Hero[];

  constructor(private messageService: MessageService) {
    this.allHeroes = HEROES.slice();
   }

  getHeroes(): Hero[] {
    this.messageService.add('HeroService: capturadno heroes');
    return this.allHeroes;
  }

  addHeroe(newHero: Hero): void {
    this.messageService.add('Añadido nuevo heroe: ' + newHero.name);
    this.allHeroes.push(newHero);
  }
}
