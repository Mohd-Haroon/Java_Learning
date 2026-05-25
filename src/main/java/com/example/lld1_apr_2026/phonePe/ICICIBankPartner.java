package com.example.lld1_apr_2026.phonePe;

public class ICICIBankPartner implements BankingPartnerAPI{
    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean authenticate() {
        return false;
    }

    @Override
    public boolean transferMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }

    @Override
    public double getBalance(String accountId) {
        return 0;
    }
}
