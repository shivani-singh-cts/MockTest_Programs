package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseVowelsTest {

	@Test
	void test() {
		assertEquals("hilla vone", ReverseVowels.reverseVowels("hello vani"));
	}

	@Test
	void testEmptyInput() {
		assertEquals("", ReverseVowels.reverseVowels(""));
	}

}
