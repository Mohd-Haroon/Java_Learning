package com.example.lld1_apr_2026.phonePe;

public interface BankingPartnerAPI {
    boolean connect();
    boolean authenticate();
    boolean transferMoney(String fromAccount, String toAccount, double amount);
    double getBalance(String accountId);
}
