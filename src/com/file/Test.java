package com.company;

class Animal {
    public String name = "animal";
}

class Dog extends Animal {
    public String name = "dog";
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.name);
    }
}
