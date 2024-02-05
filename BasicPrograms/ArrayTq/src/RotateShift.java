import java.util.Arrays;

public class RotateShift {
//5674

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7 };
		int[] arr1 = new int[arr.length];
		int first = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr1[i] = arr[i + 1];
		}
		arr1[arr.length - 1] = first;
		System.out.println(Arrays.toString(arr1));

	}

}
