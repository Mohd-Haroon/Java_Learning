package com.example.lld1_apr_2026.concurrency.introToThreads.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        // This is the place where you
        // put your code that needs to be
        // executed in parallel
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Hello World - " + i);
        }

        helperMethod();
    }
    private void helperMethod() {
        System.out.println("In helperMethod()");
    }
}
