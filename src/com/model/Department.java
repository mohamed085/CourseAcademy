package com.model;

import java.util.List;

public class Department {

    private int id;
    private String DName;
    private Instructor manger;
    private List<Instructor> instructors;
    private List<Student> students;

    public Department(int id, String DName, Instructor manger) {
        this.id = id;
        this.DName = DName;
        this.manger = manger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDName() {
        return DName;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }

    public Instructor getManger() {
        return manger;
    }

    public void setManger(Instructor manger) {
        this.manger = manger;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
