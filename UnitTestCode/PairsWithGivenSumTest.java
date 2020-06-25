package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairsWithGivenSumTest {

	@Test
	void test() {
		String expected = "(1, 5)(7, -1)(1, 5)";
		int[] arr = {1, 5, 7, -1, 5};
		assertEquals(expected, PairsWithGivenSum.printAllPairs(arr, 6));
	}

	@Test
	void test2() {
		String expected = "(2, 5)";
		int[] arr = {2, 5, 17, -1};
		assertEquals(expected, PairsWithGivenSum.printAllPairs(arr, 7));
	}
	
	@Test
	void testNullArr() {
		assertThrows(NullPointerException.class, () -> PairsWithGivenSum.printAllPairs(null, 0));
	}
}
