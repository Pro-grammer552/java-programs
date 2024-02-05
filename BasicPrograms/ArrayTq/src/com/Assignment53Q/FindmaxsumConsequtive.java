package com.Assignment53Q;

public class FindmaxsumConsequtive {

	public static void main(String[] args) {
		int a[] = { 6, 5, 5, 7, 4 };
		//int a[]= {1,5,3};
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
			i++;
		}
		//System.out.println(sum1);

		for (int i = 1; i < a.length; i++) {

			sum2 = sum2 + a[i];
			i++;
		}
		//System.out.println(sum2);
		
		
		int res=Math.max(sum1, sum2);
		System.out.println(res);
		

	}

}
