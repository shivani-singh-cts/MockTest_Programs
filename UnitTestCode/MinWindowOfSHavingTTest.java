package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinWindowOfSHavingTTest {

	@Test
	void test() {
		assertEquals("BANC", MinWindowOfSHavingT.findMinWindow("ADOBECODEBANC", "ABC"));
	}
	
	@Test
	void testEmptyInput() {
		assertEquals("", MinWindowOfSHavingT.findMinWindow("ADOBECODEBANC", ""));
	}
}
