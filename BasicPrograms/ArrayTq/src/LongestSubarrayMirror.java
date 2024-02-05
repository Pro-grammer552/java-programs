
public class LongestSubarrayMirror {

	public static void main(String[] args) {
	    int arr[] = {1, 1, 1, 0, 0, 0, 1, 0};

	    int count1 = 0;
	    int count2 = 0;
	    int max = 0;
	    int currentMax = 0;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == 1) {
	            count1++;
	            count2 = 0; // Reset count2 when 1 is encountered
	        } else if (arr[i] == 0) {
	            count2++;
	            count1 = 0; // Reset count1 when 0 is encountered
	        }

	        
	        currentMax = Math.max(count1, count2);

	        if (currentMax > max) {
	            max = currentMax;
	        }
	    }

	    System.out.println(max);
	}
}
