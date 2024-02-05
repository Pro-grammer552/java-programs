package com.bufferoutstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferinputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f = null;
		BufferedInputStream bf = null;
		
		try {
			f = new FileInputStream("buffer.txt");
			bf = new BufferedInputStream(f);
			
			int i = bf.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i = bf.read();
			}
			f.close();
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}