package com.example.lld1_apr_2026.class_basics.lab_employee;

public class EmployeeDemo {
    public static void main(String[] args) {
//        Employee emp1 = new Employee(); // Employee() is a constructor
        // int a = 10;
        // displayDetails()

        System.out.println("Creating a new employee Rahul");

         Employee emp1 = new Employee(
                 "EMP001",
                 "Rahul Sharma",
                 "rahul@google.com",
                 "Engineering",
                 1200000,
                 3
         );

        Employee emp2 = new Employee(
                "EMP001"
        );

//        Employee emp3 = new Employee();
//        Employee emp4 = new Employee("emp1", "Alok"); -> I do not have a constructor like Employee(String, String)

        System.out.println("\nObject created and assigned to 'emp1'");

//         emp1.displayDetails();
//
//        emp1.employeeId = "EMP001";
//        emp1.name = "Rahul Sharma";
//        emp1.email = "rahul@company.com";
//        emp1.department = "Engineering";
//        emp1.salary = 1200000;
//        emp1.yearsOfExperience = 3;

//        Employee emp2 = new Employee();
//        emp2.employeeId = "EMP002";
//        emp2.name = "Priya Verma";
//        emp2.email = "priya@company.com";
//        emp2.department = "Product";
//        emp2.salary = 1500000;
//        emp2.yearsOfExperience = 5;
//
//        Employee emp3 = new Employee();
//        emp3.employeeId = "EMP003";
//        emp3.name = "Amit Kumar";
//        emp3.email = "amit@company.com";
//        emp3.department = "Engineering";
//        emp3.salary = 800000;
//        emp3.yearsOfExperience = 1;

        // Test behaviors
//        emp1.displayDetails();
//        emp1.promote(-15);  // 15% raise
//        emp1.changeDepartment("Platform");
//        emp1.displayDetails();

//        emp3.promote(20);  // New joiner gets bigger raise
    }
}

/*
Problems:
1. Verbose -> Too many lines of repeated code
2. Error-prone -> Easy to forget to set a field
3. No Validation -> Nothing stops this system from creating an employee with negative salary
 */

/*
Order of execution
1. Memory allocation - space is reserved for the object
2. Default initialization - Fields get defaults values
3. Constructor execution - Your code inside constructor runs
4. Reference return - Object address is assigned to the value
 */
