package com.example.lld1_apr_2026.copyConstructor;

public class Student {
    private String name;
    private int age;
    private double psp;
    private Address address; // Another object inside the Student object

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, int age, double psp, Address address) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.address = address;
    }

    // DEEP Copy Constructor
    public Student(Student other) {

        this.name = other.name; // s2.name = s1.name
        this.age = other.age; // s2.age = s1.age
        this.psp = other.psp;
        // Create NEW address with the same values
        this.address = new Address(other.address);



//        this(other.name, other.age, other.psp, new Address(other.address)); // Can do this as well
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
}
