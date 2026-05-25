package com.example.lld1_apr_2026.inventoryManagementSystem.models;

public class Electronics extends Item {
    private int warranty; // in months
    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }
}
