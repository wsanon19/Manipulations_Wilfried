import { Component, OnInit } from '@angular/core';
import { catchError, map, Observable, of, startWith } from 'rxjs';
import { DataState } from './enum/data-state.enum';
import { AppState } from './interface/app-state';
import { CustomResponse } from './interface/custom-response';
import { CamionService } from './service/camion.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  appState$ : Observable<AppState<CustomResponse>>;
  readonly DataState = DataState;

  constructor(private camionService: CamionService) {
    this.appState$ = this.camionService.camions$.pipe(
      map(response => {
        return {dataState: DataState.LOADING_STATE}
      })
    );
  }
  
  
  ngOnInit() : void {
    this.appState$ = this.camionService.camions$
    .pipe(
      map(response => {
        return {dataState: DataState.LOADED_STATE, appData: response}
      }),
      startWith({dataState: DataState.LOADING_STATE}),
      catchError((error: string) => {
        return of ({dataState: DataState.ERROR_STATE, error})
      })
    );

  }
  // title = 'Camionapp';
}
