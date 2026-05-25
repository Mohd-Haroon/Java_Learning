package com.example.lld1_apr_2026.abstractClass;


public abstract class Instructor extends User {
    private String expertise;
    private double rating;
    private int coursesCreated;

    public Instructor(String id, String username, String email, String expertise) {
        super(id, username, email);
        this.expertise = expertise;
        this.rating = 0.0;
        this.coursesCreated = 0;
    }

    @Override
    public String getRole() {
        return "Instructor";
    }

//    @Override
//    public void performDailyTask() {
//        System.out.println("Preparing and deliverying lectures on " + expertise);
//    }
}
