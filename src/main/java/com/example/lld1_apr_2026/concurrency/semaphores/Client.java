package com.example.lld1_apr_2026.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        // Creating the producer threads
        for (int i = 0; i < 8; i++) {
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore, i);
            new Thread(producer, "Producer-" + i).start();
        }

        // Creating the consumer threads
        for (int i = 0; i < 20; i++) {
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore, i);
            new Thread(consumer, "Consumer-" + i).start();
        }
    }
}
