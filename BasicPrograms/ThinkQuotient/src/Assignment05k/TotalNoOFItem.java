package Assignment05k;

import java.util.Scanner;

/* You have hundred items (1,2,3,…100) the price of each item is the same as its number.
i.e., item 1 is of 1 rs. Item 2 is of 2 rs. And so on.
Calculate the total of the items.
*/


public class TotalNoOFItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int total=0;
		int i;
		for(i=0;i<=n;i++)
		{
			total=total+i;
			//System.out.println(total);
			
		}
		System.out.println("price of "+i +" is " + total);

	}

}
