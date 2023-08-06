package com.Practice;

import java.util.Scanner;

public class mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int number = 100;
		float number1 = 101.33f;
		
		float no=Math.abs(number1);  //abs = 
		System.out.println(no);*/
		
		//scanner get the input from the user 
		/*int numbers ;
		Scanner	input = new Scanner(System.in);
		System.out.println("enter a number");
		numbers = input.nextInt();
		System.out.println("the entered numbers is " + numbers);*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number:  ");
		double firstnumber = scanner.nextDouble();
		
		System.out.println("enter second number:  ");
		double secondnumber = scanner.nextDouble();
		
		double Total = firstnumber + secondnumber;
		System.out.println("Sum of two numbers is :  " + Total);
	}

}
