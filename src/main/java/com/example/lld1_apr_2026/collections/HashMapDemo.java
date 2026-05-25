package com.example.lld1_apr_2026.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        // Put key-value pairs
        studentScores.put("Rahul", 95);
        studentScores.put("Priya", 87);
        studentScores.put("Arjun", 92);

        // Get by key — O(1)
        System.out.println(studentScores.get("Rahul"));  // 95

        // Check if key exists
        System.out.println(studentScores.containsKey("Priya"));  // true

        // Overwrite existing key
        studentScores.put("Rahul", 98);  // Updates to 98

        // Iterate over entries
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
