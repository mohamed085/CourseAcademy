package com.services;

import com.model.Student;

import java.util.List;

public interface CRUDServices<T, ID> {

    public List<T> getAll();

    public T getById(ID id);

    public void add(T t);

    public void delete(T t);

    public void update(T t);

}
