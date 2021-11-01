/**
 * This is an intro class for Java Basics
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class AccessModifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld(10, "John");
		hw.runPublic();
//		hw.runPrivate();
		hw.runProtected();
//		hw.globalVar;
	}
}
