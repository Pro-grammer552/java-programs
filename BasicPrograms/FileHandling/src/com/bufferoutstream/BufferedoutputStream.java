package com.bufferoutstream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedoutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fo = null;
		BufferedOutputStream bf = null;
		
		try {
			fo = new FileOutputStream("buffer.txt");
			bf= new BufferedOutputStream(fo);
			
			String data = "I love java programming";
			byte []b = data.getBytes();
			bf.write(b);
			System.out.println("File Created");
			bf.close();
			bf.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}