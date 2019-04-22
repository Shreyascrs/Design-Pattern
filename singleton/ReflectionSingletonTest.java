package com.bridgelabz.designPattern.singleton;

import java.lang.reflect.Constructor;
/**
 *  to destroy the singelton object
 * @author Shreyas CR
 *
 */
public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitalization object1= EagerInitalization.getInstance();  // creating the instance
		EagerInitalization object2=null;  				// making another object to point null
		
		try {
		
			Constructor[] constructors=EagerInitalization.class.getDeclaredConstructors();  // returns all the constructor object
			for (Constructor constructor : constructors) {
				
				constructor.setAccessible(true); 					// private constructor making access as true
				object2=(EagerInitalization)constructor.newInstance();  // object2 initialization
				break;
			}
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		System.out.println("the address of object1 "+object1.hashCode());
		System.out.println("the address of object2 "+object2.hashCode());
		
	}
}
