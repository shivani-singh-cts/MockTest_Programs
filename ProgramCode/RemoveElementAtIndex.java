package com.mock.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElementAtIndex {

	static int[] removeFromIndex(int[] arr, int index) {
		if(arr == null || index < 0 || index > (arr.length -1))
			return arr;
		
		return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 9, 0};
		int i = 2;
		System.out.println("Original array is: "+ Arrays.toString(arr));
		arr = removeFromIndex(arr, i);
		
		System.out.println("Array after removing element is: " + Arrays.toString(arr));
	}

}
