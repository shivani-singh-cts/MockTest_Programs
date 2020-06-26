package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTransposeTest {

	@Test
	void testSquareMatrix() {
		int[][] matrix = { {1, 1, 1},
				{2, 2, 2},
				{3, 3, 3} }; 
		int[][] expected = {{1,2,3}, {1,2,3}, {1,2,3}};
		assertArrayEquals(expected, MatrixTranspose.transposeMatrix(matrix, 3, 3));
	}
	
	@Test
	void testRectMatrix() {
		int[][] matrix = { {1, 1, 1}, {2, 2, 2}}; 
		int[][] expected = {{1,2}, {1,2}, {1,2}};
		assertArrayEquals(expected, MatrixTranspose.transposeMatrix(matrix, 2, 3));
	}
	
	@Test
	void testNullMatrix() {
		int[][] matrix = null;
		assertThrows(NullPointerException.class, () -> MatrixTranspose.transposeMatrix(matrix, 1, 1));
	}
}
