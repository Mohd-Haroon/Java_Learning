package com.example.lld1_apr_2026.inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student sanchit = new Student("S001",
                "sanchit_dev",
                "sanchit@scaler.com"
        );

        sanchit.logout();

        System.out.println(sanchit.getUsername()); // Inherited from User class

        sanchit.submitAssignment(); // Student-specific method
        System.out.println("PSP: " + sanchit.getPsp()); // Student specific
    }
}
