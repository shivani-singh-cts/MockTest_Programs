package com.mock.test;

public class CountSquaresInChessboard {

	static int getNumberOfSquares(int n) {
		//1^2 + 2^2 + 3^2 + 4^2 +... + n^2 = n(n+1)(2n+1)/6
		return (n*(n+1)*((2*n)+1))/6;
	}
	public static void main(String[] args) {
		int n = 8;
		System.out.println("Total number of squares is: " + getNumberOfSquares(n));

	}

}
