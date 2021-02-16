package com.webemployeeservice.app.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name  = "employee")
public class Employee {
    @Id @Column(name = "idemployee", nullable = false, unique = true) @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEmployee;
    @Column(name = "employeename", nullable = false)
    private String EmployeeName;
    @Column(name = "employeeposition", nullable = false)
    private String EmployeePosition;
    @Column(name = "company", nullable = false)
    private String Company;
    @Column(name = "employeephonenumber", nullable = false)
    private String EmployeePhoneNumber;
    @Column(name = "employeemail", nullable = false)
    private String EmployeeMail;

    //??????
    public Employee() {
    }
}
