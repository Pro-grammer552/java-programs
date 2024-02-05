package com.comprableDemo;

//For One Way Sorting

import java.util.ArrayList;
import java.util.Collections;

public class ItemComparable implements Comparable<ItemComparable> {

	private int id;
	private String name;

	public ItemComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	ItemComparable() {

	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

//	public int compareTo(Item i) {
//
//		if (this.id == i.id)
//			return 0;
//		else if (this.id < i.id) {
//			return -1;
//		} else {
//			return 1;
//		}
//	}

	@Override
	public int compareTo(ItemComparable i) {

		if (this.name.compareTo(i.name) == 0)
			return 0;
		else if (this.name.compareTo(i.name) < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		ArrayList<ItemComparable> list = new ArrayList<ItemComparable>();

		list.add(new ItemComparable(103, "Suraj"));
		list.add(new ItemComparable(102, "Akashy"));
		list.add(new ItemComparable(101, "BAbu"));

		System.out.println("---Before Sorting---");
		for (ItemComparable o : list) {
			System.out.println(o);
		}
		Collections.sort(list);

		System.out.println("-----After Sorting By Name-----");

		for (ItemComparable o1 : list) {
			System.out.println(o1);
		}
	}

}
