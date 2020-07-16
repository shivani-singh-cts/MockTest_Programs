package com.mock.test;

import java.util.Arrays;

public class RelativeSortArray {

	static int binaryFindFirst(int[] arr, int low, int high, int x) {
		if(high >= low) {
			int mid = low + (high - low) /2;
			if((mid ==0 || x > arr[mid -1]) && arr[mid] == x)
				return mid;
			else if(x > arr[mid])
				return binaryFindFirst(arr, mid+1, high, x);
			else
				return binaryFindFirst(arr, low, mid-1, x);
		}
		return -1;
	}
	static int[] relativeSort(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] temp = new int[m];
		int[] flag = new int[m];
		
		int[] result = new int[m]; 
		for(int i=0;i< m; i++) {
			temp[i] = arr1[i];
			flag[i] = 0;
		}
		Arrays.sort(temp);
		
		int index = 0;
		
		for(int i =0; i<n ; i++) {
			int pos = binaryFindFirst(temp, 0, m-1, arr2[i]);
			if(pos == -1)
				continue;
			
			for(int j = pos; (j< m && temp[j] == arr2[i]); j++) {
				result[index++] = temp[j];
				flag[j] = 1;
			}
		}
		
		//Copy rest of elements of array1
		for(int i=0; i< m; i++) {
			if(flag[i] == 0)
				result[index++] = temp[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		
		int sortedArr[] = relativeSort(arr1, arr2);
		for(int x: sortedArr)
			System.out.print(x + " ");

	}

}
