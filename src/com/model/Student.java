package com.model;

import java.util.List;

public class Student extends Person {

    private Department department;
    private List<Course> courses;

    public Student(int id, String name, int age, String address, Department department) {
        super(id, name, age, address);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
