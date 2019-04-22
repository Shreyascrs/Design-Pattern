package com.bridgelabz.designPattern.singleton;

public class Eagermain {
	
	//to achive single ton we used three steps
	// by creating instance as private static final
	// by making private constructor
	// by making public get instance method to get the instance
	public static void main(String[] args) {
		
	
		// object reference 1 
	EagerInitalization eager=EagerInitalization.getInstance();
	
		// object reference 2
	EagerInitalization eager1=EagerInitalization.getInstance();
	
		//if both address are same then only one object is created
	System.out.println("the address of 1st reference"+eager.hashCode());
	System.out.println("the address of 2nd reference"+eager1.hashCode());
	
	}
}
