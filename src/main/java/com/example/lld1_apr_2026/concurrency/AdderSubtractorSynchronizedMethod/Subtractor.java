package com.example.lld1_apr_2026.concurrency.AdderSubtractorSynchronizedMethod;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
                count.decrementBy(i);
        }
    }
}

/*
count1: incrementBy(), decrementBy() ->

count2:

T1 -> incrementBy() count1
T2 -> incrementBy() count2


T1 -> incrementBy() count1
T2 -> decrementBy() count2

T1 -> incrementBy() count1
T2 -> decrementBy() count1


 */
