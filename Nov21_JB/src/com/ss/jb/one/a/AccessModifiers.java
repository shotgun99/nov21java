/**
 * This is an intro class for Java Basics
 */
package com.ss.jb.one.a;

import com.ss.jb.one.HelloWorld;

/**
 * @author ppradhan
 *
 */
public class AccessModifiers extends HelloWorld{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		am.runPublic();
		am.runProtected();
//		am.run
	}
}
