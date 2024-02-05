package com.bufferoutstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferreadrerInputDemo {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(ir);
		System.out.println("Enter the Name :");
		String name = b.readLine();
		System.out.println("Enter The Age :");

		int age = Integer.parseInt(b.readLine());
		System.out.println("Name is " + name);

		System.out.println("Age is " + age);

	}

}
