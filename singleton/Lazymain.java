package com.bridgelabz.designPattern.singleton;

public class Lazymain {

	//to achive single ton we used three steps
	// by creating instance as private static final 
	// by making private constructor
	// by making public get instance method to get the instance and comparing if adress is not asigned going to assign and send
public static void main(String[] args) {
	Lazysingelton lazyobject1=Lazysingelton.getInstance();
	Lazysingelton lazyobject2=Lazysingelton.getInstance();
	
		// if both are same it is using only one object
	System.out.println("the 1st object of lazysingelton adress is "+lazyobject1.hashCode());
	System.out.println("the 2nd object of lazysingelton adress is "+lazyobject2.hashCode());
}
}
