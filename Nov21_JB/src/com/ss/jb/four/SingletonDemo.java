package com.ss.jb.four;

public class SingletonDemo {

	volatile static SingletonDemo instance = null;

	private SingletonDemo() {

	}

	public SingletonDemo getInstance() {
		synchronized (instance) {
			if (instance == null) {
				instance = new SingletonDemo();
			}
		}
		return instance;
	}

}
