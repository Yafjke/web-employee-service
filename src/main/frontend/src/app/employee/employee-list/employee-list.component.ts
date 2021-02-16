import {Component, OnInit} from "@angular/core";
import {Response} from "@angular/http";

import {Employee} from "../employee.model";
import {EmployeeService} from "../employee.service";

@Component({
    selector: 'app-employee-list',
    templateUrl: './employee-list.component.html',
    styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

    employees: Employee[] = [];

    constructor(private employeeService: EmployeeService) { }

    ngOnInit() {
    this.employeeService.refreshNeeded$.subscribe(() => {this.getAllEmployees();});
    this.getAllEmployees();
    }
    private getAllEmployees(){
        this.employeeService.getEmployees().subscribe((employees:any[]) => {this.employees=employees;});
        }
}
