package com.webemployeeservice.app.controller;

import com.webemployeeservice.app.model.Employee;
import com.webemployeeservice.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService;

    @GetMapping()
    public List<Employee> GetEmployees(){
        return EmployeeService.returnAllEmployees();
    }
    @PostMapping()
    public void SendEmployee(@RequestBody Employee employee){
        EmployeeService.saveEmployee(employee);
    }
}
