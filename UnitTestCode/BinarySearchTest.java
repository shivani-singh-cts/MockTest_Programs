package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void test() {
		int[] arr = {2, 3, 6, 8, 10, 13};
		assertEquals(4, BinarySearch.binarySearch(arr, 0, arr.length - 1, 10));
	}
	
	@Test
	void testElementAbsent() {
		int[] arr = {2, 3, 6, 8, 10, 13};
		assertEquals(-1, BinarySearch.binarySearch(arr, 0, arr.length - 1, 12));
	}
	
	@Test
	void testNullInputArray() {
		int[] arr = null;
		assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(arr, 0, arr.length - 1, 0));
	}
}
