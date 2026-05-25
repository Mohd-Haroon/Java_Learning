package com.example.lld1_apr_2026.concurrency.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem(Object item) {
        items.add(item);
        System.out.println("Producer added item. Current size: " + items.size());
    }

    public void removeItem() {
        if (items.isEmpty()) return;
        Object item = items.remove(items.size() - 1);
        System.out.println("Consumer removed item. Current size: " + items.size());
    }
}
