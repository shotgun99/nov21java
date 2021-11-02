package com.ss.jb.two;

import java.io.FileInputStream;

public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo exDemo = new ExceptionDemo();
		System.out.println(exDemo.compareStr(null, null));
		Integer wrapInt = 10;
		int primInt = 20;
		primInt = wrapInt;
		wrapInt = primInt;
		//autoboxing & unboxing
	}

	public Boolean compareStr(String str) {
		if ("MAGIC WORD".equals(str)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Boolean compareStr(String str, String strTwo) {
		try {
			FileInputStream fis = new FileInputStream("somefile.txt");
			if (strTwo.equals(str)) {
				return Boolean.TRUE;
			}
			System.out.println("No exception");
			return Boolean.FALSE;
//		} catch (NullPointerException npe) {
//			return null;
//		} catch (FileNotFoundException fnfe) {
//			return null;
//		}
		}catch (Exception e) {
			System.out.println("Hit an exception");
			return null;
		} finally {
			System.out.println("I am inevitable");
		}
	}

}
