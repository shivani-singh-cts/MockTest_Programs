package com.mock.test;

public class MatrixTranspose {

	static int[][] transposeMatrix(int[][] matrix, int r, int c) {
		int[][] output = new int[c][r];
		for(int i = 0; i< c; i++) {
			for(int j =0; j< r; j++)
				output[i][j] = matrix[j][i];
		}
		return output;
	}
	static void displayMatrix(int[][] matrix, int r, int c) {
		for(int i = 0; i< r; i++) {
			for(int j = 0; j< c; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		//int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; 
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		System.out.println("Given Matrix is: ");
		displayMatrix(matrix, row, col);
		
		System.out.println("Transpose of Matrix is: ");
		int[][] transpose = new int[col][row];
		transpose =	transposeMatrix(matrix, row, col);
		displayMatrix(transpose, transpose.length, transpose[0].length);
	}

}
