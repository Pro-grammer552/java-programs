
public class SlidingWindow {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		
		int i=0;
		int index=0;
		while(i<3)
		{
			arr[index]=arr[i];
		}
		i++;

		System.out.println(arr[index]);
	}

}
