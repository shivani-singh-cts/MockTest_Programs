package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InitialsOfNameTest {

	@Test
	void test() {
		assertEquals("P K S", InitialsOfName.getInitialsOfName("prabhat kumar singh"));
	}

	@Test
	void testMultipleSpacesInInput() {
		assertEquals("J G", InitialsOfName.getInitialsOfName("Judy    Geller "));
	}
	
	@Test
	void testEmptyInput() {
		assertEquals("", InitialsOfName.getInitialsOfName(""));
	}
	
	@Test
	void testNullInput() {
		assertThrows(NullPointerException.class, () -> InitialsOfName.getInitialsOfName(null));
	}
}
