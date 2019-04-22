package com.bridgelabz.designPattern.factoryPattern;

public class Server implements Computer {
	
	private String ram;
	private String hdd;
	private String processor;
	
	
	

	

	public Server(String ram, String hdd, String processor) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.processor = processor;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getProcessor() {
		// TODO Auto-generated method stub
		return this.processor;
		
		
}

	@Override
	public String toString() {
		return "Server [ram=" + ram + ", hdd=" + hdd + ", processor=" + processor + "]";
	}
}