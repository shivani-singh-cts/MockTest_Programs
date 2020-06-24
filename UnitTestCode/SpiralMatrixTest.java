package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpiralMatrixTest {

	@Test
	void test() {
		int[][] mat = { {1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		assertEquals("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 ", SpiralMatrix.getSpiralMatrix(mat, 4, 4));
	}

	@Test
	void testNullCase() {
		int mat[][] = null;
		assertThrows(NullPointerException.class, () -> SpiralMatrix.getSpiralMatrix(mat, 1, 1));
	}
	
	@Test
	void testEmptyCase() {
		int mat[][] = {};
		assertEquals("", SpiralMatrix.getSpiralMatrix(mat, 0, 0));
	}
}
