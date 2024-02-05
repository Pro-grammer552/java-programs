package Assignment07A;

public class CoDigit {

	public static void main(String[] args) {
		int n = 12334455;

		for (int i = 0; i <= 9; i++) {
			int count = 0;
			int num = n;

			while (num > 0) {
				int last = num % 10;
				if (last == i) {
					count++;
				}
				num = num / 10; 
			}
			
			if(count>0)
			{
			System.out.println(i + "  " + count);

		}

	}

}
