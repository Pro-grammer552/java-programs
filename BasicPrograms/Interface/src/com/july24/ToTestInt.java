package com.july24;

/*
 2.	Write a program to create interface named test. 
 In this interface the member function is square. Implement this interface in arithmetic class.
  Create one new class called ToTestInt in this class use the object of arithmetic class.
 */



interface Test {
 void square();
}

class Arithmatic implements Test {
 @Override
 public void square() {
     int n = 10;
     int result = n * n;
     System.out.println("Square of " + n + " is: " + result);
 }
}





public class ToTestInt {
 public static void main(String[] args) {
     Arithmatic a = new Arithmatic();
     a.square(); //  100
 }
}
