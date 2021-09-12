package com.services;

import com.model.Student;

import java.util.List;

public interface StudentServices extends CRUDServices<Student, Integer> {

    public Student getByName();

}
