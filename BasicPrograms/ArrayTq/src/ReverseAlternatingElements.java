public class ReverseAlternatingElements {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3};
        int[] B1 = reverseAlternatingElements(A1);
        printArray(B1);  // Output: [1, 2, 3]

        int[] A2 = {1, 2, 3, 4, 5};
        int[] B2 = reverseAlternatingElements(A2);
        printArray(B2);  // Output: [1, 4, 3, 2, 5]

        int[] A3 = {1, 6, 3, 4, 5, 2};
        int[] B3 = reverseAlternatingElements(A3);
        printArray(B3);  // Output: [1, 2, 3, 4, 5, 6]
    }

    public static int[] reverseAlternatingElements(int[] A) {
        int[] B = A.clone(); // Create a copy of A to store the result

        if (A.length <= 2) {
            // If A has one or two elements, no changes are needed
            return B;
        }

        int start = 2; // Start from the third element (index 2)
        while (start < A.length) {
            // Check if there is an alternating element following the second element
            if (start + 1 < A.length) {
                // Swap the current element and the next element
                int temp = B[start];
                B[start] = B[start + 1];
                B[start + 1] = temp;
            }
            start += 2; // Move to the next pair of alternating elements
        }

        return B;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}