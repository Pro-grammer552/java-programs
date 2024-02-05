package com.airithmeticException;

import java.io.FileWriter;
import java.io.IOException;

public class DemoIoexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		FileWriter fw = null;
		try {
			fw = new FileWriter("abc.txt ");
			String data = "i LOVE JAVA ";
			fw.write(data);
			System.out.println("File created");
		} catch (IOException e) {
			
			System.out.println(e.getMessage());

		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
