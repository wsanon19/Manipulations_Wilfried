import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BeersModule } from './beers/beers.module';
import { HomeComponent } from './home/home.component';
import { BeersComponent } from './beers/beers.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BeersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BeersModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
