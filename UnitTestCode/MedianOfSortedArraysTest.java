package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianOfSortedArraysTest {

	@Test
	void test() {
		int[] arr1 = {1, 12, 15, 26, 38};
		int[] arr2 = {2, 13, 24};
		assertEquals(14D, MedianOfSortedArrays.findMedian(arr1, arr2));
	}
	
	@Test
	void testEmptyArray() {
		int[] arr1 = {};
		int[] arr2 = {2, 13, 24};
		assertEquals(13D, MedianOfSortedArrays.findMedian(arr1, arr2));
	}
	
}
