package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TripletSumInArrayTest {

	@Test
	void test() {
		int[] arr = {12, 3, 4, 1, 6, 9};
		assertTrue(TripletSumInArray.findTriplet(arr, 24));
	}
	
	@Test
	void testFalseOutput() {
		int[] arr = {1,2,3,4,5,6};
		assertFalse(TripletSumInArray.findTriplet(arr, 25));
	}

	@Test
	void testNullInput() {
		assertThrows(NullPointerException.class, () -> TripletSumInArray.findTriplet(null, 10));
	}
}
