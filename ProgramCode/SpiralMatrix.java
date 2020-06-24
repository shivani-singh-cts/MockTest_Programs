package com.mock.test;

public class SpiralMatrix {

	static String getSpiralMatrix(int[][] mat, int row, int col) {
		int x=0, y=0;
		int i;
		String spiralForm = "";
		while(x < row && y < col) {
			//1st row
			for(i =y; i< col; i++) {
				spiralForm += mat[x][i];
				spiralForm += " ";
			}
			x++;
			
			//last col
			for(i=x; i<row; i++) {
				spiralForm += mat[i][col - 1];
				spiralForm += " ";
			}
			col--;
			
			//last row
			if(x < row) {
				for(i = col-1; i >= y; i--) {
					spiralForm += mat[row-1][i];
					spiralForm += " ";
				}
				row--;
			}
			//first col
			if(y < col) {
				for(i = row-1; i >= x; i--) {
					spiralForm += mat[i][y];
					spiralForm += " ";
				}
				y++;
			}
		}
		return spiralForm;
	}
	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		int matrix[][] = { {1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15, 16}};
		System.out.println("Matrix in spiral form is:\n" + getSpiralMatrix(matrix, row, col));
	}

}
