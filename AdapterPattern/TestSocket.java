package com.bridgelabz.designPattern.AdapterPattern;

public class TestSocket {
public static void main(String[] args) {
	
	testclassadaptor();
	testobjectadaptor();
	System.out.println("enter the choice 1 for mobile");
	
}

public static void testobjectadaptor() {
	// TODO Auto-generated method stub
	SocketAdaptor socketclass=new SocketClassAdaptorImplementation();
	Volt v3=socketclass.get3volt();
	Volt v12=socketclass.get12volt();
	Volt v120=socketclass.get120volt();
	
	System.out.println("v3 volts using class adaptor output  : "+v3.getVolt()+" volts ");
	System.out.println("v3 volts using class adaptor output  : "+v12.getVolt()+" volts ");
	System.out.println("v3 volts using class adaptor output  : "+v120.getVolt()+" volts ");
	System.out.println( );
}

public static void testclassadaptor() {
	// TODO Auto-generated method stub
	
	SocketAdaptor socketobject=new SocketObjectAdapterImplementation();
	
	Volt v3=socketobject.get3volt();
	Volt v12=socketobject.get12volt();
	Volt v120=socketobject.get120volt();
	System.out.println();
	System.out.println("v3 volts using object adaptor output  : "+v3.getVolt()+" volts ");
	System.out.println("v3 volts using object adaptor output  : "+v12.getVolt()+" volts ");
	System.out.println("v3 volts using object adaptor output  : "+v120.getVolt()+" volts ");
	
	
	}

}

