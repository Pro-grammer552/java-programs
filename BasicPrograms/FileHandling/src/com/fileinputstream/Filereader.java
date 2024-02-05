package com.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;

		fis = new FileInputStream("Data.txt");

		int i = fis.read();

		while (i != -1) {
			System.out.println((char) i);
			i = fis.read();
		}

		//System.out.println((char) i);

		fis.close();

	}

}
