package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChildrenChairProblemTest {

	@Test
	void test() {
		assertEquals(3, ChildrenChairProblem.findWinnerCircularQ(5, 2));
	}
	
	@Test
	void test2() { 
		assertEquals(2, ChildrenChairProblem.findWinnerCircularQ(14, 2));
	}
	
}
