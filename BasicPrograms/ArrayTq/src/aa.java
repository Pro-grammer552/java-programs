import java.util.Arrays;

public class aa {

	public static void main(String[] args) {
//		int[] arr = { 10, 20,20,10,10,30,50,10,20 };
//
//		int num = 9;
//
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j]== -1){
//					continue;
//				}
//				if (arr[i] == arr[j] && i!=j) {
//					count++;
//					arr[j] = -1;
//				}
//				
//				
//				
//
//			}
//			
//			
//			System.out.println(arr[i] + " " + count);
//			System.out.println(count/2);	
//			
//			
//		}

		int[] arr = { 4, 5, 3, 7, 2 };

		// 3,2,4,5,7

		int arr1[] = new int[arr.length];

		int a = arr1.length / 2;

		for (int i = 0; i < arr.length; i++) {
			arr1[a] = arr[i];

			if (arr[i] != a) {

				if (arr1[a] < arr[i])
					arr1[i] = arr[i];
			}
		}

//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=a)
//			{
//				arr1[a]=arr[i];
//			}
//		}

		// System.out.println(Arrays.toString(arr1));

		// 3,2,4,5,7
//		 public static List<Integer> quickSort(List<Integer> arr) {
//			    if (arr.size() <= 1) {
//			        return arr;
//			    }
//
//			    int midIndex = arr.size() / 2;
//			    int midValue = arr.get(midIndex);
//
//			    List<Integer> left = new ArrayList<>();
//			    List<Integer> right = new ArrayList<>();
//
//			    for (int i = 0; i < arr.size(); i++) {
//			        if (i != midIndex) {
//			            if (arr.get(i) <= midValue) {
//			                left.add(arr.get(i));
//			            } else {
//			                right.add(arr.get(i));
//			            }
//			        }
//			    }
//
//			    List<Integer> sortedList = new ArrayList<>();
//			    sortedList.addAll(quickSort(left));
//			    sortedList.add(midValue);
//			    sortedList.addAll(quickSort(right));
//
//			    return sortedList;
//			}

//		        Scanner scanner = new Scanner(System.in);
//		        
//		        System.out.print("Enter a number: ");
//		        int number = scanner.nextInt();

		//int number = 17;
	int number = 40;
		//int number = 60;
	
		int sum = 0;
		for (int i = 2; i <= number; i++) {
		    while (number % i == 0) {
		        sum += i;
		        number /= i;
		    }
		}

		System.out.println(sum);
		
		
//		public static int sumOfPrimeFactors(int num) {
//		    int sum = 0;
//		    
//		    for (int i = 2; i <= num; i++) {
//		        while (num % i == 0) {
//		            sum += i;
//		            num /= i;
//		        }
//		    }
//		    
//		    return sum;
//		}

		
		
		

	}

}














