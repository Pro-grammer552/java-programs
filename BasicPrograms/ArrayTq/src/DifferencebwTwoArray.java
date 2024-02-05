import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifferencebwTwoArray {

	// Output: [[3],[]]
	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 3 };
		int nums2[] = { 1, 1, 2, 2 };

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		HashSet<Integer> set3 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
			set3.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		set1.removeAll(set2);
		set2.removeAll(set3);

		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>(set1));
		result.add(new ArrayList<>(set2));

		System.out.println(result);
	}
}