package com.example.lld1_apr_2026.polymorphism;

public class Mentor extends User{
    private boolean availability;
    private double rating;

    public Mentor(String id, String username, String email) {
        super(id, username, email);
    }
}
