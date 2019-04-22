package com.bridgelabz.designPattern.ProxyPattern;

public class CommandExecutorProxy implements CommedExecutor {

	
	private boolean isAdmin;
	private CommedExecutor executor;
	
	CommandExecutorProxy(String user,String pwd)
	{
		if("shreyas".equals(user) && "shreyas".equals(pwd))
		{
			isAdmin=true;
			executor=new CommandExecutorImpl();
		}
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not allowed for non admin users");
			}else
			{
				executor.runCommand(cmd);
			}
		}
	}

}
