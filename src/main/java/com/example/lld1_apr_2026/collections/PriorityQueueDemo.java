package com.example.lld1_apr_2026.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        // Min-heap by default — smallest element has highest priority
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Max-heap
        PriorityQueue<Integer> pqMax  = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Elements come out in priority order, NOT insertion order!
        System.out.println(pq.poll());  // 10 (smallest first)
        System.out.println(pq.poll());  // 20
        System.out.println(pq.poll());  // 30
    }
}
