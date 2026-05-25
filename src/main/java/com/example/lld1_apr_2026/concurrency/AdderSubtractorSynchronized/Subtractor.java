package com.example.lld1_apr_2026.concurrency.AdderSubtractorSynchronized;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            synchronized (count) { //Lock on the shared object
                count.value -= i;
                // some other vairable x
            }
        }

        /*
        lock.lock();
        --
        --
        --
        lock.unlock();
         */
    }
}
