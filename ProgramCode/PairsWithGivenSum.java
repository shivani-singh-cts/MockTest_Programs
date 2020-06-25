package com.mock.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairsWithGivenSum {

	/*static String printAllPairs(int[] arr, int sum) {
		String str = "";
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					str = str + "(" + arr[i] + ", " + arr[j] +")" ;
				}
			}
		}
		return str;
	}*/
	
	static String printAllPairs(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		String str = "";
		
		for(int i =0; i< arr.length; i++) {
			if(map.containsKey(sum - arr[i]))
				str = str + "(" + arr[map.get(sum - arr[i])] + ", " + arr[i] +")" ;
			map.put(arr[i], i);
		}
		return str;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 17, -1};
		int sum = 7;
		
		System.out.println(printAllPairs(arr, sum));
	}

}
