package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextFile {

    private static ObjectOutputStream output;
    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("students.txt")));
            System.out.println("File is opened");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readRecords() {

        try {
            Student student = (Student) input.readObject();
            System.out.println(student.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void addRecords() {

        Student student = new Student(22, "Mohamed", "Emad", 20.6);

        try {
            output.writeObject(student);
            System.out.println("Record is added");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void closeFile() {
        if (output != null) {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
