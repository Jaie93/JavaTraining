package com.yash.TDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinaryEquivalent {
	
	FindBinaryEquivalent binary = new FindBinaryEquivalent();
	@Test
	public void testBianryEquivalentfor3()
	{
		assertEquals(binary.findBinaryEquivalent(3), "0011");
	}

	@Test
	public void testBianryEquivalentfor8()
	{
		assertEquals(binary.findBinaryEquivalent(8), "1000");
	}
}
