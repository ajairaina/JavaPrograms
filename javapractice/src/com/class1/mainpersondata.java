package com.class1;

public class mainpersondata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persondob bday =new persondob(25,"june", 1996);
		personplace place = new personplace("chennai");
		personname name = new personname("Ajai", bday,place);
		
		name.printdata();
	
	}

}
