package com.bank;

public class Transaction {

    private String type; // "Deposit" or "Withdrawal"
    private int amount;

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
