package com.example.lld1_apr_2026.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task A");
        tasks.add("Task B");
        tasks.add("Task C");

        // Fast insertion at both ends — O(1)
        tasks.addFirst("Urgent Task");
        tasks.addLast("Low Priority Task");

        // Remove from front — O(1)
        String next = tasks.removeFirst();
        System.out.println("Processing: " + next);  // "Urgent Task"

    }
}
/*
Internally implemented using a Doubly Linked List
Best for: insertions/deletions at both ends.
 */
