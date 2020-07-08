package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharacterTest {

	@Test
	void test() {
		assertEquals(3, LongestSubstringWithoutRepeatingCharacter.findLongestSubstringLength("pwwkew"));
	}
	
	@Test
	void testSameCharInput() {
		assertEquals(1, LongestSubstringWithoutRepeatingCharacter.findLongestSubstringLength("bbbbbbb"));
	}

	@Test
	void testNullInput() {
		assertThrows(NullPointerException.class, () -> LongestSubstringWithoutRepeatingCharacter.findLongestSubstringLength(null));
	}
}
