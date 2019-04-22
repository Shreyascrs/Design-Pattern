package com.bridgelabz.designPattern.factoryPattern;

public class Computerfactory {

	public static Computer createcomputer(Computerinstance type,String ram,String hdd,String processor)
	{
		Computer comp=null;
		switch(type)
		{
		case pc:
			comp=new Pc(ram,hdd,processor);
			break;
		
		case server:
			comp=new Server(ram,hdd,processor);
			break;
			default:
				System.out.println("invaid choice");
		}
		return comp;
	}
}
