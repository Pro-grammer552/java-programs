/*
 * An array contains strings of different lengths. e.g. 
 * { ‘I’ , ‘am’ , ‘very’ , ‘smart’ }.Write a 
program such that array will contain all strings of same length, 
output – { ‘Iam’ , ‘ver’ , ‘ysm’ , ‘art’ } 
if array does not contain sufficient characters , replace last chars by # 
e.g. { ‘I’ , ‘like’ , ‘programming’} output { ‘Ilikep’ , ‘rogram’ , ‘ming##’ } 
 */
//length
//length/2
//




package com.String_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class AdjustStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of strings: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume the newline

		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			a[i] = scanner.nextLine();
		}

		scanner.close();

		String[] r = adjustStrings(a);
		System.out.println(Arrays.toString(r));
	}

	public static String[] adjustStrings(String[] a) {
		StringBuilder c = new StringBuilder();
		for (String s : a) {
			c.append(s);
		}
		int t = c.length();
		int n = a.length;
		int l = (t + n - 1) / n;

		String[] r = new String[n];
		int i = 0;
		int s = 0;

		for (String x : a) {
			r[i++] = c.substring(s, Math.min(s + l, t));
			s += l;
		}

		int h = l * n - t;
		if (h > 0) {
			r[n - 1] += "#".repeat(h);
		}

		return r;
	}
}