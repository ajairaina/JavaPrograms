package com.class1;

public class personname {

	String name;
	persondob dob;
	personplace myplace;
	
	public personname (String name, persondob dob , personplace myplace ) {
		this.name = name;
		this.dob = dob;
		this.myplace = myplace;
	}
	
	public void printdata() {
		System.out.println("name of the person: " + name );
		dob.printdob();
		myplace.printplace();
	}
	
}
