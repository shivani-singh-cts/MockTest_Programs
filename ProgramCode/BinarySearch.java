package com.mock.test;

public class BinarySearch {

	static int binarySearch(int[] arr, int low, int high, int x) {
		if(low == high) {
			if(arr[low] == x)
				return low;
			else
				return -1;
		}
		else {
			int mid = (low + high)/2;
			if(x == arr[mid])
				return mid;
			else if(x > arr[mid])
				return binarySearch(arr, mid+1, high, x);
			else
				return binarySearch(arr, low, mid -1, x);
		}
	}
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 20};
		int x = 5;
		int index = binarySearch(arr, 0, arr.length - 1, x);
		if(index != -1)
			System.out.println("Element "+ x +" is present at index: "+ index);
		else
			System.out.println("Given element NOT found.");
	}

}
