package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrangeToGetLargestNumberTest {

	ArrangeToGetLargestNumber obj = new ArrangeToGetLargestNumber();
	
	@Test
	void test() {
		int[] arr = {3,30,34,5,9};
		assertEquals("9534330", obj.findLargestNumber(arr));
	}
	
	@Test
	void testNullInput() {
		int[] arr = null;
		assertThrows(NullPointerException.class, () -> obj.findLargestNumber(arr));
	}
}
