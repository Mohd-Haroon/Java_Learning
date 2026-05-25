package com.example.lld1_apr_2026.abstractClass;


public class Mentor extends User {
    private boolean availability;
    private double rating;

    @Override
    public String getRole() {
        return "Mentor";
    }

    @Override
    public void performDailyTask() {
        System.out.println("Conduct mentoring sessions with mentees");
    }

    public Mentor(String id, String username, String email) {
        super(id, username, email);
    }
}
