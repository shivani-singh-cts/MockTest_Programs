package com.mock.test;

import java.util.Arrays;

public class TripletSumInArray {

	static boolean findTriplet(int[] arr, int sum) {
		Arrays.sort(arr);
		int beg, last;
		int size = arr.length;
		for(int i = 0; i < arr.length; i++) {
			beg = i+1;
			last = size -1;
			while(beg < last) {
				if(arr[i] + arr[beg] + arr[last] == sum) {
					System.out.println("Triplet: "+ arr[i] + ", " + arr[beg] + ", " + arr[last]);
					return true;
				}
				else if(arr[i] + arr[beg] + arr[last] < sum)
					beg++;
				else
					last--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 9;
		
		boolean result = findTriplet(arr, sum);
		if(!result)
			System.out.println("No triplet present with sum " + sum);
	}

}
