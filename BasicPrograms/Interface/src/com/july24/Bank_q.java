package com.july24;
/*
 6.	Create an interface Account having methods- deposit(), 
 withdraw() and aboutBank() (abountBank() is a static method). Create two
  classes Saving and Current which implement the Account interface.
   Call the methods of Saving and Current classes in main method.,
   create a new method in Account interface- takeLoan() (takeLoan() is a default method). takeLoan()
  method would be implemented by Saving class only.
   Call the methods of Saving and Current classes in main method
 */



interface Account {
    void deposit();
    void withdraw();
    
    //java9
    static void aboutBank() {
        System.out.println("This is a bank.");
    }
    default void takeloan() {
        System.out.println("Reject");
    }
}

class Saving implements Account {
    @Override
    public void deposit() {
        // TODO: Implement deposit for Saving account
    }

    @Override
    public void withdraw() {
        // TODO: Implement withdraw for Saving account
    }

    @Override
    public void takeloan() {
        System.out.println("Approve");
    }
}

class Current implements Account {
    @Override
    public void deposit() {
        // TODO: Implement deposit for Current account
    }

    @Override
    public void withdraw() {
        // TODO: Implement withdraw for Current account
    }
}

public class Bank_q {
    public static void main(String[] args) {
        Current c = new Current();
        c.deposit();
        c.withdraw();
        c.takeloan();

        Saving s = new Saving();
        s.deposit();
        s.withdraw();
        s.takeloan();
    }
}
