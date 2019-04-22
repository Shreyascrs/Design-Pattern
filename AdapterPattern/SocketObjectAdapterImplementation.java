package com.bridgelabz.designPattern.AdapterPattern;

public class SocketObjectAdapterImplementation implements SocketAdaptor {

	private Socket socket=new Socket();
	@Override
	public Volt get120volt() {
		// TODO Auto-generated method stub
		
		return socket.getVolt();
	}

	@Override
	public Volt get12volt() {
		// TODO Auto-generated method stub
		Volt v=socket.getVolt();
		return convertVolt(v,10);
	}

	

	@Override
	public Volt get3volt() {
		// TODO Auto-generated method stu
		Volt v=socket.getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		
		return new Volt(v.getVolt()/i);
	}
}
