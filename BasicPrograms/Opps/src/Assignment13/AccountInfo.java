package Assignment13;

/*Create a class Account containing following methods -
insert () to insert account data
display () to display account information
deposit () to deposit amount
withdraw () to withdraw amount
check_balance() to check balance
*/


public class AccountInfo {
     int accountNumber;
     String accountHolder;
     double balance;

    public void insert(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance+ amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    
    public static void main(String args[])
    {
    	AccountInfo account = new AccountInfo();
    	account.insert(12345, "suraj");
    	account.deposit(1000.0);
    	account.withdraw(500.0);
    	account.checkBalance();
    	account.display();

    }
}
