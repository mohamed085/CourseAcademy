package com.DAO;

import com.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public static List<Student> students = new ArrayList<>();

    public List<Student> getAll() {

        return students;
    }

    public Student getById(Integer id) {

        return new Student();
    }

    public Student getByName() {

        return new Student();
    }

    public void add(Student student) {
        students.add(student);
    }
}
