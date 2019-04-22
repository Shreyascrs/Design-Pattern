package com.bridgelabz.designPattern.singleton;

public class Staticsingeltonmain {
	// to achive the singel ton we are using nested class making private static final
	// making private constructor
	// public method to get the instance
public static void main(String[] args) {
		// creation of the references to one object
	Staticblockinit staticobj=Staticblockinit.getInstance();
	Staticblockinit staticobj1=Staticblockinit.getInstance();
		// if both object pointing to same index only one onject is created
	System.out.println("the address of 1st object is "+staticobj.hashCode());
	System.out.println("the address of 2nd object is "+staticobj1.hashCode());
	
	}
}
