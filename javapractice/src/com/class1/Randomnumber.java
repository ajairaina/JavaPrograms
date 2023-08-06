package com.class1;

import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// role a dice for five numbers
		
		Random ran = new Random();
		for(int i=1;i<=8;i++) {
			System.out.println(ran.nextInt(100) + 1);
		}
	}

}
