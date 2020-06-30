package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BracketStringValidationTest {

	@Test
	void testValidInput() {
		assertTrue(BracketStringValidation.isStringValid("[()]{}{[()()]()}"));
	}

	@Test
	void testInvalidInput() {
		assertFalse(BracketStringValidation.isStringValid("[()"));
	}
	
	@Test
	void testEmptyInput() {
		assertTrue(BracketStringValidation.isStringValid(""));
	}
	
	@Test
	void testNullInput() {
		assertFalse(() -> BracketStringValidation.isStringValid(null));
	}
}
