package com.example.lld1_apr_2026.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> visitedPages = new LinkedHashSet<>();

        visitedPages.add("Home");
        visitedPages.add("Products");
        visitedPages.add("Cart");
        visitedPages.add("Home");  // Duplicate — ignored, order unchanged

        // Iteration follows insertion order!
        for (String page : visitedPages) {
            System.out.println(page);  // Home → Products → Cart
        }
    }
}
