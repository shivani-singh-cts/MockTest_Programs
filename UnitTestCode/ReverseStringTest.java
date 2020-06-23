package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		assertEquals(Optional.of("cb@a"), ReverseString.reverse("ab@c"));
	}
	
	@Test
	void testNull() {
		Optional<String> expected = Optional.empty();
		assertEquals(expected, ReverseString.reverse(null));
	}
	
	@Test
	void testEmptyInput() {
		assertEquals(Optional.of(""), ReverseString.reverse(""));
	}

}
