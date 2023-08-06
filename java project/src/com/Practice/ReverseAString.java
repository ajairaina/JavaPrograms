package com.Practice;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a string , palidrome
		
		String word = "ABCD";
		String Word1 = "";
		
		for(int i=word.length()-1;i>=0;i++) {
			Word1 = Word1 + word.charAt(i);
			
	}System.out.println(Word1);

	}
}