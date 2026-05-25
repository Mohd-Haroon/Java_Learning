package com.example.lld1_apr_2026.concurrency.AdderSubtractorSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        // Wait for both of them to  finish
        t1.join();

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t2.join();

        System.out.println("Final value: " + count.value);
    }
}
