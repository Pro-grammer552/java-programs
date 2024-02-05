package com.assignment50;

import java.util.Scanner;

public class WorkoutTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter the duration of your workout (in minutes): ");
        double duration = scanner.nextDouble();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("\nSelect an activity:");
        System.out.println("1. Running");
        System.out.println("2. Cycling");
        System.out.println("3. Swimming");
        int choice = scanner.nextInt();

        double caloriesBurned = calculateCaloriesBurned(choice, weight, duration);
        double bmi = calculateBMI(weight, height);

        System.out.println("\nResults:");
        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("BMI: " + bmi);
        scanner.close();
    }

    public static double calculateCaloriesBurned(int choice, double weight, double duration) {
        double caloriesPerMinute = 0;

        switch (choice) {
            case 1:
                caloriesPerMinute = 10;
                break;
            case 2:
                caloriesPerMinute = 8;
                break;
            case 3:
                caloriesPerMinute = 12;
                break;
        }

        return caloriesPerMinute * duration;
    }

    public static double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
}
