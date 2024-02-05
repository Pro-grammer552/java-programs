package com.assignment25N;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); 

        
        

        String[] names = new String[10];

        
      //  int len=names.length;
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("Names entered:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
