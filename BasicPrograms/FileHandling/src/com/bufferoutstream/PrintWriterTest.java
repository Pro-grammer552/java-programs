package com.bufferoutstream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {//file
			PrintWriter pw = new PrintWriter("Writerfile.txt");
			pw.write("this is file using pw");
			pw.close();
			System.out.println("File created");
	      // console
			PrintWriter pw1 = new PrintWriter(System.out);
			pw1.write("msg in console");
			pw1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}