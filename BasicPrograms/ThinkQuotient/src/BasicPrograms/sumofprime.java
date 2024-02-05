package BasicPrograms;

public class sumofprime {

	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 2; i <=10; i++) {
//			boolean a = false;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					a = true;
//				}
//			}
//
//			if (!a) {
//				
//				System.out.println(i);
//				sum = sum + i;
//			}
//
//		}
//		System.out.println(sum);

		for (int i = 0; i <= 10; i++) {
			
			
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
//			System.out.println(sum);
		}

	}

}
