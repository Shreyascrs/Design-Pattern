package com.bridgelabz.designPattern.VisitorPattern;

public class Fruit implements ItemElement{

	
	private int pricePerKg;
	private int weight;
	private String name;
	
	
	public Fruit(int pricePerKg,int weight,String name)
	{
		this.pricePerKg=pricePerKg;
		this.name=name;
		this.weight=weight;
	}
	
	public int getPricePerKg()
	{
		return pricePerKg;
	}
	
	public int getWeight()
	{
		return weight;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	
	@Override
	public int accept(ShopingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
