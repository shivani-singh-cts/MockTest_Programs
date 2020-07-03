package com.mock.test;

public class SearchInRotatedArray {

	static int findKey(int[] arr, int key) {
		int rotationStartPoint = -1; 
		for(int i = 1; i< arr.length; i++) {
			if(arr[i-1] > arr[i]) {
				rotationStartPoint = i-1;
				break;
			}
		}
		
		if(rotationStartPoint == -1)
			return binarySearch(arr, 0, arr.length - 1, key);
		if(arr[rotationStartPoint] == key)
			return rotationStartPoint;
		if(arr[0] <= key)
			return binarySearch(arr, 0, rotationStartPoint -1, key);
		else
			return binarySearch(arr, rotationStartPoint +1, arr.length -1, key);
	}
	static int binarySearch(int[] arr, int start, int end, int x){
		if(start == end) {
			if(arr[start] == x)
				return start;
			else
				return -1;
		}
		else {
			int mid = (start + end)/2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] < x)
				return binarySearch(arr, mid+1, end, x);
			else
				return binarySearch(arr, start, mid-1, x);
		}
	}
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key = 3;
		int index = findKey(arr, key);
		if(index != -1) 
			System.out.println("Element found at index: "+ index);
		else
			System.out.println("Element not found in the array");
	
	}

}
