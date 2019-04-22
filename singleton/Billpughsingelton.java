package com.bridgelabz.designPattern.singleton;

public class Billpughsingelton {

	
	
	private Billpughsingelton()
	{
		
	}
	
	private static class Singletonhelper
	{
		private static final Billpughsingelton instance=new Billpughsingelton();
	}
	
	public static Billpughsingelton getInstance()
	{
		return Singletonhelper.instance;
	}
}
