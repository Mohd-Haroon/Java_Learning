package com.example.lld1_apr_2026.concurrency.executorService.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // Create a fixed thread pool
//        ExecutorService executorService = Executors.newFixedThreadPool(5);

        ExecutorService executorService = Executors.newCachedThreadPool();

        // create 100 threads and each thread prints a different number
        for (int i = 1; i <= 100; i++) {
            if (i == 80) {
                System.out.println();
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);

//            OLD WAY
//            Thread t = new Thread(numberPrinter);
//            t.start();
        }

        executorService.shutdown();
    }
}
