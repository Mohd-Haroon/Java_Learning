package com.example.lld1_apr_2026.concurrency.producerConsumer;

public class Producer implements Runnable {
    private Store store;

    Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) { // Lock the sore
                if (store.getItems().size() < store.getMaxSize()) { // Check
                    // space available or not
                    store.addItem(new Object()); // Act
                }
            } // unlock
        }
    }
}
