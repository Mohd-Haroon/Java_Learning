package com.example.lld1_apr_2026.polymorphism;

public class NotificationService {
    public void sendWelcomeEmail(User user) {
        String message = "Welcome, " + user.getUsername() + "!";
        message += "\n Your role: " + user.getRole();

        // Send email
        // Functionality to send email

        System.out.println("Email sent to: " + user.getEmail());
        System.out.println(message);
    }
}
