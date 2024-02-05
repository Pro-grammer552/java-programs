package com.prep;

public class array3 {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4};

		int tar = 40;
		int flag = 0;
		int i;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] == tar) {
				flag = 1;

				//System.out.println(i);
			}

		}
		if (flag == 1) {
			System.out.println(i);
		}else
		{
			System.out.println("not found ");
		}

	}

}
