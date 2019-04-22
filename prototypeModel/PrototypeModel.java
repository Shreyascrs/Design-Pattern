package com.bridgelabz.designPattern.prototypeModel;

import java.util.ArrayList;
import java.util.List;

public class PrototypeModel implements Cloneable {

	private List<String> emplist;

	
	public PrototypeModel()
	{
		emplist=new ArrayList<>();
	}
	
	public PrototypeModel(List<String> list)
	{
		this.emplist=list;
	}
	
	public void addData()
	{
		emplist.add("ram");
		emplist.add("bheem");
		emplist.add("soma");
		emplist.add("shyam");
		emplist.add("rajesh");
	}
	public List<String> getemplist()
	{
		return this.emplist;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp=new ArrayList<String>();
		for (String string : getemplist()) {
			temp.add(string);
		}
		return new PrototypeModel(temp);
	}
	
	
}
