package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpecialNumberTest {

	@Test
	void test() {
		assertTrue(SpecialNumber.checkIfSpecial(19));
		assertTrue(SpecialNumber.checkIfSpecial(7));
	}
	
	@Test
	void testNegativeCase() {
		assertFalse(SpecialNumber.checkIfSpecial(4));
	}
	
	@Test
	void testZeroCase() {
		assertFalse(SpecialNumber.checkIfSpecial(0));
	}

}
