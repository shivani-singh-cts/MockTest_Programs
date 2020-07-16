package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RelativeSortArrayTest {

	@Test
	void test() {
		int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
		int arr2[] = {2,1,4,3,9,6};
		int expected[] = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
		assertArrayEquals(expected, RelativeSortArray.relativeSort(arr1, arr2));
	}

	@Test
	void test2() {
		int arr1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 }; 
		int arr2[] = {2, 1, 8, 3 };
		int expected[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9};
		assertArrayEquals(expected, RelativeSortArray.relativeSort(arr1, arr2));
	}

}
