import java.util.PriorityQueue;
import java.util.TreeSet;

public class kthlargest {

	public static void main(String[] args) {

		int nums[] = { 3, 2, 1, 5, 6, 5 };
		int k = 3;
		TreeSet<Integer> a1 = new TreeSet<>();
		for (int x : nums) {
			a1.add(x);
		}
		System.out.println(a1);

		if (a1.size() > k) {
			a1.pollFirst();
		}
		System.out.println(a1);
	}
}
