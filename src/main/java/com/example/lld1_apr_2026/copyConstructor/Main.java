package com.example.lld1_apr_2026.copyConstructor;

public class Main {
    public static void main(String[] args) {
        Address s1Address = new Address("Ahmedabad", "India");
        Student s1 = new Student("Priya", 22, 97.7, s1Address);

        // I am creating shallow copy
        Student s2 = new Student(s1);

        s2.getAddress().setCity("Delhi");

        System.out.println(s1.getAddress().getCity()); // Ahmedabad
        System.out.println(s2.getAddress().getCity()); // Delhi
    }
}
