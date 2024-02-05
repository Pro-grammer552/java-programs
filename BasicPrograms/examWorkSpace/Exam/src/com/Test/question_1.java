package com.Test;
import java.util.Arrays;
import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {

		int arr1[] = {4,6,12,8,3};
		int arr2[] = {2,7,1,9,5,8};
		
		if ( arr2.length % 2 == 0 ) {
			int mid = arr2.length/2;
			int count = 0;
			int ans1[] = new int[arr2.length];
			
			for ( int i=mid ; i< arr2.length ; i++) {
				ans1[count] = arr2[i];
				count++;
			}
			
			System.out.println(Arrays.toString(ans1));
			for ( int i=0 ; i< mid ; i++) {
				ans1[count] = arr2[i];
				count++;
			}
			System.out.println(Arrays.toString(ans1));
		}
		if ( arr1.length % 2 != 0 ){
			int mid = arr1.length/2;
			int count1 = 0;
			int ans2[] = new int[arr1.length];
			
			for ( int i=(mid+1) ; i< arr1.length ; i++) {
				ans2[count1] = arr1[i];
				count1++;
			}
			System.out.println(Arrays.toString(ans2));
			ans2[count1++] = arr1[mid];
			System.out.println(Arrays.toString(ans2));
			
			for ( int i=0 ; i< mid ; i++) {
				if ( count1 == 5) {
					continue;
				}
				ans2[count1] = arr1[i];
				count1++;
			}
			System.out.println(Arrays.toString(ans2));
		}
		
	}

}