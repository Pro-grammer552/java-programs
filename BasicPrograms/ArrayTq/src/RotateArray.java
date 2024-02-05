import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int k = 3;
		int first = arr[0];
		int arr1[] = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = first;
		System.out.println(Arrays.toString(arr));
	}

}
