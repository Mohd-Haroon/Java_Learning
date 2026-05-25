package com.example.lld1_apr_2026.interfaces;

public interface Payable {
    void makePayment(double amount);
    Integer getPaymentStatus(String transactionId);
}
