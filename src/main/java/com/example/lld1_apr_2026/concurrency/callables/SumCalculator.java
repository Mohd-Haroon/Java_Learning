package com.example.lld1_apr_2026.concurrency.callables;

import java.util.concurrent.Callable;

public class SumCalculator implements Callable<Integer> {
    private int n;

    public SumCalculator(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum; // I can return the value here
    }
}
