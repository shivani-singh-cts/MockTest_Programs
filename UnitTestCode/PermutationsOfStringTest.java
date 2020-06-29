package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PermutationsOfStringTest {

	PermutationsOfString permute = new PermutationsOfString();
	
	@Test
	void test() {
		String str ="ABC";
		String[] expectedPermutations = {"ABC", "ACB", "BAC", "BCA", "CBA", "CAB"};
		List<String> expected = Arrays.asList(expectedPermutations);
		assertEquals(expected, permute.getPermutations(str, 0, str.length() -1 ));
	}
	
	@Test
	void testNullInput() {
		String str = null;
		assertThrows(NullPointerException.class, () -> permute.getPermutations(str, 0, 1));
	}

}
