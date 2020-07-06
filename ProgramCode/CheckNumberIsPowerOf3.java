package com.mock.test;

public class CheckNumberIsPowerOf3 {

	static boolean checkPowerOf3(int num) {
		while(num != 0 && num % 3 == 0) {
			num = num/3;
		}
		if(num == 1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		int num = 27;
		boolean result = checkPowerOf3(num);
		if(result)
			System.out.println(num + " is a power of 3");
		else
			System.out.println(num + " is not a power of 3");
	}

}
