package com.bridgelabz.designPattern.ProxyPattern;

public class CommandExecutorImpl implements CommedExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		
		Runtime.getRuntime().exec(cmd);
		System.out.println("  "+cmd+"  command executed ");
		
	}

	
	
}
