package com.example.lld1_apr_2026.concurrency.semaphores;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private Queue<Object> items;

    public Store() {
        this.items = new ConcurrentLinkedDeque<>();
    }

    public Queue<Object> getItems() {
        return items;
    }

    public void addItem(int id) {
        items.add(new Object());
        System.out.println("Item Added. Size is: " + items.size() + " By thread: " + id);
    }

    public void removeItem(int id) {
        items.remove();
        System.out.println("Item Removed. Size is: " + items.size() + " By thread: " + id);
    }
}
