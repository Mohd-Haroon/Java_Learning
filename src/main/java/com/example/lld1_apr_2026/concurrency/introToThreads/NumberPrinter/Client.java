package com.example.lld1_apr_2026.concurrency.introToThreads.NumberPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main function is executing in " + Thread.currentThread().getName());

        // create 100 threads and each thread prints a different number

        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
