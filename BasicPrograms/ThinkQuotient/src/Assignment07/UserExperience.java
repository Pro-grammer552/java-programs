package Assignment07;

import java.util.Scanner;

public class UserExperience {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Salary");
		String level = sc.next();
		
		
		switch(level) {
		
		
		case "Begineer":System.out.println("salary 3.5lpa");
		break;
		case "intermediate":System.out.println("salary 5lpa");
		break;
		case "Expert":System.out.println("Salary 10+lpa");
		break;
		
		default:System.out.println("extraordinary");
		}

	}

}
