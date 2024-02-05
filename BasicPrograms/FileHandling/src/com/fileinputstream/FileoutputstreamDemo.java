package com.fileinputstream;

//only write opertaion 

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputstreamDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;

		fos = new FileOutputStream("Data.txt");

		String data = "Hello";  //if we will change content it will override and replace the file content
		//fis = new FileOutputStream("Data.txt",true);  // if you dont want to remove previous content u should use true ;

		byte arr[] = data.getBytes();

		fos.write(arr);

		System.out.println("File created");

	}

}
