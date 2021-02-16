import {Response} from "@angular/http";
import { HttpClient} from '@angular/common/http';
import "rxjs/Rx";
import {Employee} from "./employee.model";
import {EventEmitter, Injectable} from "@angular/core";
import {Observable, Subject} from 'rxjs';
import {tap} from 'rxjs/operators';

@Injectable()
export class EmployeeService {


    constructor(private http: HttpClient) {}

    private _refreshNeeded$ = new Subject<void>();

    get refreshNeeded$(){
      return this._refreshNeeded$;
    }

    getEmployees(){
      return this.http.get<Employee[]>('/api');
     }
    addEmployee(employee: Employee) {
        return this.http.post<Employee>('/api', employee)
        .pipe(tap(() => {this._refreshNeeded$.next();}));
  }
}
