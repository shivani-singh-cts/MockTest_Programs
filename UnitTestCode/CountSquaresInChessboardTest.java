package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountSquaresInChessboardTest {

	@Test
	void test() {
		assertEquals(204, CountSquaresInChessboard.getNumberOfSquares(8));
	}

	@Test
	void test2() {
		assertEquals(14, CountSquaresInChessboard.getNumberOfSquares(3));
	}

}
