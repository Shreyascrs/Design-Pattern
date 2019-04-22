package com.bridgelabz.designPattern.ObserverPattern;

public interface Subject {
	
	// methods to register and unregister the observer
	public void register(Observer obj);
	
	public void unregister(Observer obj);
	
	// method to notify observers of change
	public void notifyObservers();
	
	//attach with subject to observe
	public Object getUpdate(Observer obj);
	
}
