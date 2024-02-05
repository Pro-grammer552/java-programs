import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		
		switch(num%2) {
		case 0:System.out.println("even");
		break;
		default:System.out.println("odd");
		break;
	}
	}
}
