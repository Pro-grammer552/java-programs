import java.util.Arrays;

public class plusone {

	public static void main(String[] args) {
		 
		int digits[]= {1,2,3};
		int l=digits[digits.length-1];
	      

	        for(int i=0;i<digits.length;i++)
	        {
	            if(digits[i]==l)
	            {
	                digits[i]+=1;
	            }
	        }
	        System.out.println(Arrays.toString(digits));

	}

}
