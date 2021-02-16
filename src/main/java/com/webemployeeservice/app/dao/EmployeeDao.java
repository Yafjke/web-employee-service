package com.webemployeeservice.app.dao;

import com.webemployeeservice.app.model.Employee;
import com.webemployeeservice.app.service.DatabaseSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao implements DaoInterface<Employee> {

    @Override
    public List<Employee> returnAll() {
       List<Employee> employees = (List<Employee>) DatabaseSessionFactory.buildSessionFactory().openSession().createQuery("from Employee", Employee.class).list();
       return employees;
    }

    @Override
    public void save(Employee employee) {
        Session session = DatabaseSessionFactory.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
    }

    @Override
    public void update(Employee employee) {
        //not in use
    }

    @Override
    public void delete(Employee employee) {
        //not in use
        //no deleto bonito from database. Bad practice.
    }
}
