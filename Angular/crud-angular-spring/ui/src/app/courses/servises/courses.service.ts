import { Injectable } from '@angular/core';
import {Course} from "../model/course";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CoursesService {
  constructor(private httpClient: HttpClient) {
  }

  finfAll(): Course[]{
    return [
      {_id: '1', name: 'Angular', category: 'Framework'},
      {_id: '2', name: 'Java', category: 'Linguagem de programação'}
    ];
  }
}
