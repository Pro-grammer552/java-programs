package com.bufferoutstream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintstreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fs;
		PrintStream ps;
		
		try {
			fs = new FileOutputStream("print.txt");
			ps = new PrintStream(fs);
			ps.println(12);
			ps.println("Hello");
			System.out.println("File Created");
			ps.close();
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}