import java.util.Scanner;

/*
 
2. Write a function that returns the number of ways a 
person can climb n stairs, where the person may only climb 1 or 2 steps at a time.
To illustrate, if n = 4 there are 5 ways to climb:
[1, 1, 1, 1]
[2, 1, 1]
[1, 2, 1]
[1, 1, 2]
[2, 2]
Examples:
Ways(1) ➞ 1
Ways(2) ➞ 2
Ways(5) ➞ 8
A staircase of height 0 should return 1.
 */

public class Staircase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		Integer[] way = new Integer[a + 1];
		way[0] = 1;
		way[1] = 1;

		for (int i = 2; i <= a; i++) {
			way[i] = way[i - 1] + way[i - 2];
		}

		System.out.println(way[a]);
	}
}

