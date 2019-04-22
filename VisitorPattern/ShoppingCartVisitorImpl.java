package com.bridgelabz.designPattern.VisitorPattern;

public class ShoppingCartVisitorImpl implements ShopingCartVisitor{

	@Override
	public int visit(Book book) {
		int cost=0;
		
		if(book.getPrice()>50)
		{
			cost=book.getPrice()-5;
		}else
		{
			cost=book.getPrice();
		}
		System.out.println("the cost of book is : "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		// TODO Auto-generated method stub
		int cost=fruit.getPricePerKg()*fruit.getWeight();
		
		System.out.println("the price of fruit is :"+cost);
		return cost;
		
		
	}

}
