package com.characterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fileinputstream.Filereader;

public class filereaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;

		fr = new FileReader("Welcome.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
		fr.close();

	}

}
