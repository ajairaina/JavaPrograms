package com.class1;

public class persondob {

	int day;
	String month;
	int year;
	
	public persondob(int day,String month, int year) {
		this.day = day;
		this.month= month;
		this.year = year;
	}
	
	public void printdob() {
		System.out.println("Birthday: " + day + "-" + month + "-" + year );
	}
	
}
