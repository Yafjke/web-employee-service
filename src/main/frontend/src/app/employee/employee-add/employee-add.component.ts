import { Component, OnInit } from '@angular/core';
import {EmployeeService} from "../employee.service";
import {Employee} from "../employee.model";

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeesAddComponent implements OnInit {

    employee: Employee = new Employee("","","","","");

    addEmployeeValue: string = null;

    constructor(private employeeService: EmployeeService) {

    }
  ngOnInit() {
  }

  createEmployee(): void {
    this.employeeService.addEmployee(this.employee)
        .subscribe( data => {
          alert("Сотрудник добавлен.");
        });
  }
}
