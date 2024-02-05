
import java.util.Arrays;

public class DescendingAscendingArray {

//	public static void main(String[] args) {
//		int[] arr = { 9, 4, 12, 4, 8, 7, 10 };
//
//		int i = 0, j, len = arr.length;
//
//		for (i = 0; i < len / 2; i++) {
//			for (j = i + 1; j < len / 2; j++) {
//				if (arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//
//		for (i = len / 2; i < len - 1; i++) {
//			for (j = i + 1; j < len; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		public static void main(String[] args) {
		    int[] arr = {1,2,3,4,5,6};
		    int i, j, len = arr.length;

		    for (i = 0; i < len / 2; i++) {
		        for (j = i + 1; j < len / 2; j++) {
		            if (arr[i] > arr[j]) {
		                int temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		            }
		        }
		    }

		 
		    for (i = len / 2; i < len - 1; i++) {
		        for (j = i + 1; j < len; j++) {
		            if (arr[i] < arr[j]) {
		                int temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		            }
		        }
		    }

		
		    for (i = 0; i < len; i++) {
		        System.out.print(arr[i] + " ");
		    }
		}
}

		
