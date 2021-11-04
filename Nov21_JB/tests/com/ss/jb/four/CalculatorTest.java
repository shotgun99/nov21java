package com.ss.jb.four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	
	@Test
	public void addTwoNumberTest() {
		assertEquals(new Integer(4), calc.add(2, 2));
		assertNotEquals(new Integer(4), calc.add(3, 2));
	}
	
	@Test
	public void addThreeNumberTest() {
		assertEquals(new Integer(6), calc.add(2, 2, 2));
		assertNotEquals(new Integer(6), calc.add(3, 2, 2));
	}
	
	@Test
	public void subTwoNumberTest() {
		assertEquals(new Integer(0), calc.sub(2, 2));
		assertNotEquals(new Integer(4), calc.sub(3, 2));
	}
	
	@Test
	public void subThreeNumberTest() {
		assertEquals(new Integer(0), calc.sub(4, 2, 2));
		assertNotEquals(new Integer(6), calc.sub(3, 2, 2));
	}

}

