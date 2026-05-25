package com.example.lld1_apr_2026.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();

        emails.add("rahul@gmail.com");
        emails.add("priya@gmail.com");
        emails.add("rahul@gmail.com");  // Duplicate — silently ignored!

        System.out.println(emails.size());  // 2, not 3!

        // Fast lookup — O(1)
        System.out.println(emails.contains("rahul@gmail.com"));  // true
    }
}
