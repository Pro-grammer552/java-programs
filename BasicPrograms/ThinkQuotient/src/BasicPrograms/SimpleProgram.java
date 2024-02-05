package BasicPrograms;

import java.util.*;

public class SimpleProgram {


		public static void main(String args[])
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Amount");
			int Principal = sc.nextInt();

		     System.out.print("Enter rate: ");
		     Float Rate = sc.nextFloat();

		     System.out.print("Enter the time: ");
		     double Time = sc.nextDouble();
		     
		     double Si = (Principal * Rate * Time) / 100;
		     System.out.println("Simple Interest: " + Si);
		}
		

}
