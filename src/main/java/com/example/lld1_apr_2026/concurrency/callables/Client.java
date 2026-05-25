package com.example.lld1_apr_2026.concurrency.callables;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        SumCalculator sumCalculator = new SumCalculator(1000);
        Future<Integer> future = executorService.submit(sumCalculator);

        // Do other work in this main thread
        System.out.println("task submitted, doing other work meanwhile...");

        // When you need the result, you can call get()

        // Wrap it in a try-catch block
        Integer result = future.get(); // <- BLOCKS until the result is ready
        System.out.println("Sum of 1 to 100 = " + result);

        executorService.shutdown();

    }
}
