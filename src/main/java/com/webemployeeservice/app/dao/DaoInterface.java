package com.webemployeeservice.app.dao;

import java.util.List;

public interface DaoInterface<T> {
     List<T> returnAll();

     void save(T t);

     void update(T t);

     void delete(T t);
}
