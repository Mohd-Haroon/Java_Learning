package com.example.lld1_apr_2026.class_basics.lab_employee;

import java.util.Queue;

/*
Problem Statement
A company needs to manage its employees. Design an Employee class.

Requirements:
Every employee has:

Employee ID (unique)
Name
Email
Department
Salary
Years of experience

An employee can:

Get a promotion (increase salary by a given percentage)
Change department
Display their details

Create at least 3 employee objects and demonstrate all behaviors.
 */
class Employee {
    // Attributes
    String employeeId;
    String name;
    String email;
    String department;
    double salary;
    int yearsOfExperience;

    // Constructor 1: No params
    Employee() {
    }

    // Constructor 2: Only employeeID
    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    // Constructor 3: All params
    public Employee(String employeeId,
                    String name,
                    String email,
                    String department,
                    double salary,
                    int yearsOfExperience) {
//        System.out.println("--- STEP 1: memory allocated, default values set ---");
//        System.out.println("Before assignment:");
//        System.out.println("employeeId: " + this.employeeId);
//        System.out.println("name: " + this.name);
//        System.out.println("email: " + this.email);
//        System.out.println("department: " + this.department);
//        System.out.println("salary: " + this.salary);
//        System.out.println("years of experience: " + this.yearsOfExperience);

        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;

//        System.out.println("After assignment: ");
//        System.out.println("employeeId: " + this.employeeId);
//        System.out.println("name: " + this.name);
//        System.out.println("email: " + this.email);
//        System.out.println("department: " + this.department);
//        System.out.println("salary: " + this.salary);
//        System.out.println("years of experience: " + this.yearsOfExperience);

    }

    // Behaviors
    void promote(double percentageIncrease) { // 2.567%
        double increment = salary * (percentageIncrease / 100);
        salary += increment;
        System.out.println(name + " promoted! New salary: ₹" + salary);
    }

    void changeDepartment(String newDepartment) {
        String oldDepartment = department;
        department = newDepartment;
        System.out.println(name + " moved from " + oldDepartment + " to " + newDepartment);
    }

    void displayDetails() {
        System.out.println("=== Employee Details ===");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Experience: " + yearsOfExperience + " years");
        System.out.println("========================");
    }
}

/*
Constructor Type 1: Default Constructor
 */