package com.example.lld1_apr_2026.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // Add elements
        students.add("Rahul");
        students.add("Priya");
        students.add("Arjun");
        students.add("Rahul");  // ✅ Duplicates allowed!

        // Indexed access — O(1)
        System.out.println(students.get(0));  // "Rahul"

        // Size
        System.out.println(students.size());  // 4

        // Remove by index
        students.remove(0);  // Removes "Priya"

        // Iterate
        for (String s : students) {
            System.out.println(s);
        }

        List<String> studentsSync = Collections.synchronizedList(students);


        List<String> normalList = new ArrayList<>(studentsSync);



    }
}

/*
Dynamic array - starts at a capacity of 10, grows by 50%
Best for: Random access, iterating, when you mostly add to the end
 */
