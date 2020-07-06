package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionOfRobotTest {

	PositionOfRobot robo = new PositionOfRobot();
	@Test
	void test() {
		String expected = "(-2, 2)";
		Coordinates actual = robo.moveTheRobot("ULLLDUDUURLRLR");
		String actualStr = "(" + actual.x + ", " +actual.y + ")";
		assertEquals(expected, actualStr);
	}

	@Test
	void testNullInput() {
		assertThrows(NullPointerException.class, () -> robo.moveTheRobot(null));
	}
}
