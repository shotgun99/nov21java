package com.ss.jb.two;

public abstract class SmartPhoneAbs {
	
	public SmartPhoneAbs() {
		System.out.println("Constructor inside a Abs Class which cannot be instantiated??");
	}

	abstract public void defineOS();

	abstract public Long defineMemory();

	abstract public Float defineCamera();

	public Float defineGPS() {
		return null;
	}
}
