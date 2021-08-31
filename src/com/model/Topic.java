package com.model;

import java.util.List;

public class Topic {

    private int id;
    private String TName;
    private List<Course> courses;

    public Topic(int id, String TName) {
        this.id = id;
        this.TName = TName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
