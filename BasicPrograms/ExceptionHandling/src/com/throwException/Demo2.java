package com.throwException;

//using throw and throws

import java.io.IOException;

public class Demo2 {

	public static void throwException(int age) throws IOException {
		if (age < 40) {
			throw new IOException("not eligible");
		} else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwException(15);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
