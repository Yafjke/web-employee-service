package com.webemployeeservice.app.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Data
@AllArgsConstructor
@Table(name  = "employee")
public class Employee {
    @Id @Column(name = "idemployee", nullable = false, unique = true) @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEmployee;
    @Column(name = "employeename", nullable = false)
    @Pattern(regexp = "[А-ЯЁа-яё]+")
    private String EmployeeName;
    @Column(name = "employeeposition", nullable = false)
    @Pattern(regexp = "[А-ЯЁа-яё]+")
    private String EmployeePosition;
    @Column(name = "company", nullable = false)
    @Pattern(regexp = "[A-Za-zА-ЯЁа-яё]+")
    private String EmployeeCompany;
    @Column(name = "employeephonenumber", nullable = false)
    @Pattern(regexp = "[7,8]\\d{10}")
    private String EmployeePhoneNumber;
    @Column(name = "employeemail", nullable = false)
    @Pattern(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}")
    private String EmployeeMail;

    //??????
    public Employee() {
    }
}
