import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { MiControlComponent } from './mi-control/mi-control.component';
import { HerosListComponent } from './heros-list/heros-list.component';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';
import { MessagesComponent } from './messages/messages.component';
import { AddHeroComponent } from './add-hero/add-hero.component';
import { AppRoutingModule } from './app-routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HeroRestComponent } from './hero-rest/hero-rest.component';

@NgModule({
  declarations: [
    AppComponent,
    MiControlComponent,
    HerosListComponent,
    HeroDetailComponent,
    MessagesComponent,
    AddHeroComponent,
    DashboardComponent,
    AddHeroComponent,
    HeroRestComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
