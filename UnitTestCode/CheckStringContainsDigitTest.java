package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CheckStringContainsDigitTest {

	@Test
	void test() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("111");
		expected.add("1000");
		assertEquals(expected, CheckStringContainsDigit.convertStringDigitToBinary("jay7CTS8"));
	}
	
	@Test
	void testNoDigitInInput() {
		ArrayList<String> expected = new ArrayList<String>();
		assertEquals(expected, CheckStringContainsDigit.convertStringDigitToBinary("vani"));
	}
	
	@Test
	void testEmptyInput() {
		ArrayList<String> expected = new ArrayList<String>();
		assertEquals(expected, CheckStringContainsDigit.convertStringDigitToBinary(""));
	}
	
	@Test
	void testNullInput() {
		assertThrows(NullPointerException.class, ()-> CheckStringContainsDigit.convertStringDigitToBinary(null)); 
	}
}
