import { Component, OnInit } from '@angular/core';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { Hero } from '../model/hero';
import { HeroService } from '../hero.service';
import { HerosListComponent } from '../heros-list/heros-list.component';

@Component({
  selector: 'app-add-hero',
  templateUrl: './add-hero.component.html',
  styleUrls: ['./add-hero.component.css']
})
export class AddHeroComponent implements OnInit {

  addHeroForm;

  constructor(private formBuilder: FormBuilder, private heroSrv: HeroService) {
    this.addHeroForm = this.formBuilder.group({
      id: '',
      name: ''
    });
   }

  ngOnInit() {
  }

  onSubmit(heroData) {
    // Veamos la data
    let newHero: Hero = {
      id: heroData.id,
      name: heroData.name,
      imgSrc: ''
    };
    console.warn('Añadiendo este heroe: ', newHero);
    this.addHeroForm.reset();
    this.heroSrv.addHeroe(newHero);
  }
}
