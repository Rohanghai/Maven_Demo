package com.lti.entity;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator c= new Calculator();
	
	@Test
	public void testAdd() {
		int r = c.add(100,200);
										//Expecting, actual, optional message
		Assertions.assertEquals(300,r," checked add method");	
	
	}
	
	@Test
	public void testAssertFalse() {
		Assertions.assertEquals("Hello", "Hello");
        Assertions.assertFalse("Rohan".length()==6);
        Assertions.assertFalse(10>20, "10 is not greater than 20");
	}
	
	@Test
	public void testAssertNull() {
		String str1=null;
		String str2="abc";
		
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	
	@Test
	public void testarrayList() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
		myList.add(100);
		myList.add(2100);
		Assertions.assertEquals(2, myList.size());
	}
}
