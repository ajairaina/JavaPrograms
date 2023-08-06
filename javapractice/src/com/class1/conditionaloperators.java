package com.class1;

import java.util.Scanner;

public class conditionaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//check whether the given number is odd or even
		
		int number = 10;
		System.out.println(number%2==0 ? "even" : "odd");                    //  ?:
		
		/*// using if condition                                                   
		if(number%2==0) {
			System.out.println("given number is even");
		}else {
			System.out.println("given number is odd");
				}
		
		//to check whether he is passed the exam or not                                         35/2  
	
	/*	int Ranjith = 98;
		
		if (Ranjith>=40) {
			System.out.println("pass");
		}else {
			System.out.println("failed");
		}
		*/
		//System.out.println(Ranjith>=40 ? "passed": "failed"); 
		
		/*int a = 80;
		if (a%2==0) {
			System.out.println("The given number is even");
		}  else {
			System.out.println("The given number is odd");
		}*/
		
		int a;
		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
		
		if (a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

}
}
