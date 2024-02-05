package SundayAssignment16K;

public class pattern2 {

	public static void main(String[] args) {
		
		int rows=6;
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= rows - i; j++)
			{
				System.out.print(" ");
			
			}
			for(int k = 1; k <= i; k++)
			{
				
				//System.out.print(k);
				System.out.print(k % 2 == 1 ? "1" : "0");
			}
			
			System.out.println();
		}
		

	}

}
