package com.mock.test;

public class MedianOfSortedArrays {

	static double findMedian(int[] arr1, int[] arr2) {
		int i =0, j = 0;
		int n = arr1.length;
		int m = arr2.length;
		double m1 = -1D, m2 = -1D;
		//Odd case
		if((n+m) % 2 != 0) {
			for(int k= 0; k<= (n+m)/2; k++) {
				if(i != n && j != m) {
					if(arr1[i] > arr2[j]) {
						m1 = arr2[j++];
					}
					else
						m1 = arr1[i++];
				}
				else if(i< n) 
					m1 = arr1[i++];
				else
					m1 = arr2[j++];
			}
			return m1;
		}
		else {
			for(int k= 0; k<= (n+m)/2; k++) {
				m2 = m1;
				if(i != n && j != m) {
					if(arr1[i] > arr2[j]) {
						m1 = arr2[j++];
					}
					else
						m1 = arr1[i++];
				}
				else if(i< n) 
					m1 = arr1[i++];
				else
					m1 = arr2[j++];
			}
			return (m1+m2)/2;
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1};
		int[] arr2 = {2, 13, 24};
		
		System.out.println("Median of arrays are: " + findMedian(arr1, arr2));
	}

}
