package com.mock.test;

public class LCMOfTwoNumbers {

	static int calculateLCM(int a, int b) {
		int max = Math.max(a, b);
		int inc = max;
		int lcm = -1;
		
		while(a != 0) {
			if((max % a == 0) && (max % b == 0)) {
				lcm = max;
				break;
			}
			max += inc;
		}
		return lcm;
	}
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println("LCM of "+ a+ " and " +b + " = " + calculateLCM(a,b));
	}

}
