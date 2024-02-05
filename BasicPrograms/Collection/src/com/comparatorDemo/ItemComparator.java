package com.comparatorDemo;

//if we want to sort more than one ways

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ItemComparator {

	private int id;
	private String name;

	public ItemComparator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	ItemComparator() {

	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

	public class ItemIdComparator implements Comparator<ItemComparator> { 
		public int compare(ItemComparator i1, ItemComparator i2) {
			if (i1.id == i2.id)
				return 0;
			else if (i1.id < i2.id) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	public class ItemNameComparator implements Comparator<ItemComparator> {
		public int compare(ItemComparator i1, ItemComparator i2) {

			// Another Way
			int name = i1.name.compareTo(i2.name);

			if (name == 0)
				return 0;
			else if (name < 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<ItemComparator> list = new ArrayList<ItemComparator>();

		list.add(new ItemComparator(103, "Suraj"));
		list.add(new ItemComparator(102, "Akashy"));
		list.add(new ItemComparator(101, "BAbu"));
		
		
		System.out.println("---Before Sorting---");
		for (ItemComparator o : list) {
			System.out.println(o);
		}
		ItemComparator it = new ItemComparator();
		Collections.sort(list, it.new ItemIdComparator());

		System.out.println("-----After Sorting By Id-----");

		for (ItemComparator o1 : list) {
			System.out.println(o1);
		}

		Collections.sort(list, it.new ItemNameComparator());
		System.out.println("-----After Sorting By Name-----");

		for (ItemComparator o2 : list) {
			System.out.println(o2);
		}
	}

}
