package com.example.lld1_apr_2026.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(92);  // Duplicate — ignored

        // Iteration is in SORTED order!
        for (int score : scores) {
            System.out.println(score);  // 78 → 85 → 92
        }
    }
}
