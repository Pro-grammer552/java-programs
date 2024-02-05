package com.bufferoutstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferreaderdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader("bwriter");
			br = new BufferedReader(fr);
			
			int i = br.read();
			while(i != -1) {
				System.out.print((char)i);
				i = br.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}