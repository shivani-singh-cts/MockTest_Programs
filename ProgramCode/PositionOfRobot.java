package com.mock.test;

class Coordinates {
	int x;
	int y;
	Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class PositionOfRobot {

	Coordinates moveTheRobot(String input) {
		Coordinates pos = new Coordinates(0, 0);
		
		for(int i = 0; i< input.length(); i++) {
			if(input.charAt(i) == 'U')
				pos.y +=1;
			else if(input.charAt(i) == 'D')
				pos.y -=1;
			else if(input.charAt(i) == 'L')
				pos.x -=1;
			else if(input.charAt(i) == 'R')
				pos.x +=1;
			else
				continue;
		}
		
		return pos;
	}
	public static void main(String[] args) {
		
		String inputMovement = "UP LEFT 2xDOWN RIGHT RIGHT UP UP";
		PositionOfRobot robo = new PositionOfRobot();
		Coordinates roboPosition = robo.moveTheRobot(inputMovement);
		System.out.println("Final position of Robot is: (" + roboPosition.x +", " + roboPosition.y +")");
	}

}
