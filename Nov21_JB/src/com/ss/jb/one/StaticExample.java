/**
 * 
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class StaticExample {
	
	public static int instanceCount = 0;

	public StaticExample() {
		instanceCount++;
	}

	public static void printInstanceCount() {
		System.out.println("# of instances created: "+instanceCount);
	}
}
