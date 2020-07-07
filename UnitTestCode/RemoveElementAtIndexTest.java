package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveElementAtIndexTest {

	@Test
	void test() {
		int[] arr = {3, 6, 9, 12, 15, 20, 21};
		int[] expected = {3, 6, 9, 12, 15, 21};
		assertArrayEquals(expected, RemoveElementAtIndex.removeFromIndex(arr, 5));
	}
	
	@Test
	void testInvalidIndex() {
		int[] arr = {3, 6, 9, 12, 15, 20, 21};
		//int[] expected = {3, 6, 9, 12, 15, 20, 21};
		assertArrayEquals(arr, RemoveElementAtIndex.removeFromIndex(arr, 10));
	}
	
	@Test
	void testNullArrInput() {
		int[] arr = null;
		assertNull(RemoveElementAtIndex.removeFromIndex(arr, 10));
	}
}
