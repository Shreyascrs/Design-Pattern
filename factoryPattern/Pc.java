package com.bridgelabz.designPattern.factoryPattern;

public class Pc implements Computer {

	private String ram;
	private String hdd;
	private String processor;
	
	
	public Pc(String ram, String hdd, String processor) {
		
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
	public String toString() {
		return "Pc [ram=" + ram + ", hdd=" + hdd + ", processor=" + processor + "]";
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

	

}
