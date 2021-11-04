package com.ss.jb.four;

public class FuncIntDemo{

	public static void main(String[] args) {
		Increment inc = (i) -> i+1;
		
		Increment incFull = (b) -> {
			System.out.println("Full imple");
			return b+2;
		};

	}

//	@Override
//	public Integer increment(Integer i) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
