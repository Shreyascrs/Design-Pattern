package com.bridgelabz.designPattern.singleton;




public class Staticblockinit {

	
	private static Staticblockinit staticsingeltonobj; 
	
	
	private Staticblockinit() {
		
	}
	
	static {
		try {
			staticsingeltonobj=new Staticblockinit();
		}
		catch(Exception e)
		{
			throw new RuntimeException("error occured in creating singelton instance");
		}
	}
	
	public static Staticblockinit getInstance()
	{
	 return staticsingeltonobj;
	}
	
}
