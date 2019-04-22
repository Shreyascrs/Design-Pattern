package com.bridgelabz.designPattern.singleton;

public class Lazysingelton {

	private static Lazysingelton instance;
	
	private Lazysingelton()
	{
		
	}
	
	public static Lazysingelton getInstance()
	{
		if(instance==null)
		{
			instance=new Lazysingelton();
		}
		return instance;
	}
}
