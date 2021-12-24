import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { BeersComponent } from './beers/beers.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: 'home',component: HomeComponent},
  { path: 'beers', component: BeersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
