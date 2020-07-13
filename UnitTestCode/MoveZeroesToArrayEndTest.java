package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoveZeroesToArrayEndTest {

	@Test
	void test() {
		int[] expected = {1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0, 0};
		int[] actual = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		assertArrayEquals(expected, MoveZeroesToArrayEnd.moveZeroesToEnd(actual));
	}

	@Test
	void testNoZeroInput() {
		int actual[] = {1,2,3,4,5,6};
		assertArrayEquals(actual, MoveZeroesToArrayEnd.moveZeroesToEnd(actual));
	}
	
	@Test
	void testNullInput() {
		int actual[] = null;
		assertThrows(NullPointerException.class, () -> MoveZeroesToArrayEnd.moveZeroesToEnd(actual));
	}
	
}
