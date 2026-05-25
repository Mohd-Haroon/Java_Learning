package com.example.lld1_apr_2026.concurrency.introToThreads.NumberPrinter;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    public NumberPrinter() {
    }

    @Override
    public void run() {
        System.out.println("Number: " +
                numberToPrint +
                " printed by " + Thread.currentThread().getName());
    }

    public void setNumberToPrint(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }
}

/*
 Task 1 -> print 1 -> Thread 1
 Task 2 -> print 2 -> Thread 2
 .
 .
 .
 .
 Task 10 -> print 11
 .
 .
 .
 Task 100 -> print 100 -> Thread 100

 */
