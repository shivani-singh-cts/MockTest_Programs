package com.mock.test;

import java.util.Arrays;

public class MissingInteger {

	static int findMissingInteger(int[] arr) {
		int n = arr.length;
		int sumOfNelements = ((n+1)*(n+2))/2;
		
		int sumOfArr = Arrays.stream(arr).sum();
		
		int missingNum = sumOfNelements - sumOfArr;
		return missingNum;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5};
		System.out.println("The missing number is: "+ findMissingInteger(arr));

	}
}
