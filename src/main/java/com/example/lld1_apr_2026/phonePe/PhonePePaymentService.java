package com.example.lld1_apr_2026.phonePe;

public class PhonePePaymentService {
//    YesBankAPI yesBankAPI = new YesBankAPI();
//
//    public boolean processUPIPayment(String upiId, double amount) {
//        yesBankAPI.connect(); // connectToICICI()
//        yesBankAPI.login(); // iciciAuth()
//
//        boolean success = yesBankAPI.transferMoney(upiId, amount);
//
//        return success;
//    }

    private BankingPartnerAPI bankingPartnerAPI;

    public PhonePePaymentService(BankingPartnerAPI bankingPartnerAPI) {
        this.bankingPartnerAPI = bankingPartnerAPI;
    }

    public boolean processPayment(String from, String to, double amount) {
        bankingPartnerAPI.connect();
        bankingPartnerAPI.authenticate();
        boolean success = bankingPartnerAPI.transferMoney(from, to, amount);

        return success;
    }

    public double checkBalance(String accountId) {
        return bankingPartnerAPI.getBalance(accountId);
    }
}

/*

March 5, 2020 -> RBI placed Yes bank under moratorium

Obvious solution -> Switch to another bank(ICICI Bank) which works

NPCI -> essentially an interface that banks have to follow.



 */
