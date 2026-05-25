package com.example.lld1_apr_2026.polymorphism;


public class Instructor extends User {
    private String expertise;
    private double rating;
    private int coursesCreated;

    public Instructor(String id, String username, String email, String expertise) {
        super(id, username, email);
        this.expertise = expertise;
        this.rating = 0.0;
        this.coursesCreated = 0;
    }

    // Create courses
    // conduct lectures
}
