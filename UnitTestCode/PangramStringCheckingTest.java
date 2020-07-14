package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PangramStringCheckingTest {

	@Test
	void test() {
		assertTrue(PangramStringChecking.checkPangram("We promptly judged antique ivory buckles for the next prize"));
	}

	@Test
	void testEmptyInput() {
		assertFalse(PangramStringChecking.checkPangram(""));
	}
	
	@Test
	void testNonPangramString() {
		assertFalse(PangramStringChecking.checkPangram("there is a tree"));
	}
	
	@Test
	void testNullInput() {
		assertThrows(NullPointerException.class, () -> PangramStringChecking.checkPangram(null));
	}
}
