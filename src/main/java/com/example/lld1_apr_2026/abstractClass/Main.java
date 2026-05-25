package com.example.lld1_apr_2026.abstractClass;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        User user = new User("U001", "generic", "user@gmail.com"); // ERROR

        User student = new Student("S001", "Shilpa", "shilpa@gmail.com", "B204");

//        User ins = new Ins("S001", "Alok", "shilpa@gmail.com", "B204");
//        User mentor = new Student("S001", "Shilpa", "shilpa@gmail.com", "B204");

        List<User> users = List.of(student);
        
//        Student.printClassName();
//        Student.studentCount


    }
}
