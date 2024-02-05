import java.util.ArrayList;
import java.util.Iterator;


public class RemoveDays {

	public static void main(String[] args) {
		ArrayList<String> day = new ArrayList<>();

		// Add 7 days to the list
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		day.add("Sunday");

		System.out.println(day);
		Iterator<String> iterator = day.iterator();
		while (iterator.hasNext()) {
			String d = iterator.next();
			if (d.length() > 7) {
				iterator.remove();
			}
		}
		System.out.println(day);

	}

}
