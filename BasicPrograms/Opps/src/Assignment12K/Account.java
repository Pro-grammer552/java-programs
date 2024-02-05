package Assignment12K;

import java.util.Scanner;

public class Account {
     int accountId;
     String customerName;
     double balance;


    public Account(int accountId, String customerName, double balance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.balance = balance;
    }


    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account ID: ");
        accountId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = scanner.nextDouble();
    }

   
    public void displayDetails() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }

    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
    }

   
    public double checkBalance() {
        return balance;
    }


    public static void main(String[] args) {
        Account account = new Account(0, "", 0.0);
        account.acceptDetails();
        account.displayDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        double currentBalance = account.checkBalance();
        System.out.println("Current Balance: " + currentBalance);
    }
}