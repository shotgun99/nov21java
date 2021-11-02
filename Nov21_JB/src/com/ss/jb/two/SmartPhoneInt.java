package com.ss.jb.two;

public interface SmartPhoneInt {

	public void defineOS();

	public Long defineMemory();

	public Float defineCamera();
	
	public Float defineGPS();
	
	default public void multiWindowFunc() {
		System.out.println("Def method for Multi Win Func");
	}
	
	static public void utilityFunc() {
		System.out.println("Def method for Utility Func");
	}
}
