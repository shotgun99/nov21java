package com.ss.jb.two;

public class Galaxy implements SmartPhoneInt, AndroidInt{

	@Override
	public void defineOS() {
		System.out.println("My OWN OS");
		SmartPhoneInt.utilityFunc();
	}

	@Override
	public Long defineMemory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float defineCamera() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float defineGPS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void multiWindowFunc() {
		// TODO Auto-generated method stub
		AndroidInt.super.multiWindowFunc();
	}

}
