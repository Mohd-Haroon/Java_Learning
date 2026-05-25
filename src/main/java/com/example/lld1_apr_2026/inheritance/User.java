package com.example.lld1_apr_2026.inheritance;

public class User {
    // Common attributes for ALL users
    private String id;
    private String username;
    private String email;
    private String password;

//    public User() {
//
//    }

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
//
//    public User(String username, String email) {
//        this.username = username;
//        this.email = email;
//    }

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

/*

Animal -> Mammal -> Dog -> Lab

Lab lab = new Lab();

Execution: Animal -> Mammal -> Dog -> Lab

Constructors execute from the TOPMOST parent to the child.
The parent should be initialised before the child can add it's parts.

Common interview questions:
1. Can super() appear anywhere in the constructor? -> No
2. Can you use both this() and super() in the same constructor? -> No
3. What if the parent has no default constructor?

 */
