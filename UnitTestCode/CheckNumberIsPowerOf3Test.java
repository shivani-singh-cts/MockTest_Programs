package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckNumberIsPowerOf3Test {

	@Test
	void testTrue() {
		assertTrue(CheckNumberIsPowerOf3.checkPowerOf3(729));
	}

	@Test
	void testFalse() {
		assertFalse(CheckNumberIsPowerOf3.checkPowerOf3(900));
	}
	
	@Test
	void testZeroInput() {
		assertFalse(CheckNumberIsPowerOf3.checkPowerOf3(0));
	}
}
