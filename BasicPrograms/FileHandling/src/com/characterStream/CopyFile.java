package com.characterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		System.out.println("\n--------------------------------");
		System.out.println("----COpy Data into another File-------------");
		
		FileWriter c = null;
		FileReader r = null;

		c = new FileWriter("C:\\Users\\hp\\Desktop\\DemoFolder\\WelcomeCopy.txt");

		r = new FileReader("C:\\Users\\hp\\Desktop\\DemoFolder\\Welcome.txt");
		int i = r.read();
		String s = "";
		while (i != -1) {
			s += (char) i;

			i = r.read();
		}
		System.out.println("Successfully copied");
		c.write(s);

		c.close();

	}

}
