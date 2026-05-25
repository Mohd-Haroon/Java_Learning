package com.example.lld1_apr_2026.concurrency.AdderSubtractorSynchronizedMethod;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            count.incrementBy(i);
        }
    }
}

/*

count = address where the actual count is present
 */
