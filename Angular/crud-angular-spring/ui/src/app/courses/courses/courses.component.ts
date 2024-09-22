import {Component, OnInit} from '@angular/core';
import {Course} from "../model/course";
import {CoursesService} from "../servises/courses.service";

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrl: './courses.component.scss'
})

export class CoursesComponent implements OnInit{
  courses: Course[] = [];

  displayedColumns: String[] = ['_id', 'name', 'category'];

  constructor(private coursesService: CoursesService) {

  }
  ngOnInit() {
    this.courses = this.coursesService.finfAll();
  }
}

