package com.class1;

import java.io.File;

public class createfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create file in d location
		//D:\test.txt
		
		try {
			File file = new File("D:\\test.txt");
			if (file.createNewFile()) {
				System.out.println("file exists");
			}else {
				System.out.println("file doesnt exist");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
		
			
		}
	}



