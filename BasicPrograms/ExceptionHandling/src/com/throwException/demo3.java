package com.throwException;

import java.io.IOException;

public class demo3 {

	void m1() throws IOException, ClassNotFoundException {
		System.out.println("Error...........");
	}

	void m2() throws IOException, ClassNotFoundException

	{
		m1();
	}

	void m3() {

		try {
			m2();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("End");

	}

	public static void main(String[] args) {

		demo3 d = new demo3();

		d.m3();

	}

}
