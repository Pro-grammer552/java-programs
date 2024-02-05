package com.assignment50;

import java.util.Arrays;

public class leftrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		int n = arr.length;
		int ans[] = new int[arr.length];

		for (int i = 0; i < n; i++) {
			ans[i] = arr[(i + d) % n];
		}

		System.out.println(Arrays.toString(ans));
		
		for(int a:ans)
		{
			System.out.println(a);
		}
	}

}
