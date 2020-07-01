package com.mock.test;

import java.util.Arrays;

public class KthLargestSmallest {

	static int getKthSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
	
	static int getKthLargestElement(int[] arr, int k) {
		Arrays.sort(arr);
		int n = arr.length;
		return arr[n - k];
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 3, 4, 5, 2, 0, 1};
		int k = 3;
		System.out.println(k + "th Smallest Element: " + getKthSmallestElement(arr, k));
		System.out.println(k + "th Largest Element: " + getKthLargestElement(arr, k));
	}

}
