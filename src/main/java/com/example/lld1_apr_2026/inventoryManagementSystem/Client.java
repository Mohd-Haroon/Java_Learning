package com.example.lld1_apr_2026.inventoryManagementSystem;

import com.example.lld1_apr_2026.inventoryManagementSystem.exceptions.DuplicateItemException;
import com.example.lld1_apr_2026.inventoryManagementSystem.exceptions.InvalidQuantityException;
import com.example.lld1_apr_2026.inventoryManagementSystem.models.Book;
import com.example.lld1_apr_2026.inventoryManagementSystem.models.Item;

public class Client {

    public static void main(String[] args) throws InvalidQuantityException {
        // Type-safe inventory — only Books allowed!
        Inventory<Book> bookStore = new Inventory<>();

        try {
            bookStore.add(new Book("B1", "Clean Code", 599.0, 10, "Robert Martin"));
            bookStore.add(new Book("B2", "Effective Java", 499.0, 5, "Joshua Bloch"));
        } catch (DuplicateItemException  | InvalidQuantityException e) {
            System.out.println("Invalid quantity or deuplicate item: " + e.getMessage());
        }

        // This won't compile — type safety in action!
        // bookStore.add(new Electronics("E1", "iPhone", 79999.0, 3, 12));

        Book book = bookStore.get("B1");  // No casting needed!
        System.out.println(book);         // Clean Code by Robert Martin (₹599.0, qty: 10)

        // Mixed inventory — any Item subtype allowed
        Inventory<Item> generalStore = new Inventory<>();
//        generalStore.add(new Book("B3", "Head First Java", 399.0, 8, "Kathy Sierra"));
//        generalStore.add(new Clothing("C1", "Levi's Jeans", 2499.0, 20, "M"));
//        generalStore.add(new Electronics("E1", "AirPods", 9999.0, 15, 12));
    }
}
