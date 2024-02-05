package com.queue.demo;

import java.util.*;

public class QueueSwapLastTwoElements {

	public static void main(String[] args) {
		Queue<Integer> a = new PriorityQueue<>();

		a.add(10);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(100);
		a.add(40);
		a.add(90);
		a.add(30);

		TreeSet<Integer> a1 = new TreeSet<>(a);

		System.out.println(a1.descendingSet());

	}
}
