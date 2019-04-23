package com.bridgelabz.designPattern.MediatorPattern;

public class UserImpl extends User{

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String msg) {
		
		// TODO Auto-generated method stub
		
		System.out.println(this.name+" sending message : "+msg);
		mediator.sendMessage(msg, this);
		
	}

	@Override
	public void recive(String msg) {
	
		System.out.println("the recived message is : "+msg);
		
	}

}
