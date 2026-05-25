package com.example.lld1_apr_2026.class_basics;

import com.example.lld1_apr_2026.class_basics.lab_book.Book;

public class Main {
    public static void main(String[] args) {
        Student rahul = new Student(); // Object 1 - occupies memory
        rahul.name = "Rahul";
        rahul.age = 22;
        rahul.batch = "Feb 2026";
        rahul.psp = 78.5;

        Student priya = new Student(); // Object 2 - occupies memory
        priya.name = "Priya";
        priya.age = 24;
        priya.batch = "Feb 2026";
        priya.psp = 92.3;

        Student amit = new Student();
        amit.name = "Amit";
        amit.age = 21;
        amit.batch = "Mar 2026";
        amit.psp = 65.0;

        Student pankaj = new Student();

        System.out.println(rahul.name);
        System.out.println(amit.name);
        System.out.println(priya.name);
        System.out.println(pankaj.psp);
        System.out.println(pankaj.name);
        System.out.println("DEBUG");


//        Book book = new Book();
    }
}
