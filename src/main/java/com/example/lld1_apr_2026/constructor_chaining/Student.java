package com.example.lld1_apr_2026.constructor_chaining;

public class Student {
    private String name;
    private int age;
    private double psp;

    public Student() {
        this("Unknown", 0, 0.0); // Calls the 3-param constructor
        System.out.println("No-arg constructor finished");
    }

    public Student(String name) {
        System.out.println("Name-only constructor finished");
    }

    public Student(String name, int age, double psp) {
//        System.out.println("this: " + this);
        this(name);
        this.age = age;
        this.psp = psp;
        System.out.println("Full constructor - assigned all values");
    }
}
