package BasicPrograms;

import java.util.Scanner;

public class Paytm {
	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc = new Scanner(System.in);

		Person p1 = new Person(101, "Suraj", 1001);

		p1.setAccNum(1002);
		p1.setName("Abc");
		
		
		

		System.out.println("Current balance: " + p1.getBalance());

		System.out.println("Enter the amount:");
		int amount = sc.nextInt();

	
		int newBalance = p1.getBalance() + amount;

		System.out.println("Updated balance: " + newBalance);

		sc.close();
	}
}
