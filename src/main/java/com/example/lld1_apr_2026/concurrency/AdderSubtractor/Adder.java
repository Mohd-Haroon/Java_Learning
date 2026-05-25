package com.example.lld1_apr_2026.concurrency.AdderSubtractor;

import com.example.lld1_apr_2026.interfaces.Loggable;
import com.example.lld1_apr_2026.interfaces.example.C;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        //
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            count.value += i;
            lock.unlock();
        }
    }
}
