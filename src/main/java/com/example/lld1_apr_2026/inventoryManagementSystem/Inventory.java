package com.example.lld1_apr_2026.inventoryManagementSystem;

import com.example.lld1_apr_2026.inventoryManagementSystem.exceptions.DuplicateItemException;
import com.example.lld1_apr_2026.inventoryManagementSystem.exceptions.InvalidQuantityException;
import com.example.lld1_apr_2026.inventoryManagementSystem.models.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {

    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void add(T item) throws InvalidQuantityException, DuplicateItemException {
        if (item.getQuantity() < 0) {
            throw new InvalidQuantityException(
                    "Invalid quantity " + item.getQuantity() + " for item: " + item.getName()
            );
        }
        if (items.containsKey(item.getId())) {
            throw new DuplicateItemException(
                    "Item with ID '" + item.getId() + "' already exists"
            );
        }
        items.put(item.getId(), item);
    }

    public void remove(T item) {
        items.remove(item.getId());
    }

    public T get(String id) {
        return items.get(id);
    }

    public List<T> getAll() {
        return new ArrayList<>(items.values());
    }
}
