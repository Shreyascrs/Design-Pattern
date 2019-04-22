package com.bridgelabz.designPattern.prototypeModel;

import java.util.List;

public class PrototypeMain {
public static void main(String[] args) throws CloneNotSupportedException {
	PrototypeModel p=new PrototypeModel();
	p.addData();
	
	PrototypeModel object1=(PrototypeModel) p.clone();
	PrototypeModel object2=(PrototypeModel)p.clone();
	
	List<String> list1=object1.getemplist();
	List<String> list2=object2.getemplist();
	
	list1.add("hello");
	list2.remove("ram");
	
	System.out.println(list1);
	System.out.println(list2);
	
}
}
