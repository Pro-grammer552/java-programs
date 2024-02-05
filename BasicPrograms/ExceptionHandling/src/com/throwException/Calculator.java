package com.throwException;


import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Menu:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\nEnter your choice: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                int result = 0;

                switch (choice) {
                    case 1:
                        result = add(a, b);
                        break;
                    case 2:
                        result = sub(a, b);
                        break;
                    case 3:
                        result = multiply(a, b);
                        break;
                    case 4:
                        try {
                            result = div(a, b);
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                            return;
                        }
                        break;
                }

                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid choice");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
