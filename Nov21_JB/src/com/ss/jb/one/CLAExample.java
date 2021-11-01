/**
 * This is an intro class for Java Basics
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class CLAExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for(int i=0; i<=args.length(); i++) {
//			
//		}
		System.out.println("# of CLA: "+args.length);
		for(String s: args) {
			System.out.println(s);
		}
	}
}
