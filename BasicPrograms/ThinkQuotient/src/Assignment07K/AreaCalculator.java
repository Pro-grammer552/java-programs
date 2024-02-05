package Assignment07K;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/*
write code to translate area of circle rectangle tringle and square
using menu given program
area of circle=3.14*r*r
area of rectangle=a=w*l
area of tringle=a=hb/2
area of square=a*a
 */
public class AreaCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;
		do 
		{	
		System.out.println("Area Calculator Menu\n1.Area of circle\n2.Area of rectangle\n3"
				+ ".Area of tringle\n4.Area of square");

		System.out.print("Enter out choice : ");
		int choice = sc.nextInt();	
		switch (choice) {

		case 1:
			System.out.println("Enter the Radius");
			int r = sc.nextInt();
			
			System.out.println("Area of circle " + (3.14 * r * r));
			break;
		case 2:
			System.out.println("Enter the width");
			int w = sc.nextInt();
			System.out.println("Enter the length");
			int l = sc.nextInt();
			
			System.out.println("Area of rectangle " + (w * l));
			break;
		case 3:
			System.out.println("Enter the Height");
			int h = sc.nextInt();
			System.out.println("Enter the Bredth");
			int b = sc.nextInt();
			
			System.out.println("Area of tringle " + (h * b / 2));
			break;
		case 4:
			System.out.println("Enter the Area");
			int a = sc.nextInt();
			
			System.out.println("Area of tringle " + (a * a));
			break;
		default:
			break;
		}
			System.out.println("You want to continue......Press Y ");
		
			   System.out.println("Do you want to continue? (Y/N)");
	            ch = sc.next().charAt(0);
	        } while (ch == 'Y' || ch == 'y');
	

}
}
