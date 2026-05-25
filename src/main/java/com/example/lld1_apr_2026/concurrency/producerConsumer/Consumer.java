package com.example.lld1_apr_2026.concurrency.producerConsumer;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) { // Lock the store
                if (store.getItems().size() > 0) { // Check
                    store.removeItem(); // Act
                }
            } // Unlock the store
        }
    }
}
