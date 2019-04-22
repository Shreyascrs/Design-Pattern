package com.bridgelabz.designPattern.singleton;

public class Threadsafesingelton {

private static Threadsafesingelton instance;
	
	private Threadsafesingelton()
	{
		
	}
	
	public static Threadsafesingelton getInstance()
	{
		
			synchronized (Threadsafesingelton.class) {
				if(instance==null)
				{
					instance=new Threadsafesingelton();		
				}
	
		return instance;
		
	}
	}
}
