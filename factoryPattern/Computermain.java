package com.bridgelabz.designPattern.factoryPattern;

public class Computermain {
public static void main(String[] args) {
	Computer pc=Computerfactory.createcomputer(Computerinstance.pc, "8 GB", "10 TB", "intel i7");
	Computer server=Computerfactory.createcomputer(Computerinstance.server, "32 GB", "10 TB", "intel XEON");
	Computer pc1=Computerfactory.createcomputer(Computerinstance.pc, "8 GB", "10 TB", "intel i7");
//	System.out.println(pc.toString());
//	System.out.println(server.toString());
	System.out.println(pc.hashCode());
	System.out.println(pc1.hashCode());
}
}
