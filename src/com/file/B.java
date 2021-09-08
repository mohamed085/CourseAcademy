package com.company;

class A {
    public void m1() {
        System.out.println("A");
    }
}

public class B extends A {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }

    void m1() {
        System.out.println("B");
    }
}
