package com.example.lld1_apr_2026.lambdas;

public class TraditionalClient {
    public static void main(String[] args) {
        Runnable task1 = new Runnable() { // new InterfaceName() {...}
            @Override
            public void run() { // Implement the run method right here
                System.out.println("Hello World");
                walk();
            }

            private void walk() {
                System.out.println("Walking");
            }
        };

        Thread t = new Thread(task1);
        t.start();

        // task - is the variable receiving the interface
        // new - creating an instance of the anonymous class
        // Runnable() - interface which is being implemented by the anonymous class
        // opening braces { -> class body starts here
    }
}
