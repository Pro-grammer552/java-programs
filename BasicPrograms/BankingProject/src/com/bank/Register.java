package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Register {

    private String name;
    private int ph_number;
    private int Acc_no;
    private String email;
    private int balance;
    private String passward;
    private List<Transaction> transactionHistory;

    public Register() {
        transactionHistory = new ArrayList<>();
    }

    public Register(String name, int ph_number, int Acc_no, String email, int balance, String passward) {
        this.name = name;
        this.ph_number = ph_number;
        this.Acc_no = Acc_no;
        this.email = email;
        this.balance = balance;
        this.passward = passward;
        transactionHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPh_number() {
        return ph_number;
    }

    public int getAcc_no() {
        return Acc_no;
    }

    public String getEmail() {
        return email;
    }

    public int getBalance() {
        return balance;
    }

    public String getPassward() {
        return passward;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh_number(int ph_number) {
        this.ph_number = ph_number;
    }

    public void setAcc_no(int acc_no) {
        Acc_no = acc_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }
}
