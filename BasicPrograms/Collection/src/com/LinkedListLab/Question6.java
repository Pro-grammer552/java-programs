package com.LinkedListLab;

import java.util.LinkedList;
import java.util.ListIterator;

public class Question6 {

	int id;
	String fname;
	String iname;
	int mark;

	public Question6(int id, String fname, String iname, int mark) {
		super();
		this.id = id;
		this.fname = fname;
		this.iname = iname;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Question6 [id=" + id + ", fname=" + fname + ", iname=" + iname + ", mark=" + mark + "]";
	}

	public static void main(String[] args) {

		LinkedList<Question6> q = new LinkedList<Question6>();

		q.add(new Question6(101, "Suraj", "Reddy", 100));
		q.add(new Question6(102, "Suraj", "Reddy", 200));
		q.add(new Question6(103, "abc", "xyz", 300));
		q.add(new Question6(104, "aaa", "bbb", 400));
		q.add(new Question6(105, "ccc", "ddd", 500));

		for (int i = 0; i < q.size(); i++) {
			for (int j = i + 1; j < q.size(); j++) {

				if (q.get(i).fname.equals(q.get(j).fname) && i != j) {
					System.out.println(q.get(i));
					System.out.println(q.get(j));

				}
			}
		}
//question no.7
		
//		ListIterator<Question6> itr = q.listIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

	}

}
