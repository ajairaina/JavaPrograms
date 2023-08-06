package com.class1;

import java.io.File;

public class Filehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can see whether the given file is there or not
		
		File file = new File("D:\\test.txt");
		
		if (file.exists()) {
			System.out.println("File is there");
		}else {
			System.out.println("file is not there");
		}
	}

}
