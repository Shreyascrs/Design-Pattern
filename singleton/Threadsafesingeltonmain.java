package com.bridgelabz.designPattern.singleton;

public class Threadsafesingeltonmain {
	// to achive the singel ton we are using nested class making private static final
	// making private constructor
	// public method to get the instance and is used inside synchronized block
public static void main(String[] args) {
	Threadsafesingelton threadsafeobject1=Threadsafesingelton.getInstance();
	Threadsafesingelton threadsafeobject2=Threadsafesingelton.getInstance();
	
	System.out.println("the address of object1 is "+threadsafeobject1.hashCode());
	System.out.println("the address of object2 is "+threadsafeobject2.hashCode());
}
}
