package com.example.lld1_apr_2026.copyConstructor;

public class StudentShallow {
    private String name;
    private int age;
    private double psp;
    private Address address; // Another object inside the Student object

    public StudentShallow(String name, int age, double psp, Address address) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.address = address;
    }

    // SHALLOW Copy Constructor
    public StudentShallow(StudentShallow other) {
        this.name = other.name; // s2.name = s1.name
        this.age = other.age; // s2.age = s1.age
        this.psp = other.psp;
        this.address = other.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

