package com.example.lld1_apr_2026.concurrency.introToThreads.HelloWorldPrinter;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() +" Hi from main thread");

        //Step 1: Actual instance of our task
        HelloWorldPrinter hwp = new HelloWorldPrinter();

        // Step 2: Create a thread and give it your task
        Thread thread = new Thread(hwp);

        System.out.println("-----Calling run() directly-------");
        // WRONG - No new thread!
        thread.run(); // run() executes in the main thread


        System.out.println("------Calling start()------");
        // Step 3: Start your thread
        thread.start(); // <- Creates a new thread and calls run() on that thread

        System.out.println("Main thread continues ...");
    }
}

/*
Step 1: Define the task
e.g Print HelloWorld multiple times

Step 2: Run the task from a Thread

thread.run() -> Just calls the run method in the current(main) thread
thread.start() -> Creates a NEW thread, and the OS schedules that thread to execute the run method.

 */
