import java.util.Arrays;

public class Leftrotataion {
	/*
	 * Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int k = 3;
		    int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		    int[] ans=new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            ans[(i+k)%nums.length]=nums[i];//(0+3)%7=3 ans[3]=num[i]
	         
	            System.out.println(Arrays.toString(ans));
	        }
	        for(int i=0; i<ans.length; i++){
	            nums[i]=ans[i];
	        }
		    System.out.println(Arrays.toString(nums));
		    //System.out.println(Arrays.toString(arr3));
		}
}
