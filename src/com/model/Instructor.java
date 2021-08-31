package com.model;

import java.time.LocalDate;
import java.util.List;

public class Instructor extends Person {

    private double hourRate;
    private double salary;
    private double bonus;
    private Department department;
    private List<Course> courses;

    public Instructor(int id, String name, int age, String address, double hourRate, double salary, double bonus, Department department) {
        super(id, name, age, address);
        this.hourRate = hourRate;
        this.salary = salary;
        this.bonus = bonus;
        this.department = department;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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
