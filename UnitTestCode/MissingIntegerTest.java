package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingIntegerTest {

	@Test
	void testSortedInput() {
		int[] arr = {1,2,3,5};
		assertEquals(4, MissingInteger.findMissingInteger(arr));
	}
	
	@Test
	void testUnsortedInput() {
		int[] arr = {1, 2, 4, 6, 3, 7, 8};
		assertEquals(5, MissingInteger.findMissingInteger(arr));
	}

	@Test
	void testNullInput() {
		int[] arr = null;
		assertThrows(NullPointerException.class, () -> MissingInteger.findMissingInteger(arr));
	}
}
