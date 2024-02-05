package Assignment07A;

public class Automarphic {

	public static void main(String[] args) {
		
		int n=5;
		int dig=0;
		int num=n;
		int sqr=n*n;
		int c=0;
		while(n>0)
		{
		 dig= dig %10;   ///get rem
		 n=n/10; //remove
		 c++;
		 System.out.println(c);
		}
		System.out.println(c);
		int a=sqr%(int)Math.pow(10, c);
		
		System.out.println(a);
		if(num==a)
		{
			System.out.println("automorphic");
		}else
		{
			System.out.println("not automorphic");
		}

	}

}
