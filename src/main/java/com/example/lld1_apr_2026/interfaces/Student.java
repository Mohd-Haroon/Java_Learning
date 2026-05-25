package com.example.lld1_apr_2026.interfaces;

public class Student implements Payable, Loggable{
    @Override
    public void logError(String message) {
        System.out.println("STUDENT ERROR: " + message);
    }

    @Override
    public void logInfo(String message) {
        System.out.println("STUDENT INFO: " + message);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing a payment of Rs. " + amount);
    }

    @Override
    public Integer getPaymentStatus(String transactionId) {
        return 1;
    }
}
