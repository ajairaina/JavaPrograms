package com.class1;

import java.io.FileWriter;

public class Writingafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//location : "D:\\test.txt"
		try {
			FileWriter file = new FileWriter("D:\\test.txt");
			file.append("my name is ajai");
			file.close();
			
			System.out.println("successfully wrote in file");
			
			
		} catch (Exception e) {
			System.out.println("Error");
		}

}
}
