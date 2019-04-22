package com.bridgelabz.designPattern.singleton;

public class EagerInitalization {
	
		//in order to maintain only one object hence called private static final
	private static final EagerInitalization eagerobject= new EagerInitalization();
	
	// if user tried to create new object it is not posible because constructor is private
	private EagerInitalization()
	{
		
	}
	
	// to return the instance
	public static EagerInitalization getInstance() {
		return eagerobject;
	}
}
