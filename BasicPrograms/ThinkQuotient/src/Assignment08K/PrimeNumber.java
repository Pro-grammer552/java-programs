package Assignment08K;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num =7;
		int flag=0;
		int i=2;
		while(i<num)
		{
			
		
			if(num%i==0)
			{
				flag=1;
			
			}
			i++;
		}
			if(flag==0)
			{
				System.out.println("prime");
			}else
			{
				System.out.println("not a prime ");
			}
		

	}

}
