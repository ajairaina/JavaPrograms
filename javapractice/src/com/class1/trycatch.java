package com.class1;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 =scan.nextInt();
		
		System.out.println(number1/number2);
}catch (Exception e) {
	System.out.println("Dont divide the number by zero");
}
	}

}
