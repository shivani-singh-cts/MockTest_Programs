package com.mock.test;

import java.util.HashSet;

public class SpecialNumber {
	
	static int sum_square(int num) {
		int sum = 0;
		int digit;
		while(num != 0) {
			digit = num % 10;
			sum = sum + (digit * digit);
			num = num/10;
		}
		return sum;
	}
	static boolean checkIfSpecial(int n) {
		HashSet<Integer> set = new HashSet<>();
		set.add(n);
		int sum = sum_square(n);
		while(sum != 1) {
			sum = sum_square(sum);
			if(set.contains(sum))
				return false;
			else
				set.add(sum);
		}
		return true;
	}
	public static void main(String[] args) {
		int num = 5;
		boolean isSpecial = checkIfSpecial(num);
		if(isSpecial)
			System.out.println(num + " IS a special number");
		else
			System.out.println(num + " IS NOT a special number");
	}

}
