import java.util.Arrays;

public class reverseAray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			  ans[i] = nums[nums.length - 1 - i];
        
		}
		System.out.println(Arrays.toString(ans));
	}
}
