import { HttpClient,HttpHeaders,HttpErrorResponse } from '@angular/common/http';
import { Observable , throwError } from 'rxjs';
import { Injectable } from '@angular/core';
import { catchError} from 'rxjs/operators';





@Injectable({
  providedIn: 'root'
})
export class BeersService {
  private url = 'https://api.punkapi.com/v2/beers?';


  constructor(private http : HttpClient) { }

  get (page : number, per_page:number){
    return this.http.get(this.url + 'page=' + page + '&per_page=' + per_page)
    .pipe(catchError(error => this.handleError(error)));
  }

  private handleError(error: HttpErrorResponse){
    console.log(error);
  return throwError (`An error occured - Error code : ${error.status}`); 
  }
}
