package com.mock.test;

public class MoveZeroesToArrayEnd {

	static int[] moveZeroesToEnd(int[] arr) {
		int n = arr.length;
		int temp;
		int j = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 0, 0, 3, 6};
		System.out.println("After shifting zeroes: ");
		int[] shiftedArr = moveZeroesToEnd(arr);
		for(int x: shiftedArr)	
			System.out.print(x + " ");
	}

}
// 1 2 3 6 000