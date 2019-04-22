package com.bridgelabz.designPattern.singleton;

public class Billpughmain {

	//to achive single ton we used three steps
	// to achive the singel ton we are using nested class making private static final
	// making private constructor
	// public method to get the instance
public static void main(String[] args) {
	
	Billpughsingelton object1=Billpughsingelton.getInstance();
	Billpughsingelton object2=Billpughsingelton.getInstance();
	
	// if both the references same it is using same object
	System.out.println("the address of object1 is "+object1.hashCode());
	System.out.println("the address of object2 is "+object2.hashCode());
}
}
