package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCMOfTwoNumbersTest {

	@Test
	void test1() {
		assertEquals(35, LCMOfTwoNumbers.calculateLCM(7, 5));
	}
	
	@Test
	void test2() {
		assertEquals(6, LCMOfTwoNumbers.calculateLCM(6, 2));
	}
	
	@Test
	void testZeroInput() {
		assertThrows(ArithmeticException.class, () -> LCMOfTwoNumbers.calculateLCM(6, 0));
	}
}
