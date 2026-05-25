package com.example.lld1_apr_2026;

public class Main {
    public static void main(String[] args) {
        Student bipin = new Student();
        bipin.updateAge(21);
    }
}

/*
Agenda:

1. What is LLD
2. Why is it so important?
3. Structure for the LLD module
4. Introduction to OOP -> Object-Oriented Programming
5. OOP Terminology -> Keywords


What is LLD/OOD -> Low Level Design/Object-Oriented Design

HLD provides a bird-eye view

what are you doing when not writing code?
1. Design
2. Code reviews
3. Debug
4. Analysis -> New requirements
5. Reading code
6. Testing
7. Documentation
8. Meetings
9. Sprint Planning
10. Mentoring Juniors

12% of time writing code -> 88% on all the stuff listed above.

Readable, Extensible, Modular, Maintainable.

Uber
Flipkart
Swiggy
Ola
CRED
Udaan
Razorpay
PhonePe
Zomato
Blinkit
Hotstar, and many more.

Google, Amazon, Mircosoft, Meta, Apple -> LLD

Oracle, IBM -> Old companies -> Theoretical questions on LLD.
-> Can you explain what is a Decorator Design Pattern
->

interviewing.io ->
In 2025 -> 85%

What is Object Oriented Porgramming?

Procedural Programming
procedures -> A set of instructions that perform a specific task.

functions / methods

Go is a procedural programming language

Ankit is going to report progress to the Product Team

Someone(subject/entity) doing something(action)
Entity -> Performs a bheaviour or action

In real world, entities perform actions


 */

/*
In Procedural way ->

String username1 = "Alok";
String currentShow1 = "";
boolean isPlaying1 = false;

String username2 = "Aishwarya";
String currentShow2 = "";
boolean isPlaying2 = false;


void startWatching(String show) {
    currentShow = show;
    isPlaying = true;
    System.out.println("Now Playing: " + show);
}

void stopWatching() {
    isPlaying = false;
    System.out.println("Stopped: " + currentShow);
}

void likeShow() {
    System.out.println(userName + " liked " + currentShow);
}

In real world -> Entity performs the action
Procedural -> Action is performed on the entity

alok.watch(show) vs watch(show, alok)

If we scale to a lot of users

struct User {
 String name;
 String currentShow;
 boolean isPlaying;
}

User u1 = {"Mahesh", "Mandala Murders", true}
User u2 = {"Bipin", "Vadh2", true}

void startWatching(User user) {
    currentShow = show;
    isPlaying = true;
    System.out.println("Now Playing: " + show);
}

void stopWatching(User user) {
    isPlaying = false;
    System.out.println("Stopped: " + currentShow);
}

void likeShow(User user) {
    System.out.println(user[0] + " liked " + currentShow);
}

stopWatching(mahesh) -> action being performed on mahesh
mahesh.stopWatching() -> mahesh is performing the action
 */

/*
As the system scales in terms of features, problems start arising
1. No clear ownership
2. Discoverability nightmare
3. Accidental misuse
4. God files -> Booking.com has a huge monolith in Perl. There is a file called Hotel.pm.
This Hotel.pm file has 1 lakh+ lines of code.

This is where OOP comes to the picture.

Core principle -> entities(objects) own their behaviors(methods) and data(attributes)

-> manvendra wants to build an OS kernel -> C (procedural)
-> Jayshri wants to build a high-performance cache like Redis -> C/Go
-> Write Data transformation pipelines -> functional programming might be better here
-> Data science, ML -> Python

 */


