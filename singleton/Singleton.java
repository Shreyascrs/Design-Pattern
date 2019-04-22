package com.bridgelabz.designPattern.singleton;

public enum Singleton {

	 instance;
//	private Singleton()
//	{
//		
//	}
	public static Singleton getinstance()
	{
		return instance;
	}
}
