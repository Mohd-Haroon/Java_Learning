package com.example.lld1_apr_2026.encapsulation;

class BankAccount {

    // Attributes
    private String accountNumber;
    private String holderName;
    private double balance;
    private String accountType;  // "Savings" or "Current"
    private boolean isActive;

    public BankAccount(String accountNumber,
                       String holderName,
                       double balance,
                       String accountType,
                       boolean isActive) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
        this.isActive = isActive;
    }

    // Behaviors
    void deposit(double amount) {
        if (!isActive) {
            System.out.println("Account is inactive. Cannot deposit.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount. Deposit must be positive.");
            return;
        }

        balance += amount;
        System.out.println("₹" + amount + " deposited. New balance: ₹" + balance);

    }

    void withdraw(double amount) {
        if (!isActive) {
            System.out.println("Account is inactive. Cannot withdraw.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance. Available: ₹" + balance);
            return;
        }

        balance -= amount;

        System.out.println("₹" + amount + " withdrawn. New balance: ₹" + balance);
    }

    void checkBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    void deactivate() {
        isActive = false;
        System.out.println("Account " + accountNumber + " has been deactivated.");
    }

    void transfer(BankAccount recipient, double amount) {
        // Edge case: Cannot transfer to self
        if (this.accountNumber.equals(recipient.accountNumber)) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }

        // Check if withdrawal is possible
        if (!isActive) {
            System.out.println("Your account is inactive. Cannot transfer.");
            return;
        }

        if (!recipient.isActive) {
            System.out.println("Recipient account is inactive. Cannot transfer.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance for transfer.");
            return;
        }

        // Perform transfer
        this.balance -= amount;
        recipient.balance += amount;
        System.out.println("₹" + amount + " transferred from " + this.accountNumber +

                " to " + recipient.accountNumber);
        System.out.println("Your new balance: ₹" + this.balance);
    }
}
