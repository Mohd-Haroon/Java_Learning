package com.example.lld1_apr_2026.phonePe;

public class Main {
    public static void main(String[] args) {
        BankingPartnerAPI yesBankPartner = new YesBankPartner();
        BankingPartnerAPI iciciBankPartner = new ICICIBankPartner();

        PhonePePaymentService phonePe = new PhonePePaymentService(iciciBankPartner);

        phonePe.processPayment("1", "2", 33.3);


    }
}
