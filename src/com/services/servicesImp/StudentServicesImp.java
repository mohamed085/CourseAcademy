package com.services.servicesImp;

import com.DAO.StudentDAO;
import com.model.Student;
import com.services.StudentServices;

import java.util.List;

public class StudentServicesImp implements StudentServices {

    private StudentDAO studentDAO;

    @Override
    public List<Student> getAll() {
        studentDAO = new StudentDAO();
        return studentDAO.getAll();
    }

    @Override
    public Student getById(Integer id) {
        studentDAO = new StudentDAO();
        return new Student();
    }

    @Override
    public Student getByName() {
        studentDAO = new StudentDAO();
        return new Student();
    }

    @Override
    public void add(Student student) {
        studentDAO = new StudentDAO();
        studentDAO.add(student);
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void update(Student student) {

    }

}
