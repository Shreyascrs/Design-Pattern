package com.bridgelabz.designPattern.singleton;

public class Enummain {
public static void main(String[] args) {
	Singleton object1=Singleton.getinstance();
	Singleton object2=Singleton.getinstance();
	
	System.out.println(object1.hashCode());
	System.out.println(object2.hashCode());
}
}
