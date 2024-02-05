import java.util.HashMap;

public class CountDuplicateOccurence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 2, 2, 5, 6 ,2};

		HashMap<Integer, Integer> set = new HashMap<>();
		
		for (int i : arr) {

			if (set.containsKey(i)) {
				set.put(i, set.get(i) + 1);
			} else {
				set.put(i, 1);
			}

		}
		System.out.println(set);

	}

}
