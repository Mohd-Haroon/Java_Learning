package com.example.lld1_apr_2026.abstractClass;

public abstract class User {
    // Common attributes for ALL users
    private String id;
    private String username;
    private String email;
    private String password;

    // Abstract methods
    // Child classes must implement this method
    public abstract String getRole();

    // Another abstract method
    public abstract void performDailyTask();

    public User() {

    }

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void signUp() {
        // create a new password
        // encrypt the password
        // return back the user
    }

    public boolean login(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

    public void logout() {
        System.out.println(username + " logged out successfully");
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
