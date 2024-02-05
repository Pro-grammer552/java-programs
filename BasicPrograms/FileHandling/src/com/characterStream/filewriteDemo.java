package com.characterStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewriteDemo {

	public static void main(String[] args) throws IOException {

		FileWriter f = null;

		f = new FileWriter("C:\\Users\\hp\\Desktop\\DemoFolder\\Welcome.txt");
		String data = "Hello MY NAme Is Suraj";
		f.write(data);
		f.close();
		System.out.println("File created Successfully...........");

		System.out.println("---------file_Read-------");

		FileInputStream fis = null;

		fis = new FileInputStream("C:\\Users\\hp\\Desktop\\DemoFolder\\Welcome.txt");

		int i = fis.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fis.read();
		}
		fis.close();

	}

}
