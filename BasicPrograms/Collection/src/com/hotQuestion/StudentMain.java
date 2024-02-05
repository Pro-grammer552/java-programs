package com.hotQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * create class student having collge name and
 *  course student can enroll one or more course

1)studentRain create arrayList that will store whole arrayList 
2)display count the number of course having the student and store it in hashMap<Student, Count>
 */

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		String c1[] = { "java", "sql", "Adv.java" };
		String c2[] = { "Manul T", "Agile", "Java", "sql" };
		String c3[] = { "html", "css", "js" };

		al.add(new Student(1, "Ram", c1));
		al.add(new Student(3, "Raju", c2));
		al.add(new Student(2, "Machha", c1));
		al.add(new Student(4, "machhi", c3));
		al.add(new Student(5, "Rahul", c2));

		HashMap<Student, Integer> h = new HashMap<Student, Integer>();

		for (int i = 0; i < al.size(); i++) {
			String[] s = al.get(i).getCourse();
			int count = s.length;

			h.put(al.get(i), count);
		}

		Iterator<Map.Entry<Student, Integer>> itr = h.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Student, Integer> keys = itr.next();
			System.out.println(keys.getKey() + " " + keys.getValue());

		}

	}

}
