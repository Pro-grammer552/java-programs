import java.util.Scanner;

public class Assignment11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		
		for (int i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(".");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j+"");

			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j + "");

			}

			System.out.println("");
		}

	}
}
