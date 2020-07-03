package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInRotatedArrayTest {

	@Test
	void test() {
		int[] arr = {30, 40, 50, 10, 20};
		assertEquals(3,SearchInRotatedArray.findKey(arr, 10));
	}

	@Test
	void testKeyNotFound() {
		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		assertEquals(-1,SearchInRotatedArray.findKey(arr, 30));
	}
	
	@Test
	void testArrayNotRotated() {
		int[] arr = {5, 6, 7, 8, 9, 10, 11, 12};
		assertEquals(4, SearchInRotatedArray.findKey(arr, 9));
	}
	
	@Test
	void testNullInput() {
		assertThrows(NullPointerException.class, () -> SearchInRotatedArray.findKey(null, 10));
	}
}
