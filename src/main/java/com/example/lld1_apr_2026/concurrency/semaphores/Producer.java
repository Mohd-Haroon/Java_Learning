package com.example.lld1_apr_2026.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private int id;

    public Producer(Store store,
                    Semaphore producerSemaphore,
                    Semaphore consumerSemaphore,
                    int id) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.id = id;
    }

    // p = 5; c = 0
    @Override
    public void run() {
        while(true) {
            try {
                producerSemaphore.acquire(); // Waits for an empty slot;
                store.addItem(id);
                consumerSemaphore.release(); // p = 4; c = 1
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restores the interrupt flag
                break;
            }
        }
    }
}
