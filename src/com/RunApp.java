package com;

import com.model.Student;
import com.services.StudentServices;
import com.services.servicesImp.StudentServicesImp;

import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student");

        Student student = new Student("Mohamed3", 20);
        Student student1 = new Student("Mohamed2", 20);
        Student student2 = new Student("Mohamed1", 20);

        StudentServices studentServices = new StudentServicesImp();

        studentServices.add(student);
        studentServices.add(student1);
        studentServices.add(student2);

        for (Student student11 : studentServices.getAll()) {
            System.out.println(student11.getName() + " " + student11.getAge());
        }

    }
}
