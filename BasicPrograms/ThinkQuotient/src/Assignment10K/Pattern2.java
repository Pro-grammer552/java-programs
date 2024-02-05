package Assignment10K;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i = 1;
		for (i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				
				if (i%2 == 0) {
					System.out.print(j+"");
				} else {
					System.out.print((char) (64 + j));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}
}


