package com.prep;

/*
 *
Q 5)Array Compatiblilty
Two arrays are said to be compatible if they are of the same size and 
if the ith element in the first array is greater than or equal 
to the ith element in the second array for all i elements.If the
 array size is zero or lesser then display the message
  "Invalid array size".Write a Java program to
   find whether 2 arrays are compatible or not.
   If the arrays are compatible display the message 
   as "Arrays are Compatible" ,
if not then display the message as "Arrays are Not Compatible".
Sample Input 1:
Enter the size for First array:
5
Enter the elements for First array:
5
14
17
19
15
Enter the size for Second array:
5
Enter the elements for Second array:
2
5
9
15
7
Sample Output 1:
Arrays are Compatible

 */
public class aa {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6,8};
		int arr1[] = {1, 2, 3, 4, 5, 6,9};

	    if (arr.length <= 0 || arr1.length <= 0) {
	        System.out.println("Invalid array size");
	    } else if (arr.length != arr1.length) {
	        System.out.println("Arrays are not compatible");
	    } else {
	        boolean compatible = true;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < arr1[i]) {
	                compatible = false;
	                break;
	            }
	        }

	        if (compatible) {
	            System.out.println("Arrays are compatible");
	        } else {
	            System.out.println("Arrays are not compatible");
	        }
	    }
	}
}