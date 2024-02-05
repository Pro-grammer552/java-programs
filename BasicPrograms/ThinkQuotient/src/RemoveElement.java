import java.util.HashSet;

public class RemoveElement {

	public static void main(String[] args) {

		int t = 3;

		HashSet<Integer> h = new HashSet<Integer>();

		int arr[] = { 3,2,2,3 };
		for (int i = 0; i < arr.length; i++) {
			h.add(arr[i]);
		}
		System.out.println(h);
		
		if(h.contains(t))
		{
			h.remove(t);
		}
		
		
		System.out.println(h);

	}

}
