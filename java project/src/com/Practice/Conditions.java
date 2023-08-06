package com.Practice;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if conditions
		
		/* int pen =10;
		int cost=90;
		if (cost>pen) {
			System.out.println("you can buy the pen");
		}else {
			System.out.println("you can't buy the pen");
		}
			
		// we can get the amount from the user
		int pencil=10;
		int amount;
		Scanner input = new Scanner(System.in);
		amount=input.nextInt();
		
		if (amount>pencil) {
			System.out.println("you can buy the pencil");
		}else {
			System.out.println("you can't buy the pencil");
		}
			*/
		//two pens in the shop
		int pen1 = 10;
		int pen2 = 20;
		int amnt =35;
		
		if (amnt>pen2) {
			System.out.println("Buy the pen2");
		}else if (amnt>pen1) {                      // if we have two condtions use elseif
			System.out.println("buy the pen1");
		}else {
			System.out.println("you can buy the pen");
		}
		
		String questions = "black pen";
		String answers = "blue pen";
		String student = "Ajai";
		if (student.endsWith(questions)) {
		System.out.println("you can " + "use black pen");	
		}else {
			
			System.out.println("you can "+ "use blue pen");
			
		}
	}

}
