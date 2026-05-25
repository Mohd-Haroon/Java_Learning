package com.example.lld1_apr_2026.generics.Pair;

public class Client {
    public static void main(String[] args) {
        // Store the name(String) + score(Integer) combination
        Pair<String, Integer> studentData = new Pair<>("Rahul", 95);

//        studentData.setFirst(42);

        String name = studentData.getFirst();

        Pair<Integer, Integer> coordinates = new Pair<>(10, 20);
        Pair<String, String> loginCredentials = new Pair<>("admin", "pass123");

// This is called a raw type -> What we had before java 5
        Pair pair = new Pair(12, 13);
    }
}

// The compiler sees Object -> Object. Perfectly legal.
// At runtime sees Integer -> String. Impossible cast -> Crash

// Generic were introduced in Java 5(2004) to solve this problem.
//
