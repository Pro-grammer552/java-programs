package com.Stringassignmet40;

public class fabonacci {

	public static void main(String[] args) {

		int n = 5; // Change n to the desired number of terms
//		int[] dp = new int[n + 1];
//		dp[0] = 0;
//		dp[1] = 1;
//		dp[2] = 1;
//
//		System.out.println(dp[0]);
//		System.out.println(dp[1]);
//		System.out.println(dp[2]);
//
//		for (int i = 3; i <= n; i++) {
//			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
//			System.out.println(dp[i]);

		int a = 0;
		int b = 1;
		int d = a + b;
		System.out.println(a+""+b+""+d);
		for (int i = 2; i <= n; i++) {
			System.out.println(d);
			a = b;
			b = a;
			d = b;

		}
	}

}
