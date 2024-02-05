package Assignment10K;

public class Trimorphic {

	public static void main(String[] args) {
		int num=6;
		int cube=num*num*num;
		int c=0;
		int temp=num;
		while(num>0)
		{
			int digit=num%10;
			c++;
			
			num=num/10;
		}
		System.out.println(c);
		
		int a=cube%(int)Math.pow(10, c);
		System.out.println(a);
		
		System.out.println(temp);
		
		if(a==temp)
		{
			System.out.println("Trimorphic");
		}else
		{
			System.out.println("not an trimorphic");
		}
	}

}
