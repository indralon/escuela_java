import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import { HEROES } from './model/array-heros';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HeroRestService {

  urlApiRest = 'http://localhost:8084/CRUD_Vista_JSTL/api/heroes';
  httpOptions = {
     headers: new HttpHeaders({'Content-Type': 'application/json'})
    };

  constructor(private httpCli: HttpClient) {
   }

  getHeroes(): Observable<Hero[]> {
    return this.httpCli.get<Hero[]>(this.urlApiRest);
  }

  addHeroe(newHero: Hero): Observable<Hero> {
    return this.httpCli.post<Hero>(this.urlApiRest, newHero, this.httpOptions);

  }
}
