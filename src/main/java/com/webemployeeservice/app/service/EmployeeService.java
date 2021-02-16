package com.webemployeeservice.app.service;

import com.webemployeeservice.app.dao.EmployeeDao;
import com.webemployeeservice.app.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> returnAllEmployees(){
        return employeeDao.returnAll();
    }

    public void saveEmployee(Employee employee){
        employeeDao.save(employee);
    }
}
