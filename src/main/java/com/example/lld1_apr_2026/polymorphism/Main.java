package com.example.lld1_apr_2026.polymorphism;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Student student = new Student(
                "1",
                "alok_dev",
                "alok@scaler.com",
                "dec25");

        System.out.println(student.getRole());

        User user1 = new Student( "1",
                "alok_dev",
                "alok@scaler.com",
                "dec25");

        User user2 = new Instructor(
                "I001",
                "amit",
                "amit@scaler.com",
                "Java"
        );

        User user3 = new Mentor(
                "M001",
                "priya",
                "priya@gmail.com"
        );

        User user5 = new User();

        user1.getRole();

        NotificationService service = new NotificationService();
        service.sendWelcomeEmail(user1);
        service.sendWelcomeEmail(user2);
        service.sendWelcomeEmail(user3);

        // If not polymorphism
        /*
        sendWelcomeEmailToStudent(Student s)
        sendWelcomeEmailToInstructor(Instructor i)
        sendWelcomeEmailToMentor(Mentor m)
         */


        // User user = new Student();
        // Student student = new User();
        // s.getBatchId();

        // Student student = getUser(); -> Wrong


        /*
        Animal -> Make this animal "bark" -> All animals cannot bark
        Dog -> Make it walk -> all animals can walk
         */
    }
}
