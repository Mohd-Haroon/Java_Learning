package com.example.lld1_apr_2026.polymorphism.methodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 10);
        calculator.add(5.5, 5.6);
        calculator.add(1, 2, 3);

        System.out.println("Hello");
        System.out.println(42);
        System.out.println(3.14);
    }
}
