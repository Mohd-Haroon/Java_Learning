package com.example.lld1_apr_2026.concurrency.AdderSubtractorSynchronizedMethod;

public class Count {
    private long value = 0;

    // Java takes a lock on "this" -> current object
    public synchronized void incrementBy(int amount) {
        this.value += amount;
    }

    public synchronized void decrementBy(int amount) {
        this.value -= amount;
    }

    public synchronized long getValue() {
        return this.value;
    }
}
