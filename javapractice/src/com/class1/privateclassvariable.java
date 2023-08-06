package com.class1;

public class privateclassvariable {

	private int money;  // create a private
	
	public privateclassvariable(int initialamount) {  // to give constructor use same class name
		money = initialamount;
	}
	
	public void addmoney(int money) {   // help to get the input
		this.money += money;      // this denote private class name 
	}
		
	public int getmoney() {       // it will return to the output to the priavte class
		return money; 
		
	}

 
}
		
	

