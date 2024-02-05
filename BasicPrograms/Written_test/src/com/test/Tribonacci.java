package com.test;

import java.util.Arrays;

public class Tribonacci {

	public static void main(String[] args) {
		int n = 11;

		int dp[] = new int[n];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;

		for (int i = 3; i < n; i++) {

			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

		}
		System.out.println(Arrays.toString(dp));

	}

}


