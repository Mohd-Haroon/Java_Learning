package com.example.lld1_apr_2026.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class LambdaClient {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Hello World");
            System.out.println("Hello ALok");
        };

        // () - the parameters of the method run()
        // -> - the lambda arrow, reads as "goes to"
        // { body } - the implementation

//        Thread t = new Thread(task1);
//        t.start();

        // 1. No params
        Runnable r = () -> {
            System.out.println("Hello");
        };

        Callable<Integer> c = () -> {
            System.out.println("Hello");
            return 1;
        };

        // Multi line body - needs curly braces and return
        Comparator<Integer> comp = (a,b) -> {
            if (a > b) return 1;
            else if (a < b) return -1;
            return 0;
        };

        Comparator<Integer> comp2 = (a,b) -> a - b;

        // Single expression body
        Comparator<Integer> comp3 = Integer::compare;

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(45);
        l.add(5);
        l.add(67);
        l.add(6);
        l.add(10);

        // even first, then descending within each group
        Collections.sort(l, (a,b) -> {
            if (a % 2 == b % 2) return b - a;
            else if (a % 2 == 0) return -1;
            else return 1;
        });

        Collections.sort(l, new ListComparator());
        System.out.println(l); // [12, 10, 6, 67, 45, 13, 5]
    }
}
