package com.Assignment53Q;

//14.	WAP to print all unique elements in the array.

public class UniqueElement {

	public static void main(String[] args) {

		int n[] = new int[] { 0, 0, 30, 40, 50, 50, 50 };

		int ne[] = new int[n.length];
		int i=0;
		int j=0;
		for ( i = 0; i < n.length; i++) {

			for ( j = i + 1; j < n.length; j++) {
				if (n[i] != n[j]) {
					ne[i]= n[i];
				}

				
			}
			if(ne[i]!= '\0')
			{
				
				System.out.println(ne[i]);
				
			}
			
			
		}
	}

}
