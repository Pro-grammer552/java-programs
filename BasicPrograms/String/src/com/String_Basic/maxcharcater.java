package com.String_Basic;

public class maxcharcater {
	public static void main(String[] args) {
	    char[] a = { 'a', 'B', 'C', 'D' };
	    char max = a[0];

	    for (int i = 1; i < a.length; i++) {
	        if (a[i] > max) {
	            max = a[i];
	        }
	    }

	    System.out.println(max);
}
}