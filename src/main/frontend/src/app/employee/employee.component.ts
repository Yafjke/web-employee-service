import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Employee} from './employee.model'

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor() { }

  ngOnInit() {

  }
}
