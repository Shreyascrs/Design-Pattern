package com.bridgelabz.designPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
	
	
	private List<User> users;
	
	public void CharMediatorImpl() {
		// TODO Auto-generated method stub

		this.users=new ArrayList<>();
	}
		

	@Override
	public void addUser(User user) {
		this.users.add(user);
		
	}

	

	@Override
	public void sendMessage(String msg, User user) {
		
		for (User u : this.users) {
			
			if(u!=user)
			{
				u.recive(msg);
			}
		}
		
	}

}
