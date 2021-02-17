package com.webemployeeservice.app.service;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Scope;

import java.util.Properties;

@Scope("singleton")
public class DatabasePropertiesService {
    private static String DB_USER = "h2user";
    private static String DB_PASS = "h2user";
    private static String DB_NAME = "Employee";
    private static String DB_DRIVER = "org.h2.Driver";
    private static String DB_URL = "jdbc:h2:./webemployeeservice";
    private static String DB_DIALECT = "org.hibernate.dialect.H2Dialect";

    public static Properties getDataBaseProperties() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, DB_DRIVER);
        properties.put(Environment.URL, DB_URL);
        properties.put(Environment.USER, DB_USER);
        properties.put(Environment.PASS, DB_PASS);
        properties.put(Environment.DIALECT, DB_DIALECT);
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        return properties;
    }
}
