package com.example.lld1_apr_2026.inventoryManagementSystem.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Book("123", "C++", 123.90, 5, "Alok"));
        items.add(new Electronics("345", "Mouse", 12.90, 200, 34));

//        List<String> list = new ArrayList<>(List.of("Alok", "Harsh"));
        Collections.sort(items);
        Item item = items.getFirst();

        items.remove(item);


//        for (Item item: items) System.out.println(item.getName());
    }
}
