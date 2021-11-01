/**
 * This is an intro class for Java Basics
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class HelloWorld {

//	//default constructor that all classes have
	public HelloWorld() {
		System.out.println("Default constructor called");
	}
	
	public HelloWorld(Integer i) {
		System.out.println("Constructor called with Integer");
	}
	
	public HelloWorld(String s) {
		System.out.println("Constructor called with String");
	}
	
	public HelloWorld(Integer i, String s) {
		System.out.println("Constructor called string & int");
	}
	
	private String name = "JOHN DOE";			
	public String globalVar = "NOV 21";
	public final String trainer = "Pramod";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticExample se1 = new StaticExample();
		se1.printInstanceCount();
		
		StaticExample se2 = new StaticExample();
		se2.printInstanceCount();
		
		
		StaticExample.printInstanceCount();
	}
	
	public void runPublic() {
		String localVar = "NOV 21 method";
		System.out.println("Running from public method");
	}

	private void runPrivate() {
		System.out.println("Running from private method");
	}
	
	protected void runProtected() {
		System.out.println("Running from protected method");
	}
	
	void runDefault() {
		System.out.println("Running from default method");
	}

}
