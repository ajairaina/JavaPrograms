package com.class1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// location - D:\\test.txt
		
		try {
			File file = new File("D:\\test.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}

}
