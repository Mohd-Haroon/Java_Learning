package com.example.lld1_apr_2026.concurrency.producerConsumer;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(10);

        // Hire 8 factory workers
        for (int i = 0; i < 8; i++) {
            Producer producer = new Producer(store);
            new Thread(producer).start();
        }

        // Open doors for 20 cutomers
        for (int i = 0; i < 20; i++) {
            Consumer consumer = new Consumer(store);
            new Thread(consumer).start();
        }
    }
}
