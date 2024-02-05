
/*
 * Denomination problem - 
There are notes of 1000, 500, 200,100,50,20 and 10. 
You need to distribute given amount in such a way that minimum number of notes are given. 
e.g. If amount to be given is 540 - then 500 -->1 note , 20-->2 notes 
if amount is
 8930 --> 1000--> 8 notes  500-->1 note 200-->2 notes  20 --> 1 note 10 --> 1 note
 */
public class NotesProblem {

	public static void main(String[] args) {
		int amount = 8260;
		int maxval = 0;
		int totalCount = 0;
		int[] arr = { 1000, 500, 200, 100, 50, 20, 10 };

		System.out.println(amount);

		for (int i = 0; i < arr.length; i++) {
			if (amount < arr[i]) {
				continue;
			}
			maxval = arr[i];

			int count = amount / maxval;

			amount = amount % maxval;

			System.out.println(maxval + " " + "notes" + count);

			totalCount = totalCount + count;

		}

		System.out.println("Total count: " + totalCount);
	}
}
