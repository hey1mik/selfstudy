package com.hey1.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int result = cal.add(2, 3);
		assertEquals(5,result);
	}
	
	@Test
	public void testSubstract() {
		int result = cal.substract(5,3);
		assertEquals(2,result);
	}

}
