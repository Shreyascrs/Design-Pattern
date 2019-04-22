package com.bridgelabz.designPattern.ObserverPattern;

public interface Observer {

	// method to update the observer
	public void update();
	
	
	//attach with subject to observer
	public void setSubject(Subject sub);
}
