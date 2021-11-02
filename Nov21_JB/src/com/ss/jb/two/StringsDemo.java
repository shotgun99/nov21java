package com.ss.jb.two;

import java.util.GregorianCalendar;

//import java.util.*; //loads all classes within that package.

public class StringsDemo {

	public static void main(String[] args) {
		String name = "Julius";
		
		
		long startMem = Runtime.getRuntime().freeMemory();
		long startTime = new GregorianCalendar().getTimeInMillis();
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<100000; i++) {
			sb.append("||").append(i);
		}
		long endTime = new GregorianCalendar().getTimeInMillis();
		long endMem = Runtime.getRuntime().freeMemory();
		
		System.out.println("Total Time: "+(endTime - startTime));
		System.out.println("Total Mem User: "+(startMem - endMem));
	}

}
