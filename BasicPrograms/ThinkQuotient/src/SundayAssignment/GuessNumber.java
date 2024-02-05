package SundayAssignment;

import java.util.Scanner;

/*
 * write a program that takes a number as input from user. 
The key number is 4 and the user enters single digit numbers.
 Ask the user for a number till he gets the correct answer.
 Then display the number of tries it took to guess the correct number
 */

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Number = 4;
		int counter = 0;

		System.out.println("Guess the number!");

		while (true) {
			System.out.print("Enter your guess: ");
			int guess = sc.nextInt();
			
			counter++;

			if (guess == Number) {
				System.out.println("Congratulations! You guessed the correct number.");
				System.out.println("Number of tries: " + counter);
				break;
			} else {
				System.out.println("Incorrect guess. Try again.");
			}
		}

	}

}
