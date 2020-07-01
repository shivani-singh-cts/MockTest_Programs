package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthLargestSmallestTest {

	@Test
	void test() {
		int[] arr = {10, 3, 4, 5, 2, 0, 1};
		assertEquals(2, KthLargestSmallest.getKthSmallestElement(arr, 3));
		assertEquals(4, KthLargestSmallest.getKthLargestElement(arr, 3));
	}

	@Test
	void testNullInput() {
		int[] arr = null;
		assertThrows(NullPointerException.class, () -> KthLargestSmallest.getKthSmallestElement(arr, 2));
		assertThrows(NullPointerException.class, () -> KthLargestSmallest.getKthSmallestElement(arr, 2));
	}
}
