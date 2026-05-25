package com.example.lld1_apr_2026.copyConstructor;

public class DeepCopyDemo {
    public static void main(String[] args) {
        System.out.println("====== SHALLOW COPY PROBLEM ==== \n");

        Address addr1 = new Address("Mumbai", "India");
        StudentShallow s1 = new StudentShallow("Manvendra", 25, 99.0, addr1);
        StudentShallow s2 = new StudentShallow(s1); // Shallow copy

        System.out.println("Before: s1.city: " + s1.getAddress().getCity());
        System.out.println("Before: s2.city: " + s2.getAddress().getCity());

        s2.getAddress().setCity("Delhi");

        System.out.println("\nAfter s2's city is changed to Delhi: ");
        System.out.println("Before: s1.city: " + s1.getAddress().getCity());
        System.out.println("Before: s2.city: " + s2.getAddress().getCity());

        // Create Deep copy solution
        // HW


    }
}
