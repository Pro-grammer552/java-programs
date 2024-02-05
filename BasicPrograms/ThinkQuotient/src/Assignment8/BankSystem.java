package Assignment8;

import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount=sc.nextInt();
		 System.out.println("Banking System Menu ");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
        int choice = sc.nextInt();	
        
        switch (choice) {
        case 1:
            System.out.print("Enter the amount to deposit: ");
            int depositAmount = sc.nextInt();
            amount =amount+ depositAmount;
            System.out.println(amount);
		System.out.println("Deposit successful!");
		break;
        case 2:
        	System.out.println("Enter the Amount to withdraw");
        	int withdraw=sc.nextInt();
        	amount=amount-withdraw;
        	System.out.println(amount);
        	System.out.println("Withdraw successful!");
        	break;
        case 3:
        	System.out.println("your Current Balance " + amount);
        	break;
       default:
    	   System.out.println("exit...Please try again");
        	
	}

}
}
