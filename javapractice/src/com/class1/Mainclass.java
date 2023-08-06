package com.class1;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass1 sc1 = new subclass1();
		sc1.name("my name is Ajai and my age is ",90); //giving arguements in parameters
		
		privateclassvariable cls = new privateclassvariable(200);   //object create to access from one class to another class
		//cls.money = 50;     // it became error because of private class
		
		cls.addmoney(14);
		cls.addmoney(35);
		cls.addmoney(80);
		
		System.out.println("total amount of money is " + cls.getmoney());
		functionoverloading cricket = new functionoverloading();
		cricket.run();
		cricket.run(100);
	}

	

}
