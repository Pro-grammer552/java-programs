package com.queue.demo;

import java.util.*;

public class MyDemoQueue implements Comparable<MyDemoQueue> {

	private int value;

	public MyDemoQueue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {

		Queue<MyDemoQueue> q = new PriorityQueue<>();

		q.add(new MyDemoQueue(50));
		q.add(new MyDemoQueue(40));
		q.add(new MyDemoQueue(20));
		q.add(new MyDemoQueue(10));
		q.add(new MyDemoQueue(70));
		q.add(new MyDemoQueue(20));
		q.add(new MyDemoQueue(30));

		List<MyDemoQueue> sortedList = new ArrayList<>(q);
		Collections.sort(sortedList);

		System.out.println(sortedList);

	}

	@Override
	public int compareTo(MyDemoQueue other) {
		// return Integer.compare(this.value, other.value);
		return this.value - other.value;

	}

	@Override
	public String toString() {
		return "MyDemoQueue [value=" + value + "]";
	}
}
