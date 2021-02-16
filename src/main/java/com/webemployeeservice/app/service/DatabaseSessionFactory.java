package com.webemployeeservice.app.service;

import com.interviewproject.app.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class DatabaseSessionFactory {
    private static SessionFactory sessionFactory;

    public static SessionFactory buildSessionFactory(){
        if(sessionFactory == null){
            Properties properties = DatabasePropertiesService.getDataBaseProperties();
            Configuration configuration = new Configuration();
            configuration.setProperties(properties).addAnnotatedClass(Employee.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
    public SessionFactory getSessionFactory() {return sessionFactory;}
}
