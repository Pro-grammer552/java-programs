package com.bufferoutstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw ;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter("bwriter");
			bw = new BufferedWriter(fw);
			fw.write("Welcome to java class");
			fw.close();
			bw.close();
			System.out.println("File created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}