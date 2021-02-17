package com.webemployeeservice.app.service;

import com.webemployeeservice.app.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
@Scope("prototype")
public class DatabaseSessionFactory {
    private static SessionFactory sessionFactory;

    public static SessionFactory buildSessionFactory() {
        if (sessionFactory == null) {
            Properties properties = DatabasePropertiesService.getDataBaseProperties();
            Configuration configuration = new Configuration();
            configuration.setProperties(properties).addAnnotatedClass(Employee.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
