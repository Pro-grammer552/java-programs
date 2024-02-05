package Assignment07A;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n = 10;
	        int sum = 0;
	        int number = 1;
	        
	        while (number <= n) {
	            if (number % 2 == 0) {
	                sum += number;
	            }
	            number++;
	        }
	        
	        System.out.println("Sum of even numbers between 1 and " + n + ": " + sum);
	    

	}

}
