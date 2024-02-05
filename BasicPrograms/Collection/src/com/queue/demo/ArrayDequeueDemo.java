package com.queue.demo;

import java.util.*;

public class ArrayDequeueDemo {

	public static void main(String[] args) {

		ArrayDeque<Integer> q = new ArrayDeque<>();

		q.add(10);
		q.add(30);
		q.add(600);
		q.add(70);
		q.add(60);
		q.add(50);
		q.add(30);

		System.out.println("Initial Deque: " + q);

		q.addFirst(100);
		System.out.println("After adding 100 to the front: \n" + q);

		q.offerFirst(20);
		System.out.println("After offering 20 to the front: \n" + q);

		q.removeFirst();
		System.out.println("After removing the first element: \n" + q);

		q.removeLast();
		System.out.println("After removing the last element: \n" + q);

		q.addLast(30);
		System.out.println("After adding 30 to the back: \n" + q);
	}
}
