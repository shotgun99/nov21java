package com.ss.jb.three;

public class SynchronizationExample {

	public static void main(String[] args) {
		MyThreadC t1 = new MyThreadC();
		t1.start();
		
		Runnable myRunnable = new MyThreadI();
		Thread t2 = new Thread(myRunnable);
		t2.start();
	}

}
