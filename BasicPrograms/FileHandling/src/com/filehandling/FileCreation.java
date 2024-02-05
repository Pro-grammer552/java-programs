package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {

		File f = new File("Abc.txt");

		boolean test = f.createNewFile();

		System.out.println("File created");

		System.out.println("File redable :" + f.canRead());
		System.out.println("File present :" + f.exists());
		System.out.println("File PAth :" + f.getAbsolutePath());
		System.out.println("File length :" + f.length());
		System.out.println("File NAme :" + f.getName());


		
		if (f.exists()) {
			System.out.println("file found ");
		} else {
			System.out.println("not Found");
		}

//		System.out.println(f.delete());
//
//		if (f.exists()) {
//			System.out.println("file found ");
//		} else {
//			System.out.println("not Found");
//		}
	}

}
