package com.yash.TDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSumOfNumbersDivisibleBy7 {
	
	AddNumbersDivisibleBy7 t= new AddNumbersDivisibleBy7();
	@Test
	public void test_TestSumOfNumbers1()
	{
		assertEquals(t.add(), 500);
	}
	
	@Test
	public void test_TestSumOfNumbers2()
	{
		assertEquals(t.add(), 2107);
	}
	

}
