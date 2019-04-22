package com.bridgelabz.designPattern.ProxyPattern;

public class CommanExecutorMain {
public static void main(String[] args) {
	
	CommedExecutor executor=new CommandExecutorProxy("shreyas", "shreyas");
	
		try {
			executor.runCommand("ls -l");
			executor.runCommand("rm abc.txt");
		}
		catch(Exception e)
		{
			System.out.println("Exception Message "+e.getMessage());
		}
	
}
}
