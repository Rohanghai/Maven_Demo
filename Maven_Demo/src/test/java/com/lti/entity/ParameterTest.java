package com.lti.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterTest {
	


	@ParameterizedTest
	@ValueSource(ints= {10,20,40,50,100})
	public void testArray(int arg) {
		System.out.println("arg : "+arg);
		Assertions.assertTrue(arg%2==0);
	
	}

	@ParameterizedTest(name="#{index}= {0}")
	@DisplayName("Should pass all non-null arguments to method")
	@ValueSource(strings= {"Hello","Hello World","Hello GET 1024"})
	public void testParameter(String msg) {
		String searchKey = "Hello";
		
		Assertions.assertTrue(msg.contains(searchKey));
		
	}
	
	//eg: login code to be repeated thrice
	
	@RepeatedTest(3)
	public void shouldRepeat() {
		int x=10, y=20;
		assertEquals(200,x*y);
	}
	
	@Test
	public void testLambda()
	{
		Integer[] intAry= {2,3,7,5,10};
		List<Integer> numbers= Arrays.asList(intAry);
		Assertions.assertAll(
				() -> assertEquals(2,numbers.get(0)) ,				
				() -> assertEquals(3,numbers.get(1)) ,
				() -> assertEquals(7,numbers.get(2)) ,
				() -> assertEquals(5,numbers.get(3)) ,
				() -> assertEquals(10,numbers.get(4)) 				
				);	
	}
}
