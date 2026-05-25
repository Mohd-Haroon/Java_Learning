package com.example.lld1_apr_2026.encapsulation;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(
                "ACC001",
                "Rahul",
                50000,
                "Savings",
                true
        );

        BankAccount acc2 = new BankAccount(
                "ACC002",
                "Priya",
                30000,
                "Savings",
                true
        );

        // Test operations
        acc1.checkBalance();
        acc1.deposit(10000);
        acc1.withdraw(5000);
        acc1.transfer(acc2, 15000);

        System.out.println("\n--- After transfer ---");
        acc1.checkBalance();
        acc2.checkBalance();

        // Test edge cases
        System.out.println("\n--- Edge Cases ---");

        acc1.deposit(-500);           // Invalid: negative deposit
        acc1.withdraw(100000);         // Invalid: insufficient balance
        acc1.transfer(acc1, 1000);     // Invalid: self transfer

        acc2.deactivate();
        acc1.transfer(acc2, 1000);     // Invalid: recipient inactive
    }
}
