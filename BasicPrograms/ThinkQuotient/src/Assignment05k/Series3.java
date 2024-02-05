package Assignment05k;

import java.util.Scanner;
//	Print Series 1  11  111  111……..n terms
public class Series3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(temp+",");
			temp = temp * 10 + 1;
			System.out.print(temp+ ",");
			}
			
		
		}
		
	

}
