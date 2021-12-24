import { Component, OnInit } from '@angular/core';
import { BeersService } from './beers.service';

@Component({
  selector: 'app-beers',
  templateUrl: './beers.component.html',
  styleUrls: ['./beers.component.css']
})
export class BeersComponent implements OnInit {
  public beerList : any [];
  public requestError: any;

  constructor(private beers: BeersService) { 
    this.beerList = [beers.get(1,20)];
  }

  ngOnInit(): void {
    this.getBeers();
  }

  public getBeers(){
    return this.beers.get(1,20).subscribe({ 
      next:value => this.handleResponse(value),
      error: e => this.handleError(e),
      complete: () => console.log('DONE') 
    }
    );
  }

  protected handleResponse(response: any){
    this.requestError = null;
    return this.beerList = response;
  }

  protected handleError(error: any) {
    return this.requestError = error;
  }

}
