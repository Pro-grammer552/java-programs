package Assignment05k;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int res=0;
		for (int i = 0; i <= n; i++) {

			if(i%2==0)
			{
				res=res+i;
				System.out.println(i);
			
			}
	}
		System.out.println("sum of even number :"+res);

}
}
