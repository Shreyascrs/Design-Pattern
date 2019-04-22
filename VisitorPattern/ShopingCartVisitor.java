package com.bridgelabz.designPattern.VisitorPattern;

public interface ShopingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
